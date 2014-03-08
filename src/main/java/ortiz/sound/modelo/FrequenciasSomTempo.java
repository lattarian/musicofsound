package ortiz.sound.modelo;

import java.util.List;

/**
 * 
 * <p>
 *	Armazena as frequências existentes em um certo tempo  <br/>
 *	Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class FrequenciasSomTempo {
	
	/** Armazena o tempo */
	private double tempo;
	
	/** Armazena a lista de frequencias */
	private List<NotaMusicalFrequenciaSom> listaNotasMusicaisFrequenciaSom;

	/**
	 * 
	 *<p>Construtor</p>
	 */
	public FrequenciasSomTempo() {
	}

	/**
	 * 
	 *<p>Construtor</p>
	 * @param tempo - Tempo
	 * @param listaFrequencias - Lista de frequências
	 */
	public FrequenciasSomTempo(double tempo, List<NotaMusicalFrequenciaSom> listaNotasMusicaisFrequenciaSom) {
		this.tempo = tempo;
		this.listaNotasMusicaisFrequenciaSom = listaNotasMusicaisFrequenciaSom;
	}

	/**
	 * <p>Obtém o valor de tempo.</p>
	 * @return Retorna o(a) tempo.
	 */
	public double getTempo() {
		return tempo;
	}

	/**
	 * <p>Obtém o valor de listaNotasMusicaisFrequenciaSom.</p>
	 * @return Retorna o(a) listaNotasMusicaisFrequenciaSom.
	 */
	public List<NotaMusicalFrequenciaSom> getListaNotasMusicaisFrequenciaSom() {
		return listaNotasMusicaisFrequenciaSom;
	}

	/**
	 * <p>Atribui o valor de listaNotasMusicaisFrequenciaSom.</p>
	 * @param listaNotasMusicaisFrequenciaSom para gravar no atributo listaNotasMusicaisFrequenciaSom.
	 */
	public void setListaNotasMusicaisFrequenciaSom(
			List<NotaMusicalFrequenciaSom> listaNotasMusicaisFrequenciaSom) {
		this.listaNotasMusicaisFrequenciaSom = listaNotasMusicaisFrequenciaSom;
	}

	

}
