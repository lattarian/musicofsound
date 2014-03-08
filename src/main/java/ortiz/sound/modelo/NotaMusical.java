package ortiz.sound.modelo;

import ortiz.sound.util.Configuracoes;


/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 03/10/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class NotaMusical implements Cloneable {

	private String nota;
	
	private int oitava;
	
	private int intensidade;
	
	private double tempoInicial;
	
	private double tempoFinal;
	
	public NotaMusical(String nota, int oitava) {
		this.nota = nota;
		this.oitava = oitava;
	}
	
	public void adicionarTempo() {
		this.tempoFinal += Configuracoes.DELTA_TEMPO_ANALISE;
	}
	
	/**
	 * <p>Atribui o valor de tempoInicial.</p>
	 * @param tempoInicial para gravar no atributo tempoInicial.
	 */
	public void setTempoInicial(double tempoInicial) {
		this.tempoInicial = tempoInicial;
		this.tempoFinal = tempoInicial + Configuracoes.DELTA_TEMPO_ANALISE;
	}
	
	/**
	 * 
	 * <p>
	 * Obtém a duração da nota.
	 * </p>
	 *
	 * @return tempo de duração.
	 */
	public double getDuracao() {
		return this.tempoFinal - this.tempoInicial;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NotaMusical notaClone = new NotaMusical(this.nota, this.oitava);
		notaClone.setTempoInicial(this.tempoInicial);
		notaClone.setTempoFinal(this.tempoFinal);
		notaClone.setIntensidade(this.intensidade);
		return notaClone;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = obj instanceof NotaMusical;
		if (retorno) {
			NotaMusical notaObj = (NotaMusical) obj;
			retorno = notaObj.getNota().equals(this.getNota());
			retorno = retorno && notaObj.getOitava() == this.getOitava();
		}
		return retorno;
	}
	
	/**
	 * <p>
	 * Obtém o valor de nota.
	 * </p>
	 * 
	 * @return Retorna o(a) nota.
	 */
	public String getNota() {
		return nota;
	}

	/**
	 * <p>
	 * Atribui o valor de nota.
	 * </p>
	 * 
	 * @param nota
	 *            para gravar no atributo nota.
	 */
	public void setNota(String nota) {
		this.nota = nota;
	}

	/**
	 * <p>Obtém o valor de oitava.</p>
	 * @return Retorna o(a) oitava.
	 */
	public int getOitava() {
		return oitava;
	}

	/**
	 * <p>Atribui o valor de oitava.</p>
	 * @param oitava para gravar no atributo oitava.
	 */
	public void setOitava(int oitava) {
		this.oitava = oitava;
	}

	/**
	 * <p>Obtém o valor de intensidade.</p>
	 * @return Retorna o(a) intensidade.
	 */
	public int getIntensidade() {
		return intensidade;
	}

	/**
	 * <p>Atribui o valor de intensidade.</p>
	 * @param intensidade para gravar no atributo intensidade.
	 */
	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}

	/**
	 * <p>Obtém o valor de tempoInicial.</p>
	 * @return Retorna o(a) tempoInicial.
	 */
	public double getTempoInicial() {
		return tempoInicial;
	}

	/**
	 * <p>Obtém o valor de tempoFinal.</p>
	 * @return Retorna o(a) tempoFinal.
	 */
	public double getTempoFinal() {
		return tempoFinal;
	}

	/**
	 * <p>Atribui o valor de tempoFinal.</p>
	 * @param tempoFinal para gravar no atributo tempoFinal.
	 */
	public void setTempoFinal(double tempoFinal) {
		this.tempoFinal = tempoFinal;
	}
	
	
	
}
