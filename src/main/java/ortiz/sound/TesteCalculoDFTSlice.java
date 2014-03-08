package ortiz.sound;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class TesteCalculoDFTSlice extends JFrame {

	private static final long serialVersionUID = -1497329430161987725L;

	public static void main(String[] args)
			throws UnsupportedAudioFileException, IOException {

		File file = new File("c://temp//junk.wav");

		AudioInputStream ais = AudioSystem.getAudioInputStream(file);

		AudioFormat audioFormat = ais.getFormat();


		double frameRate = audioFormat.getFrameRate();
		int N = (int) ais.getFrameLength();

		byte[] buffer = new byte[1024];
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		while (true) {

			int read = ais.read(buffer);

			if (read == -1) {
				break;
			}
			bos.write(buffer, 0, read);
		}

		// this array is the value of the signal at time i*h
		int y[] = new int[N];

		// convert each pair of byte values from the byte array to an Endian
		// value

		byte[] bytesReaded = bos.toByteArray();

		int idxSampl = 0;
		
		for (int i = 0; i < bytesReaded.length; i = i + 2) {
			{
				long val = 0;
				int v = bytesReaded[i];
				val += v;
				v = bytesReaded[i + 1];
				val += v << (8);
				y[idxSampl++] = (int) val;
			}
		}

		idxSampl = 0;
		double deltaT = 0.1d;
		int NFinal = 0;
		int idx = 0;
		while (NFinal <= y.length) {
			int NInicial = NFinal;
			NFinal = (int) (NInicial + deltaT * frameRate);
			
			int[] dadosAnalise = Arrays.copyOfRange(y, NInicial, NFinal); 
			
			N = dadosAnalise.length;
			
			double f0 = 1 / deltaT;
	
			XYSeries seriesFrequencia = new XYSeries("Spectro de Frequencias DFT ("+ idx++ * deltaT +")");
			int MAXSIZE = N/2;
	
			double F[] = new double[MAXSIZE];
			
			XYSeriesCollection frequenciaCollection = new XYSeriesCollection();
			JFreeChart chartFrequencias = ChartFactory.createXYLineChart(
					"Spectro das Frequências", "Frequencia (Hz)", "Amplitude",
					frequenciaCollection, PlotOrientation.VERTICAL, true, true,
					false);
			
			XYPlot plot = chartFrequencias.getXYPlot();
	
			for (int n = 0; n < MAXSIZE - 1; n++) {
	
				double somaSenos = 0;
				double somaCosenos = 0;
				
				somaCosenos += dadosAnalise[0];
	
				for (int k = 1; k < N; k++) {
					// e^(j*w*t) = cos(w*t) + j*sen(w*t)
					double twoPInjk = n * k * 2 * Math.PI / N;
	
					somaCosenos += dadosAnalise[k] * Math.cos(twoPInjk);
					somaSenos -= dadosAnalise[k] * Math.sin(twoPInjk);
				}
				// normaliza os dados
				/*somaCosenos /= N;
				somaSenos /= N;*/
	
				// MAGNITUDE
				F[n] = Math.sqrt(Math.pow(somaCosenos / N, 2)
						+ Math.pow(somaSenos / N, 2));
	
				double amplitude = F[n];
	
				// double amplitude = F[n]/N;
				double frequency = f0 * n ;
				
				seriesFrequencia.add(frequency, amplitude);
				
				if (amplitude > 100) {
					
					// indica que retornou a media indicando uma pausa
					/*Entry<Double, NotaMusical> notaFrequencia =  NotaMusicalFrequenciaSom.obterNota(frequency);
					if (notaFrequencia != null) {
						XYPointerAnnotation pontoFrequencia = new XYPointerAnnotation(notaFrequencia.getValue().getNota() + notaFrequencia.getValue().getOitava(), frequency, amplitude, 3*Math.PI/2);
						pontoFrequencia.setPaint(Color.BLACK);
				        plot.addAnnotation(pontoFrequencia);	
					}*/
					
				}
			}
			
			
			frequenciaCollection.addSeries(seriesFrequencia);
			ChartPanel chartPanel = new ChartPanel(chartFrequencias);
	
			TesteCalculoDFTSlice calculoFrequencia = new TesteCalculoDFTSlice();
			calculoFrequencia.setSize(200, 200);
			calculoFrequencia.add(chartPanel);
			calculoFrequencia.setVisible(true);
			
		}	
		
	}
}
