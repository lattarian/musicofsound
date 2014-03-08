package ortiz.sound.analisador.transformadas;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 22/11/2012 <br/>
 * </p>
 * 
 * @author marcelo.ortiz
 */
public class TransformadaIn {
	
	private double[] amostras;
	
	private double amostrasPorSegundo;
	
	public TransformadaIn(double[] amostras, double amostrasPorSegundo) {
		this.amostras = amostras;
		this.amostrasPorSegundo = amostrasPorSegundo;
	}

	/**
	 * <p>Obtém o valor de amostras.</p>
	 * @return Retorna o(a) amostras.
	 */
	public double[] getAmostras() {
		return amostras;
	}

	/**
	 * <p>Obtém o valor de amostrasPorSegundo.</p>
	 * @return Retorna o(a) amostrasPorSegundo.
	 */
	public double getAmostrasPorSegundo() {
		return amostrasPorSegundo;
	}

	
}
