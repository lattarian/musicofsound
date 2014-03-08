package ortiz.sound.capturador;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import ortiz.sound.patterns.observador.ObservadorLeituraSom;
import ortiz.sound.patterns.observador.ObservavelLeituraSom;
import ortiz.sound.util.Configuracoes;

/**
 * 
 * <p>
 * Capturador de som. <br/>
 * Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class CapturadorSom implements ObservavelLeituraSom {
	/** Lista de observadores */
	private List<ObservadorLeituraSom> listaObservadores;
	/** Formato de audio */
	private AudioFormat audioFormat;
	/** Data line de entrada */
	private TargetDataLine targetDataLine;
	/** Stream com os bytes do audio */
	private ByteArrayOutputStream outputStream;
	
	/** Thread para capturarmos o som */
	private CapturadorThread capturadorThread;

	
	public CapturadorSom() {
		this.audioFormat = getAudioFormat();
		this.listaObservadores = new ArrayList<ObservadorLeituraSom>();
	}
	
	/**
	 * 
	 * <p>
	 * Efetua a gravação.
	 * </p>
	 * 
	 * @throws CapturadorSomException
	 *             - Lançado caso ocorram erros.
	 */
	public void capturar() throws CapturadorSomException {

		DataLine.Info dataLineInfo = new DataLine.Info(TargetDataLine.class,
				this.audioFormat);
		try {
			
			this.targetDataLine = (TargetDataLine) AudioSystem
					.getLine(dataLineInfo);
			this.targetDataLine.open(this.audioFormat);
			
			this.capturadorThread = new CapturadorThread();
			this.capturadorThread.start();
			
		} catch (LineUnavailableException e) {
			throw new CapturadorSomException(e);
		}
	}

	/**
	 * 
	 * <p>
	 * Método que muda a flag indicando que é para parar a gravação.
	 * </p>
	 * 
	 */
	public void parar() {
		
		this.targetDataLine.close();
		// fazemos uma thread que esperará por 10 segundos. Caso a thread nao
		// pare antes desses 10 segundos, interrompemos ela. 
		/*Thread threadVerificadora = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
					if (CapturadorSom.this.capturadorThread.isAlive()) {
						CapturadorSom.this.capturadorThread.interrupt();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					notificarFimLeituraSom();
				}
			}
		});
		
		threadVerificadora.start();*/
	}

	/**
	 * 
	 * <p>
	 * Obtém o formato de audio.
	 * </p>
	 * 
	 * @return Formato de audio.
	 */
	private AudioFormat getAudioFormat() {
		// 1,2 (mono ou stereo)
		int channels = 1;
		// true,false
		boolean signed = true;
		// true,false
		boolean bigEndian = false;
		return new AudioFormat(Configuracoes.SAMPLE_RATE_DEFAULT, Configuracoes.SAMPLE_SIZE_BITS, channels,
				signed, bigEndian);
	}

	/**
	 * 
	 * <p>
	 * Classe interna que lê os dados do som. <br/>
	 * Data: 05/09/2012 <br/>
	 * </p>
	 * 
	 * @author Marcelo Ortiz
	 */
	class CapturadorThread extends Thread {
		/**
		 * @see java.lang.Thread#run()
		 */
		public void run() {
			notificarInicioLeituraSom(CapturadorSom.this.audioFormat);
			// buffer deve armazenar o valor multiplo de base 2
			int logAmostrasBase2 = (int)Math.floor((Math.log(Configuracoes.SAMPLE_RATE_DEFAULT * Configuracoes.DELTA_TEMPO_ANALISE) / Math.log(2)));
			// divisao por 8 é porque o valor é representado por 2 bytes
			int bufferSize = (int) Math.floor((int) Math.pow(2, logAmostrasBase2)) * Configuracoes.SAMPLE_SIZE_BITS / 8;
			
			byte[] buffer = new byte[bufferSize];
			try {
				CapturadorSom.this.targetDataLine.start();
				CapturadorSom.this.outputStream = new ByteArrayOutputStream();
				while (CapturadorSom.this.targetDataLine.isOpen()) {
					int readed = CapturadorSom.this.targetDataLine.read(buffer, 0, buffer.length);
					if (readed > 0) {
						notificarLeituraSom(buffer);
						CapturadorSom.this.outputStream.write(buffer);
					}
				}
				
				gravarAudio();
				
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
				this.interrupt();
			} finally {
				notificarFimLeituraSom();
			}
		}
	}

	@Override
	public void adicionarObservador(ObservadorLeituraSom observador) {
		this.listaObservadores.add(observador);
	}

	@Override
	public void removerObservador(ObservadorLeituraSom observador) {
		this.listaObservadores.remove(observador);
	}

	@Override
	public void notificarInicioLeituraSom(AudioFormat audioFormat) {
		for (ObservadorLeituraSom observador : this.listaObservadores) {
			observador.iniciouLeituraSom(audioFormat);
		}
	}

	@Override
	public void notificarLeituraSom(byte[] bytesLidos) {
		for (ObservadorLeituraSom observador : this.listaObservadores) {
			observador.leuTrechoSom(bytesLidos);
		}
	}

	@Override
	public void notificarFimLeituraSom() {
		for (ObservadorLeituraSom observador : this.listaObservadores) {
			observador.finalizouLeituraSom();
		}
	}
	
	public void gravarAudio() throws IOException {
		byte audio[] = this.outputStream.toByteArray();
		InputStream input = new ByteArrayInputStream(audio);
		final AudioInputStream ais = new AudioInputStream(input, this.audioFormat, audio.length
	        / this.audioFormat.getFrameSize());
	    AudioSystem.write(ais,  AudioFileFormat.Type.WAVE, new File("c://temp//junk.wav"));
	}
}