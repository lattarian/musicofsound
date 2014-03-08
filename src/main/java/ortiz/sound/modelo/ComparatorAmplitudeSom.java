package ortiz.sound.modelo;

import java.util.Comparator;

/**
 * 
 * <p>
 *	Compara as frequências e indica a que possui a maior amplitude.  <br/>
 *	Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class ComparatorAmplitudeSom implements Comparator<NotaMusicalFrequenciaSom> {

	/**
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(NotaMusicalFrequenciaSom elemento1,
			NotaMusicalFrequenciaSom elemento2) {
		Double amplitude1 = (Double) elemento1.getAmplitude();
		Double amplitude2 = (Double) elemento2.getAmplitude();
		
		int retorno = amplitude2.compareTo(amplitude1);
		return retorno;
	}

}

