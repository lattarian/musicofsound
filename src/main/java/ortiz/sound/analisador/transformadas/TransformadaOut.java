package ortiz.sound.analisador.transformadas;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 28/11/2012 <br/>
 * </p>
 * 
 * @author marcelo.ortiz
 */
public class TransformadaOut {
	/**
	 * 
	 */
	private double[] frequencias;
	
	/**
	 * 
	 */
	private double[] amplitudes;
	
	/**
	 * 
	 */
	private double[][] complexos;
	
	/**
	 *<p>Construtor</p>
	 * @param frequencias
	 * @param amplitudes
	 * @param complexos
	 */
	public TransformadaOut(double[] frequencias, double[] amplitudes,
			double[][] complexos) {
		this.frequencias = frequencias;
		this.amplitudes = amplitudes;
		this.complexos = complexos;
	}

	/**
	 * <p>Obtém o valor de frequencias.</p>
	 * @return Retorna o(a) frequencias.
	 */
	public double[] getFrequencias() {
		return frequencias;
	}

	/**
	 * <p>Obtém o valor de amplitudes.</p>
	 * @return Retorna o(a) amplitudes.
	 */
	public double[] getAmplitudes() {
		return amplitudes;
	}

	/**
	 * <p>Obtém o valor de complexos.</p>
	 * @return Retorna o(a) complexos.
	 */
	public double[][] getComplexos() {
		return complexos;
	}
}
