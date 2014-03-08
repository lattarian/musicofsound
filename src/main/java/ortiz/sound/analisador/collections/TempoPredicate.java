package ortiz.sound.analisador.collections;

import org.apache.commons.collections.Predicate;

import ortiz.sound.modelo.NotaMusical;
import ortiz.sound.modelo.NotaMusicalFrequenciaSom;

/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 09/10/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class TempoPredicate implements Predicate {
	
	private double tempo;
	
	public TempoPredicate(double tempo) {
		this.tempo = tempo;
	}

	@Override
	public boolean evaluate(Object object) {
		boolean resultado = false;
		NotaMusical notaMusical = null;
		if (object instanceof NotaMusicalFrequenciaSom) {
			notaMusical = ((NotaMusicalFrequenciaSom) object).getNota();
		} else {
			if (object instanceof NotaMusical) {
				notaMusical = (NotaMusical) object;
			}
		}
		
		if (notaMusical != null) {
			resultado = (notaMusical.getTempoInicial() <= this.tempo && notaMusical.getTempoFinal() >= this.tempo);
		}
		
		return resultado;
	}
}
