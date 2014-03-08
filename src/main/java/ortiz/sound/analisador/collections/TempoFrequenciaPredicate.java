package ortiz.sound.analisador.collections;

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
public class TempoFrequenciaPredicate extends TempoPredicate {
	
	private final double frequencia;
	
	public TempoFrequenciaPredicate(double tempo, double frequencia) {
		super(tempo);
		this.frequencia = frequencia;
	}

	@Override
	public boolean evaluate(Object object) {
		boolean resultado = super.evaluate(object);
		if (resultado) {
			NotaMusicalFrequenciaSom notaComparacao = (NotaMusicalFrequenciaSom) object;
			resultado = notaComparacao.getFrequencia() == this.frequencia;
		}
		return resultado;
	}
}
