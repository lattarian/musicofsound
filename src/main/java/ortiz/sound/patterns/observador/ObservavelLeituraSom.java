package ortiz.sound.patterns.observador;

import javax.sound.sampled.AudioFormat;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 18/11/2012 <br/>
 * </p>
 * 
 * @author marcelo.ortiz
 */
public interface ObservavelLeituraSom {
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param observador
	 */
	void adicionarObservador(ObservadorLeituraSom observador);
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param observador
	 */
	void removerObservador(ObservadorLeituraSom observador);
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param audioFormat
	 */
	void notificarInicioLeituraSom(AudioFormat audioFormat);
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param dadosLidos
	 */
	void notificarLeituraSom(byte[] dadosLidos);
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 */
	void notificarFimLeituraSom();
	
}
