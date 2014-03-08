package ortiz.sound.analisador;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioFormat;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

import ortiz.sound.modelo.ComparatorAmplitudeSom;
import ortiz.sound.modelo.DadosAnalise;
import ortiz.sound.modelo.FrequenciasSomTempo;
import ortiz.sound.modelo.NotaMusical;
import ortiz.sound.modelo.NotaMusicalFrequenciaSom;
import ortiz.sound.patterns.observador.ObservadorFimAnaliseSom;
import ortiz.sound.patterns.observador.ObservadorLeituraSom;
import ortiz.sound.patterns.observador.ObservavelFimAnaliseSom;
import ortiz.sound.util.Configuracoes;

/**
 * 
 * <p>
 * Analisador do som. <br/>
 * Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class AnalisadorSom implements ObservadorLeituraSom,
		ObservavelFimAnaliseSom {

	private double sampleRate;
	private long idxTempo;
	private List<FrequenciasSomTempo> listaFrequenciasTempo;
	private double[] dadosAmostra;

	/** Lista de observadores */
	private List<ObservadorFimAnaliseSom> listaObservadores;

	/**
	 * 
	 * <p>
	 * Construtor
	 * </p>
	 */
	public AnalisadorSom() {
		this.listaObservadores = new ArrayList<ObservadorFimAnaliseSom>();
	}

	@Override
	public void iniciouLeituraSom(AudioFormat format) {
		this.sampleRate = format.getFrameRate();
		this.idxTempo = 0;
		this.listaFrequenciasTempo = new ArrayList<FrequenciasSomTempo>();
		this.dadosAmostra = new double[0];
	}

	@Override
	public void finalizouLeituraSom() {
		List<NotaMusicalFrequenciaSom> listNotasMusicaisTempo = this
				.obterNotasMusicaisTempo(this.listaFrequenciasTempo);
		DadosAnalise dadosAnalise = new DadosAnalise(this.dadosAmostra,
				this.sampleRate, listaFrequenciasTempo, listNotasMusicaisTempo);
		this.notificarFimAnaliseSom(dadosAnalise);
	}

	@Override
	public void leuTrechoSom(byte[] audioData) {
		try {
			obterFrequencias(audioData);
		} catch (AnalisadorException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * <p>
	 * Obtém as frequências a partir dos dados do som digital
	 * </p>
	 * 
	 * @param somDigital
	 *            - Bytes com as amostras da amplitudes do som.
	 * @throws AnalisadorException
	 *             - Lançado caso ocorram erros.
	 */
	private void obterFrequencias(byte[] somDigital) throws AnalisadorException {
		
		try {

			double[] dadosAmostra = obterValoresAmostra(somDigital);
	
			this.dadosAmostra = ArrayUtils.addAll(this.dadosAmostra, dadosAmostra);
	
			long N = dadosAmostra.length;
			long Ninicial = idxTempo * N;
	
			/*
			 * TransformadaIn input = new TransformadaIn(dadosAmostra,
			 * this.sampleRate, true); TransformadaDiscretaFourier discreta = new
			 * TransformadaDiscretaFourier(); TransformadaOut output =
			 * discreta.efetuarTransformada(input);
			 */
	
			/*TransformadaIn input = new TransformadaIn(dadosAmostra, this.sampleRate);
			TransformadaRapidaFourier rapida = new TransformadaRapidaFourier();
			TransformadaOut output = rapida.efetuarTransformada(input);*/
	
			long MAXSIZE = N / 2;
	
			List<NotaMusicalFrequenciaSom> listaFrequencias = new ArrayList<NotaMusicalFrequenciaSom>();
	
			FastFourierTransformer ffFast = new FastFourierTransformer(DftNormalization.STANDARD);
			Complex[] fftResult = ffFast.transform(dadosAmostra, TransformType.FORWARD);

			double T = Configuracoes.DELTA_TEMPO_ANALISE;
			
			double f0 = BigDecimal.ONE.divide(new BigDecimal(T), 4, RoundingMode.HALF_UP).doubleValue();

			for (int idx = 0; idx < MAXSIZE; idx++) {
				double real = new BigDecimal(fftResult[idx].getReal()).divide(new BigDecimal(N), 4, RoundingMode.HALF_UP).doubleValue();
				double imaginario = new BigDecimal(fftResult[idx].getImaginary()).divide(new BigDecimal(N), 4, RoundingMode.HALF_UP).doubleValue();

				double amplitude = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginario, 2)); 
				double frequencia = f0 * idx;
				listaFrequencias.add(new NotaMusicalFrequenciaSom(amplitude, frequencia));
			}
	
			this.listaFrequenciasTempo.add(new FrequenciasSomTempo(new BigDecimal(
					Ninicial).divide(new BigDecimal(sampleRate), 4,
					RoundingMode.HALF_UP).doubleValue(), listaFrequencias));
			this.idxTempo++;
		
		} catch (Exception exc) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, exc);
			throw new AnalisadorException("Ocorreu um erro inesperado.", exc);
		}
	}

	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param valoresBrutos
	 * @return
	 * @throws AnalisadorException
	 */
	private static double[] obterValoresAmostra(byte[] valoresBrutos)
			throws AnalisadorException {
		int idxSampl = 0;
		double[] valoresDiscretos = new double[valoresBrutos.length / 2];

		for (int i = 0; i < valoresBrutos.length; i = i + 2) {
			long val = 0;
			int v = valoresBrutos[i];
			val += v;
			v = valoresBrutos[i + 1];
			val += v << 8;
			valoresDiscretos[idxSampl++] = (int) val;
		}

		return valoresDiscretos;
	}

	/**
	 * 
	 * <p>
	 * Obtém a listagem de notas musicais no tempo
	 * </p>
	 * 
	 * @param frequenciasSomTempo
	 * @return
	 */
	private List<NotaMusicalFrequenciaSom> obterNotasMusicaisTempo(
			List<FrequenciasSomTempo> frequenciasSomTempo) {

		FrequenciasSomTempo frequenciaSomTempoAnterior = null;

		List<NotaMusicalFrequenciaSom> notasNoTempo = new ArrayList<NotaMusicalFrequenciaSom>();

		for (FrequenciasSomTempo frequenciaSomTempo : frequenciasSomTempo) {
			extrairNotasFrequencias(frequenciaSomTempoAnterior,
					frequenciaSomTempo, notasNoTempo);
			frequenciaSomTempoAnterior = frequenciaSomTempo;
		}

		return notasNoTempo;
	}

	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 * 
	 * @param frequenciasTempoAnterior
	 * @param frequenciasTempoAtual
	 * @param notasMelodia
	 */
	private void extrairNotasFrequencias(
			FrequenciasSomTempo frequenciasTempoAnterior,
			FrequenciasSomTempo frequenciasTempoAtual,
			List<NotaMusicalFrequenciaSom> notasMelodia) {

		List<NotaMusicalFrequenciaSom> frequenciasSom = frequenciasTempoAtual
				.getListaNotasMusicaisFrequenciaSom();
		ComparatorAmplitudeSom comparador = new ComparatorAmplitudeSom();
		// ordenamos por maior amplitude
		Collections.sort(frequenciasSom, comparador);
		// filtramos as N frequencias com maior amplitude
		frequenciasSom = frequenciasSom.subList(0,
				Configuracoes.NUMERO_FREQUENCIAS_RELEVANTES);

		BigDecimal somaProdutosFrequenciaAmplitude = BigDecimal.ZERO;
		BigDecimal somaAmplitudes = BigDecimal.ZERO;
		BigDecimal somaFrequencias = BigDecimal.ZERO;
		for (NotaMusicalFrequenciaSom frequenciaSom : frequenciasSom) {
			BigDecimal frequencia = new BigDecimal(
					frequenciaSom.getFrequencia());
			BigDecimal amplitude = new BigDecimal(frequenciaSom.getAmplitude());
			somaFrequencias = somaFrequencias.add(frequencia);
			somaAmplitudes = somaAmplitudes.add(amplitude);
			somaProdutosFrequenciaAmplitude = somaProdutosFrequenciaAmplitude
					.add(frequencia.multiply(amplitude));
		}

		BigDecimal mediaPonderadaFrequencia = somaProdutosFrequenciaAmplitude
				.divide(somaAmplitudes, 2, RoundingMode.HALF_UP);
		BigDecimal mediaPonderadaAmplitude = somaProdutosFrequenciaAmplitude
				.divide(somaFrequencias, 2, RoundingMode.HALF_UP);

		// se a média é inferio a média da amplitude de corte, atribuimos zero,
		// indicando uma pausa.
		if (mediaPonderadaAmplitude.compareTo(Configuracoes.AMPLITUDE_CORTE) < 0) {
			// zeramos pois e uma frequencia de pausa
			mediaPonderadaFrequencia = BigDecimal.ZERO;
		}

		NotaMusicalFrequenciaSom notaFrequenciaSom = new NotaMusicalFrequenciaSom(
				mediaPonderadaAmplitude.doubleValue(),
				mediaPonderadaFrequencia.doubleValue());

		// atualizamos a referencia do objeto atual
		notaFrequenciaSom.getNota();
		frequenciasTempoAtual.getListaNotasMusicaisFrequenciaSom().clear();
		frequenciasTempoAtual.getListaNotasMusicaisFrequenciaSom().add(
				notaFrequenciaSom);

		if (frequenciasTempoAnterior != null) {

			NotaMusicalFrequenciaSom notaFrequenciaAnterior = frequenciasTempoAnterior
					.getListaNotasMusicaisFrequenciaSom().get(0);

			double tempoAnterior = frequenciasTempoAnterior.getTempo();

			notaFrequenciaAnterior.getNota().setTempoInicial(tempoAnterior);

			NotaMusicalFrequenciaSom notaMusicalLinhaTempo = null;

			if (!notasMelodia.isEmpty()) {
				notaMusicalLinhaTempo = notasMelodia
						.get(notasMelodia.size() - 1);
			}

			/*
			 * TempoFrequenciaPredicate predicate = new
			 * TempoFrequenciaPredicate(tempoAnterior,
			 * notaFrequenciaAnterior.getFrequencia()); NotaMusicalFrequenciaSom
			 * notaMusicalLinhaTempo = (NotaMusicalFrequenciaSom)
			 * CollectionUtils.find(notasMelodia, predicate);
			 */
			if (notaMusicalLinhaTempo == null) {
				notasMelodia.add(notaFrequenciaAnterior);
			} else if (notaFrequenciaAnterior.getNota().equals(
					notaMusicalLinhaTempo.getNota())) {
				notaMusicalLinhaTempo.getNota().adicionarTempo();
			} else if (notaFrequenciaAnterior.getNota().equals(
					notaFrequenciaSom.getNota())) {
				// o if se mostrou necessario pois haviam notas que
				// possuem intervalos muito curtos indicando uma mera
				// variacao no som
				notasMelodia.add(notaFrequenciaAnterior);
			} else {
				int distanciaEntreNotas = NotaMusicalFrequenciaSom
						.obterDistanciaIntervalarSemitom(
								notaFrequenciaAnterior, notaFrequenciaSom);
				if (distanciaEntreNotas == 1) {
					BigDecimal somaProdutosPesos = new BigDecimal(
							notaFrequenciaAnterior.getFrequenciaOriginal())
							.multiply(
									new BigDecimal(notaFrequenciaAnterior
											.getAmplitude())).add(
									new BigDecimal(notaFrequenciaSom
											.getFrequenciaOriginal())
											.multiply(new BigDecimal(
													notaFrequenciaSom
															.getAmplitude())));
					BigDecimal somaPesos = new BigDecimal(
							notaFrequenciaAnterior.getAmplitude())
							.add(new BigDecimal(notaFrequenciaSom
									.getAmplitude()));
					BigDecimal mediaPonderada = somaProdutosPesos.divide(
							somaPesos, 2, RoundingMode.HALF_UP);

					notaFrequenciaAnterior = new NotaMusicalFrequenciaSom(
							notaFrequenciaAnterior.getAmplitude(),
							mediaPonderada.doubleValue());
					notaFrequenciaAnterior.getNota();
					notaFrequenciaAnterior.getNota().setTempoInicial(
							tempoAnterior);

					notasMelodia.add(notaFrequenciaAnterior);

					notaFrequenciaSom = new NotaMusicalFrequenciaSom(
							notaFrequenciaSom.getAmplitude(),
							mediaPonderada.doubleValue());
					notaFrequenciaSom.getNota();

				} else {
					// verifica-se a média com a nota existente na melodia
					distanciaEntreNotas = NotaMusicalFrequenciaSom
							.obterDistanciaIntervalarSemitom(
									notaFrequenciaAnterior,
									notaMusicalLinhaTempo);
					if (distanciaEntreNotas == 1) {
						BigDecimal somaProdutosPesos = new BigDecimal(
								notaFrequenciaAnterior.getFrequenciaOriginal())
								.multiply(
										new BigDecimal(notaFrequenciaAnterior
												.getAmplitude()))
								.add(new BigDecimal(notaMusicalLinhaTempo
										.getFrequenciaOriginal())
										.multiply(new BigDecimal(
												notaMusicalLinhaTempo
														.getAmplitude())));
						BigDecimal somaPesos = new BigDecimal(
								notaFrequenciaAnterior.getAmplitude())
								.add(new BigDecimal(notaMusicalLinhaTempo
										.getAmplitude()));
						BigDecimal mediaPonderada = somaProdutosPesos.divide(
								somaPesos, 2, RoundingMode.HALF_UP);

						notasMelodia.remove(notaMusicalLinhaTempo);

						NotaMusical nota = notaMusicalLinhaTempo.getNota();
						notaMusicalLinhaTempo = new NotaMusicalFrequenciaSom(
								notaMusicalLinhaTempo.getAmplitude(),
								mediaPonderada.doubleValue());
						notaMusicalLinhaTempo.getNota();
						notaMusicalLinhaTempo.getNota().setTempoInicial(
								nota.getTempoInicial());
						notaMusicalLinhaTempo.getNota().setTempoFinal(
								nota.getTempoFinal());

						notasMelodia.add(notaMusicalLinhaTempo);
					}
				}
			}
		}
	}

	@Override
	public void registrarObservador(ObservadorFimAnaliseSom observador) {
		this.listaObservadores.add(observador);

	}

	@Override
	public void removerObservador(ObservadorFimAnaliseSom observador) {
		this.listaObservadores.remove(observador);

	}

	@Override
	public void notificarFimAnaliseSom(DadosAnalise dadosAnalise) {
		for (ObservadorFimAnaliseSom observador : this.listaObservadores) {
			observador.finalizouAnalise(dadosAnalise);
		}
	}

}