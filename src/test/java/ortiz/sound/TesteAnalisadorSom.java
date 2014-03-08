package ortiz.sound;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import ortiz.sound.analisador.AnalisadorSom;
import ortiz.sound.analisador.AnalisadorSomTransformadaRapida;
import ortiz.sound.modelo.DadosAnalise;
import ortiz.sound.patterns.observador.ObservadorFimAnaliseSom;
import ortiz.sound.util.Configuracoes;

public class TesteAnalisadorSom implements ObservadorFimAnaliseSom {
	
	private static List<DadosAnalise> listaDadosAnalisador = new ArrayList<DadosAnalise>();
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException {
		AnalisadorSom analisador = new AnalisadorSom();
		AnalisadorSomTransformadaRapida analisadorRapida = new AnalisadorSomTransformadaRapida();
		
		File file = new File("c://temp//junkSejasLouvado.wav");
		AudioInputStream aos = AudioSystem.getAudioInputStream(file);
		analisador.iniciouLeituraSom(aos.getFormat());
		analisadorRapida.iniciouLeituraSom(aos.getFormat());
		
		int logAmostrasBase2 = (int)Math.floor((Math.log(Configuracoes.SAMPLE_RATE_DEFAULT * Configuracoes.DELTA_TEMPO_ANALISE) / Math.log(2)));
		// divisao por 8 é porque o valor é representado por 2 bytes
		int bufferSize = (int) Math.floor((int) Math.pow(2, logAmostrasBase2)) * Configuracoes.SAMPLE_SIZE_BITS / 8;
		
		byte[] buffer = new byte[bufferSize];
		try {
			while (aos.read(buffer) > 0) {
				analisador.leuTrechoSom(buffer);
				analisadorRapida.leuTrechoSom(buffer);
			}
			analisador.finalizouLeituraSom();
			analisadorRapida.finalizouLeituraSom();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void finalizouAnalise(DadosAnalise dadosAnalise) {
		listaDadosAnalisador.add(dadosAnalise);
	}

}
