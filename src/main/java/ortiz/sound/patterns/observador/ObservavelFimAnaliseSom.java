package ortiz.sound.patterns.observador;

import ortiz.sound.modelo.DadosAnalise;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 18/11/2012 <br/>
 * </p>
 * 
 * @author marcelo.ortiz
 */
public interface ObservavelFimAnaliseSom {

	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param observador
	 */
	public void registrarObservador(ObservadorFimAnaliseSom observador); 
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param observador
	 */
	public void removerObservador(ObservadorFimAnaliseSom observador);
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param dadosAnalise
	 */
	public void notificarFimAnaliseSom(DadosAnalise dadosAnalise);
	
}
