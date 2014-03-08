package ortiz.sound.patterns.observador;

import javax.sound.sampled.AudioFormat;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 04/10/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public interface ObservadorLeituraSom {

	void iniciouLeituraSom(AudioFormat audioFormat);
	void finalizouLeituraSom();
	void leuTrechoSom(byte[] audioData);

}
