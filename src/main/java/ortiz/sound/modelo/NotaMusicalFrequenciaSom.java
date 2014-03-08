package ortiz.sound.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * 
 * <p>
 *	Armazena a frequência, a amplitude e a nota do som.  <br/>
 *	Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class NotaMusicalFrequenciaSom {
	
	private static final NavigableMap<Double, NotaMusical> mapNotas = 
			new TreeMap<Double, NotaMusical>();
	
	private static final List<Entry<Double, NotaMusical>> listaChavesValores;
	
	static {
		/* PRIMEIRA OITAVA */
		double doe = 16.3516;
		double doSus = 17.32391;
		double re = 18.35405;
		double resus = 19.44544;
		double mi = 20.60172;
		double fa = 21.82676;
		double fasus = 23.12465;
		double sol = 24.49971;
		double solsus = 25.95654;
		double la = 27.5;
		double lasus = 29.13524;
		double si = 30.86771;

		// 9 oitavas
		int fatorOitava = 1;
		
		mapNotas.put(0D, new NotaMusical("PAUSA", 0));
		
		for (int i = 1; i <= 9; i++) {
			
			// TODO REMOVI OS SUSTENDOS PARA TESTES
			
			mapNotas.put(doe * fatorOitava, new NotaMusical("C",i));
			mapNotas.put(doSus * fatorOitava, new NotaMusical("C#", i));
			mapNotas.put(re * fatorOitava, new NotaMusical("D", i));
			mapNotas.put(resus * fatorOitava, new NotaMusical("D#", i));
			mapNotas.put(mi * fatorOitava, new NotaMusical("E", i));
			mapNotas.put(fa * fatorOitava, new NotaMusical("F", i));
			mapNotas.put(fasus * fatorOitava, new NotaMusical("F#", i));
			mapNotas.put(sol * fatorOitava, new NotaMusical("G", i));
			mapNotas.put(solsus * fatorOitava, new NotaMusical("G#", i));
			mapNotas.put(la * fatorOitava, new NotaMusical("A", i));
			mapNotas.put(lasus * fatorOitava, new NotaMusical("A#", i));
			mapNotas.put(si * fatorOitava, new NotaMusical("B", i));

			fatorOitava = fatorOitava * 2;
		}
		
		listaChavesValores = new ArrayList<Entry<Double, NotaMusical>>(mapNotas.entrySet());
	}
	
	/** Amplitude da frequência do som. */
	private double amplitude;
	/** Frequência do som */
	private double frequencia;
	/** Frequência do som original */
	private double frequenciaOriginal;
	/** Nota musical relacionada a essa frequência. */
	private NotaMusical nota;
	/** Flag que indica se a nota já foi buscada. */
	private boolean notaObtida;
	
	/**
	 * 
	 *<p>Construtor</p>
	 * @param amplitude - Amplitude da frequência
	 * @param frequencia - Frequência
	 */
	public NotaMusicalFrequenciaSom(double amplitude, double frequencia) {		
		this.amplitude = amplitude;
		this.frequencia = frequencia;
		this.frequenciaOriginal = frequencia;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO VERIFICAR
		return this.frequencia == ((NotaMusicalFrequenciaSom)obj).getFrequencia();
	}
	
	@Override
	public int hashCode() {
		return new BigDecimal(frequencia).hashCode();
	}
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @return
	 */
	public static NotaMusicalFrequenciaSom getPause(){
		return new NotaMusicalFrequenciaSom(0, 0.0D);
	}
	
	/**
	 * <p>Obtém o valor de nota.</p>
	 * @return Retorna o(a) nota.
	 */
	public NotaMusical getNota() {
		if (!this.notaObtida) {
			// inicializo o map de notas
			Entry<Double, NotaMusical> entradaBaixa = 
					NotaMusicalFrequenciaSom.mapNotas.floorEntry(this.frequencia);
			Entry<Double, NotaMusical> entradaAlta = 
					NotaMusicalFrequenciaSom.mapNotas.ceilingEntry(this.frequencia);
	
			double valorBaixa = 0;
			double valorAlta = 0;
			
			NotaMusical retorno = null;
	
			if (entradaBaixa != null && entradaAlta != null) {
				valorBaixa = Math.abs(this.frequencia - entradaBaixa.getKey());
				valorAlta = Math.abs(this.frequencia - entradaAlta.getKey());
				try {
					if (valorBaixa == Math.min(valorBaixa, valorAlta)) {
						retorno = (NotaMusical) entradaBaixa.getValue().clone();
						this.frequencia = entradaBaixa.getKey();
					} else {
						retorno = (NotaMusical) entradaAlta.getValue().clone();
						this.frequencia = entradaAlta.getKey();
					}
				} catch (CloneNotSupportedException e) {
					// nunca vai dar essa exception, mas a api pede pra implementarmos 
					e.printStackTrace();
				}
			} 
			this.nota = retorno;
			this.notaObtida = true;
		}
		
		return this.nota;
	}
	
	/**
	 * 
	 * <p>
	 * Verificamos a distância intervalar de semitons entre as notas.
	 * </p>
	 *
	 * @param notaFrequencia1 - primeiro elemento a ser comparado.
	 * @param notaFrequencia2 - segundo elemento a ser comparado.
	 * @return Distância intervalar de semitons entre as notas musicais.
	 */
	public static int obterDistanciaIntervalarSemitom(NotaMusicalFrequenciaSom notaFrequencia1, NotaMusicalFrequenciaSom notaFrequencia2) {
		int idxNota1 = -1;
		int idxNota2 = -1;
		
		
		for (int idx = 0; idx < listaChavesValores.size(); idx++)  {
			Entry<Double, NotaMusical> entradaChaveValor = listaChavesValores.get(idx);
			if (entradaChaveValor.getValue().equals(notaFrequencia1.getNota())) {
				idxNota1 = idx;
			}
			if (entradaChaveValor.getValue().equals(notaFrequencia2.getNota())) {
				idxNota2 = idx;
			}
			
			if (idxNota1 > -1 && idxNota2 > -1) {
				break;
			}
		}
		
		return Math.abs(idxNota2 - idxNota1); 
		
	}

	/**
	 * <p>Obtém o valor de amplitude.</p>
	 * @return Retorna o(a) amplitude.
	 */
	public double getAmplitude() {
		return amplitude;
	}

	/**
	 * <p>Obtém o valor de frequencia.</p>
	 * @return Retorna o(a) frequencia.
	 */
	public double getFrequencia() {
		return frequencia;
	}
	
	/**
	 * <p>Obtém o valor da frequência original.</p>
	 * @return Retorna o(a) frequência original.
	 */
	public double getFrequenciaOriginal() {
		return frequenciaOriginal;
	}
}
