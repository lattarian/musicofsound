package ortiz.sound.modelo;

import java.util.List;

/**
 * 
 * <p>
 * Dados de análise <br/>
 * Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class DadosAnalise {

	/** Array com os dados discretos do som */
	private double[] amostras;
	/** Frames por segundo */
	private double frameRate;
	/** Lista de frequências no tempo */
	private List<FrequenciasSomTempo> listaFrequenciasTempo;
	private List<NotaMusicalFrequenciaSom> listaNotasMusicaisTempo;

	/**
	 * 
	 * <p>
	 * Construtor
	 * </p>
	 */
	public DadosAnalise() {
	}

	/**
	 * 
	 * <p>
	 * Construtor
	 * </p>
	 * 
	 * @param amostras
	 *            - Array com os dados discretos do som.
	 * @param frameRate
	 *            - Frames por segundo.
	 * @param listaFrequenciasTempo
	 *            - Lista de frequência no tempo.
	 * @param listaNotasMusicaisTempo
	 *            = Lista de notas musicais no tempo.
	 * 
	 */
	public DadosAnalise(double[] amostras, double frameRate,
			List<FrequenciasSomTempo> listaFrequenciasTempo,
			List<NotaMusicalFrequenciaSom> listaNotasMusicaisTempo) {
		this.amostras = amostras;
		this.frameRate = frameRate;
		this.listaFrequenciasTempo = listaFrequenciasTempo;
		this.listaNotasMusicaisTempo = listaNotasMusicaisTempo;
	}

	/**
	 * <p>
	 * Obtém o valor de amostras.
	 * </p>
	 * 
	 * @return Retorna o(a) amostras.
	 */
	public double[] getAmostras() {
		return amostras;
	}

	/**
	 * <p>
	 * Atribui o valor de amostras.
	 * </p>
	 * 
	 * @param amostras
	 *            para gravar no atributo amostras.
	 */
	public void setAmostras(double[] amostras) {
		this.amostras = amostras;
	}

	/**
	 * <p>
	 * Obtém o valor de frameRate.
	 * </p>
	 * 
	 * @return Retorna o(a) frameRate.
	 */
	public double getFrameRate() {
		return frameRate;
	}

	/**
	 * <p>
	 * Atribui o valor de frameRate.
	 * </p>
	 * 
	 * @param frameRate
	 *            para gravar no atributo frameRate.
	 */
	public void setFrameRate(double frameRate) {
		this.frameRate = frameRate;
	}

	/**
	 * <p>
	 * Obtém o valor de listaFrequenciasTempo.
	 * </p>
	 * 
	 * @return Retorna o(a) listaFrequenciasTempo.
	 */
	public List<FrequenciasSomTempo> getListaFrequenciasTempo() {
		return listaFrequenciasTempo;
	}

	/**
	 * <p>
	 * Atribui o valor de listaFrequenciasTempo.
	 * </p>
	 * 
	 * @param listaFrequenciasTempo
	 *            para gravar no atributo listaFrequenciasTempo.
	 */
	public void setListaFrequenciasTempo(
			List<FrequenciasSomTempo> listaFrequenciasTempo) {
		this.listaFrequenciasTempo = listaFrequenciasTempo;
	}

	/**
	 * <p>
	 * Obtém o valor de listaNotasMusicaisTempo.
	 * </p>
	 * 
	 * @return Retorna o(a) listaNotasMusicaisTempo.
	 */
	public List<NotaMusicalFrequenciaSom> getListaNotasMusicaisTempo() {
		return listaNotasMusicaisTempo;
	}

}
