package ortiz.sound.partitura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.apache.commons.collections.CollectionUtils;

import ortiz.sound.analisador.collections.TempoPredicate;
import ortiz.sound.modelo.NotaMusical;
import ortiz.sound.modelo.NotaMusicalFrequenciaSom;
import ortiz.sound.musicxml.Attributes;
import ortiz.sound.musicxml.DisplayStepOctave;
import ortiz.sound.musicxml.Empty;
import ortiz.sound.musicxml.Key;
import ortiz.sound.musicxml.Note;
import ortiz.sound.musicxml.NoteType;
import ortiz.sound.musicxml.ObjectFactory;
import ortiz.sound.musicxml.PartList;
import ortiz.sound.musicxml.PartName;
import ortiz.sound.musicxml.Pitch;
import ortiz.sound.musicxml.ScorePart;
import ortiz.sound.musicxml.ScorePartwise;
import ortiz.sound.musicxml.ScorePartwise.Part;
import ortiz.sound.musicxml.ScorePartwise.Part.Measure;
import ortiz.sound.musicxml.StartStop;
import ortiz.sound.musicxml.Step;
import ortiz.sound.musicxml.Tie;
import ortiz.sound.musicxml.Time;
import ortiz.sound.musicxml.util.Marshalling;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 10/10/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class GeradorPartituras {
	
	private static final String REGEX_EXTRACAO_NOTAS = "([a-z-A-Z]|PAUSA)(\\#)*";
	private static final NavigableMap<Double, String> MAP_DURACAO_NOTAS;
	private static final BigDecimal UM = BigDecimal.ONE;
	
	private final ObjectFactory factory = new ObjectFactory();

	private Integer numeroCompasso = 0;
	
	static {
		MAP_DURACAO_NOTAS = new TreeMap<Double, String>();
		MAP_DURACAO_NOTAS.put(1.0, "whole");
		
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(2), 2, RoundingMode.HALF_UP).doubleValue(), "half");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(4), 2, RoundingMode.HALF_UP).doubleValue(), "quarter");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(8), 2, RoundingMode.HALF_UP).doubleValue(), "eighth");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(16), 2, RoundingMode.HALF_UP).doubleValue(), "16th");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(32), 2, RoundingMode.HALF_UP).doubleValue(), "32nd");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(64), 2, RoundingMode.HALF_UP).doubleValue(), "64th");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(128), 2, RoundingMode.HALF_UP).doubleValue(), "128th");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(256), 2, RoundingMode.HALF_UP).doubleValue(), "256th");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(512), 2, RoundingMode.HALF_UP).doubleValue(), "512th");
		MAP_DURACAO_NOTAS.put(UM.divide(new BigDecimal(1024), 2, RoundingMode.HALF_UP).doubleValue(), "1024th");
	}
	
	/**
	 * 
	 * <p>
	 * Itera através das frequências no tempo. Gera o arquivo e o armazena no
	 * arquivo selecionado pelo usuário.
	 * </p>
	 * 
	 * @param notasLinhaTempo - Notas musicais no tempo.
	 * @param arquivo - Arquivo utilizado no armazenamento
	 * @throws GeradorPartiturasException - Lançado caso ocorra algum erro.
	 */
	public void gerarPartitura(List<NotaMusicalFrequenciaSom> notasLinhaTempo, File arquivo) throws GeradorPartiturasException {
		
		ScorePartwise scorePartwise = factory.createScorePartwise();
		PartList partlist = factory.createPartList();
		
		scorePartwise.setPartList(partlist);
		
		ScorePart scorePart = factory.createScorePart();
		scorePart.setId("P1");
		
		PartName partName = this.factory.createPartName();
		partName.setValue("Teste Software");
		
		scorePart.setPartName(partName);
		
		partlist.getPartGroupOrScorePart().add(scorePart);
		
		Part part = this.factory.createScorePartwisePart();
		part.setId(scorePart);
		
		double maiorTempoNota = 0.0d;
		double menorTempoNota = Double.MAX_VALUE;
		
		try {
			if ("PAUSA".equals(notasLinhaTempo.get(0).getNota().getNota())) {
				notasLinhaTempo.remove(0);
			}
			
			if ("PAUSA".equals(notasLinhaTempo.get(notasLinhaTempo.size() - 1).getNota().getNota())) {
				notasLinhaTempo.remove(notasLinhaTempo.size() - 1);
			}
		} catch (Exception exc) {
			throw new GeradorPartiturasException("Assobie novamente pois só encontramos silêncios.");
		}
		
		List<NotaMusical> notasMusicais = new ArrayList<NotaMusical>();
		
		for (NotaMusicalFrequenciaSom notaFrequenciaSom : notasLinhaTempo) {
			NotaMusical nota = notaFrequenciaSom.getNota();
			notasMusicais.add(nota);
			double duracaoNota = nota.getDuracao();
			maiorTempoNota = Math.max(maiorTempoNota, duracaoNota);
			menorTempoNota = Math.min(menorTempoNota, duracaoNota);
		}
	
		int tamanhoMaiorRelacaoMenorTempo = new BigDecimal(maiorTempoNota).divide(new BigDecimal(menorTempoNota), 2, RoundingMode.HALF_UP).intValue();

		BigDecimal lnNumerador = new BigDecimal(Math.log(tamanhoMaiorRelacaoMenorTempo));
		BigDecimal lnDenominador = new BigDecimal(Math.log(2));
		BigDecimal log2DivisoesTempo = lnNumerador.divide(lnDenominador, 0, RoundingMode.HALF_UP);
		BigDecimal menorDivisaoNota = new BigDecimal((int) Math.pow(2, log2DivisoesTempo.intValue()));
		
		Pattern pattern = Pattern.compile(REGEX_EXTRACAO_NOTAS);
	    
		BigDecimal medidaCompasso = BigDecimal.ZERO;
		
		/*compasso = criarCompasso("4", Integer.toString(menorDivisaoNota.intValue()));*/
		//TODO VERIFICAR ESSA LOGICA
		Measure compasso = criarCompasso("4", "4");
		part.getMeasure().add(compasso);
		
		List<NotaMusical> notasAposAtual = null;
		
		for (int idx = 0; idx < notasMusicais.size() -1; idx ++) {

			NotaMusical notaMusical = notasMusicais.get(idx);
			
			List<NotaMusical> notasCopiadas = new ArrayList<NotaMusical>(notasMusicais.size());
			notasCopiadas.addAll(notasMusicais);
			notasAposAtual = notasCopiadas.subList(idx + 1,	notasMusicais.size() - 1);
			CollectionUtils.filter(notasAposAtual, new TempoPredicate(notaMusical.getTempoInicial()));
			
			if (notasAposAtual != null && !notasAposAtual.isEmpty()) {
				idx = idx +  notasAposAtual.size();
			}
			
			String nota = notaMusical.getNota();
			int oitava = notaMusical.getOitava() - 2;
			System.out.println("Tempo Inicial:"+ notaMusical.getTempoInicial());
			System.out.println("Tempo Final:"+ notaMusical.getTempoFinal());
			Matcher matcher = pattern.matcher(nota);
			matcher.matches();
			nota = matcher.group(1);
			boolean sustenido = matcher.group(2) != null;

			BigDecimal tamanhoDuracaoRelacaoMenorTempo = new BigDecimal(notaMusical.getDuracao()).divide(new BigDecimal(menorTempoNota), 2, RoundingMode.HALF_UP);
			
			lnNumerador = new BigDecimal(Math.log(tamanhoDuracaoRelacaoMenorTempo.doubleValue()));
			lnDenominador = new BigDecimal(Math.log(2));
			log2DivisoesTempo = lnNumerador.divide(lnDenominador, 0, RoundingMode.HALF_UP);
			BigDecimal divisaoNotaAtual = new BigDecimal((int) Math.pow(2, log2DivisoesTempo.intValue()));
			BigDecimal tempoNota = divisaoNotaAtual.divide(menorDivisaoNota, 2, RoundingMode.HALF_UP); 
			String tipoTempoNota = obterTipoTempoNota(tempoNota.doubleValue());
			StartStop tipoVinculo = null;
			medidaCompasso = medidaCompasso.add(tempoNota);
			
			if (medidaCompasso.compareTo(BigDecimal.ONE) >= 0) {
				
				BigDecimal excedente = medidaCompasso.subtract(BigDecimal.ONE);
				BigDecimal tempoNotaAtual = tempoNota.subtract(excedente);
				tipoTempoNota = obterTipoTempoNota(tempoNotaAtual.doubleValue());

				adicionarNotaCompasso(nota, sustenido, false,  oitava, tipoTempoNota, tipoVinculo,  compasso);
				
				if (notasAposAtual != null) {
					
					for (NotaMusical notaMesmoTempoAtual : notasAposAtual) {
						
						nota = notaMesmoTempoAtual.getNota();
						oitava = notaMesmoTempoAtual.getOitava() - 2;
						matcher = pattern.matcher(nota);
						matcher.matches();
						nota = matcher.group(1);
						sustenido = matcher.group(2) != null;
						
						adicionarNotaCompasso(nota, sustenido, true,  oitava, tipoTempoNota, tipoVinculo,  compasso);
					}
				}
				
				
				if (excedente.doubleValue() == 0.00) {
					compasso = criarCompasso("4", "4");
					part.getMeasure().add(compasso);
					medidaCompasso = excedente;
				} else {
					medidaCompasso = excedente;
					/*compasso = criarCompasso("4", Integer.toString(menorDivisaoNota.intValue()));*/
					compasso = criarCompasso("4", "4");
					part.getMeasure().add(compasso);
					tipoTempoNota = obterTipoTempoNota(excedente.doubleValue());
				}
			} else {
				adicionarNotaCompasso(nota, sustenido, false, oitava, tipoTempoNota, tipoVinculo, compasso);
				
				for (NotaMusical notaMesmoTempoAtual : notasAposAtual) {
					nota = notaMesmoTempoAtual.getNota();
					oitava = notaMesmoTempoAtual.getOitava() - 2;
					matcher = pattern.matcher(nota);
					matcher.matches();
					nota = matcher.group(1);
					sustenido = matcher.group(2) != null;
					
					adicionarNotaCompasso(nota, sustenido, true,  oitava, tipoTempoNota, tipoVinculo,  compasso);
				}
			}
			tipoVinculo = null;
		}
			
		scorePartwise.getPart().add(part);
		
		FileOutputStream fileOutput = null;
		
		try {
			fileOutput = new FileOutputStream(arquivo);
			Marshalling.marshal(scorePartwise, fileOutput);
		} catch (FileNotFoundException e) {
			throw new GeradorPartiturasException("Diretório ou arquivo não encontrado.", e);
		} catch (UnsupportedEncodingException e) {
			throw new GeradorPartiturasException("Encoding do xml não suportado.", e);
		} catch (JAXBException e) {
			throw new GeradorPartiturasException("Erro ao gerar o xml no formato MusicXML.", e);
		} catch (IOException e) {
			throw new GeradorPartiturasException("Erro ao armazenar o arquivo.", e);
		} finally {
			if (fileOutput != null) {
				try {
					fileOutput.close();
				} catch (IOException e) {
					throw new GeradorPartiturasException("Erro ao finalizar o arquivo.", e);
				}
			}
		}
		
	}
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param batida
	 * @param tipoBatida
	 * @return
	 */
	private Measure criarCompasso(String batida, String tipoBatida) {
		
		Measure measure = factory.createScorePartwisePartMeasure();
		measure.setNumber(Integer.toString(++numeroCompasso));
		
		Attributes attributes = factory.createAttributes();
		attributes.setDivisions(new BigDecimal("1"));
		
		Key key = factory.createKey();
		key.setFifths(new BigInteger("0"));
		
		attributes.getKey().add(key);
		
		Time time = factory.createTime();
		
		JAXBElement<String> beat = factory.createTimeBeats(batida);
		JAXBElement<String> beatType = factory.createTimeBeatType(tipoBatida);
		
		time.getBeatsAndBeatType().add(beat);
		time.getBeatsAndBeatType().add(beatType);
		attributes.getTime().add(time);
		
		measure.getNoteOrBackupOrForward().add(attributes);
		return measure;
		
	}
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param nota
	 * @param sustenido
	 * @param notaAcorde
	 * @param oitava
	 * @param tipoDuracaoNota
	 * @param tipoVinculo
	 * @param measure
	 */
	private void adicionarNotaCompasso(String nota, boolean sustenido, boolean notaAcorde, Integer oitava, String tipoDuracaoNota, StartStop tipoVinculo, Measure measure) {
		Note note = factory.createNote();
		NoteType noteType = factory.createNoteType();
		note.setDuration(new BigDecimal(4));
		noteType.setValue(tipoDuracaoNota);
		note.setType(noteType);
		if (tipoVinculo != null) {
			Tie tie = factory.createTie();
			tie.setType(tipoVinculo);
			note.getTie().add(tie);
		}
		if (notaAcorde) {
			note.setChord(new Empty());
		}		
		
		if ("PAUSA".equals(nota)) {
			DisplayStepOctave stepOctave = factory.createDisplayStepOctave();
			stepOctave.setDisplayOctave(0);
			note.setRest(stepOctave);
		} else {
			Pitch pitch = factory.createPitch();
			
			Step step = Step.valueOf(nota);
			if (sustenido) {
				pitch.setAlter(BigDecimal.ONE);
			}
			pitch.setStep(step);
			pitch.setOctave(oitava);
			note.setPitch(pitch);
		}
		
		measure.getNoteOrBackupOrForward().add(note);
	}
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param tempoNota
	 * @return
	 */
	private String obterTipoTempoNota(Double tempoNota) {
		Entry<Double, String> entradaBaixa = GeradorPartituras.MAP_DURACAO_NOTAS.floorEntry(tempoNota);
		Entry<Double, String> entradaAlta = GeradorPartituras.MAP_DURACAO_NOTAS.ceilingEntry(tempoNota);
		
		double valorBaixa = 0;
		double valorAlta = 0;
		
		String retorno = null;
		
		if (entradaBaixa == null) {
			entradaBaixa = entradaAlta;
		} else if (entradaAlta == null) {
			entradaAlta = entradaBaixa;
		}
		
		valorBaixa = Math.abs(tempoNota - entradaBaixa.getKey());
		valorAlta = Math.abs(tempoNota - entradaAlta.getKey());
		if (valorBaixa == Math.min(valorBaixa, valorAlta)) {
			retorno = entradaBaixa.getValue();
		} else {
			retorno = entradaAlta.getValue();
		}
		
		return retorno;
	}

}
