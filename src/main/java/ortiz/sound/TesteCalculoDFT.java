package ortiz.sound;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class TesteCalculoDFT extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1497329430161987725L;

	public static void main(String[] args)
			throws UnsupportedAudioFileException, IOException {

		File file = new File("c://temp//junk.wav");

		AudioInputStream ais = AudioSystem.getAudioInputStream(file);

		AudioFormat audioFormat = ais.getFormat();

		int N = (int) ais.getFrameLength();

		double frameRate = audioFormat.getFrameRate();

		double T = N / frameRate;

		double deltaTempo = (T / N);

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
		
		XYSeries seriesDiscreta = new XYSeries("Música discretizada");
		for (int i = 0; i < N; i = i + 50) {
			seriesDiscreta.add(deltaTempo * i, y[i]);
		}
		XYSeriesCollection discretaCollection = new XYSeriesCollection();
		discretaCollection.addSeries(seriesDiscreta);
		JFreeChart chartMusicaDiscreta = ChartFactory
				.createXYLineChart("Música discreta", "Tempo(s)", "Amplitude",
						discretaCollection, PlotOrientation.VERTICAL, true,
						true, false);
		ChartPanel chartPanelDiscreta = new ChartPanel(chartMusicaDiscreta);

		TesteCalculoDFT calculoTempo = new TesteCalculoDFT();
		calculoTempo.add(chartPanelDiscreta);
		calculoTempo.setSize(200, 200);
		calculoTempo.setVisible(false);

		double f0 = 1 / (T);

		XYSeries seriesFrequencia = new XYSeries("Spectro de Frequencias DFT");
		XYSeries seriesFrequenciaSeno = new XYSeries("Spectro de Frequencias Seno DFT");
		XYSeries seriesFrequenciaCoseno= new XYSeries("Spectro de Frequencias Cosseno DFT");

		//int MAXSIZE = N / 2;
		int MAXSIZE = N/2;

		double F[] = new double[MAXSIZE];
		double FSin[] = new double[MAXSIZE];
		double FCos[] = new double[MAXSIZE];

		for (int n = 0; n < MAXSIZE - 1; n++) {

			double somaSenos = 0;
			double somaCosenos = 0;
			
			somaCosenos += y[0];

			for (int k = 1; k < N; k++) {
				// e^(j*w*t) = cos(w*t) + j*sen(w*t)
				double twoPInjk = n * k * 2 * Math.PI / N;

				somaCosenos += y[k] * Math.cos(twoPInjk);
				somaSenos -= y[k] * Math.sin(twoPInjk);
			}
			// normaliza os dados
			/*somaCosenos /= N;
			somaSenos /= N;*/

			// MAGNITUDE
			F[n] = Math.sqrt(Math.pow(somaCosenos / N, 2)
					+ Math.pow(somaSenos / N, 2));
			FCos[n] = somaCosenos;
			FSin[n] = somaSenos;

			double amplitude = F[n];

			// double amplitude = F[n]/N;
			double frequency = f0 * n ;

			// TODO FREQUENCIA ESTA COM ALGUM ERRO DE CALCULO

			seriesFrequencia.add(frequency, amplitude);
			/*seriesFrequenciaSeno.add(frequency, FSin[n]);
			seriesFrequenciaCoseno.add(frequency, FCos[n]);*/
		}
		XYSeriesCollection frequenciaCollection = new XYSeriesCollection();
		frequenciaCollection.addSeries(seriesFrequencia);
		JFreeChart chartFrequencias = ChartFactory.createXYLineChart(
				"Spectro das Frequências", "Frequencia (Hz)", "Amplitude",
				frequenciaCollection, PlotOrientation.VERTICAL, true, true,
				false);
		ChartPanel chartPanel = new ChartPanel(chartFrequencias);

		TesteCalculoDFT calculoFrequencia = new TesteCalculoDFT();
		calculoFrequencia.setSize(200, 200);
		calculoFrequencia.add(chartPanel);
		calculoFrequencia.setVisible(true);
		
		
		/*XYSeriesCollection frequenciaSenoCollection = new XYSeriesCollection();
		frequenciaCollection.addSeries(seriesFrequenciaSeno);
		JFreeChart chartFrequenciasSeno = ChartFactory.createXYLineChart(
				"Spectro das Frequências", "Frequencia (Hz)", "Amplitude",
				frequenciaSenoCollection, PlotOrientation.VERTICAL, true, true,
				false);
		ChartPanel chartPanelSeno = new ChartPanel(chartFrequenciasSeno);

		TesteCalculoDFT calculoFrequenciaSeno = new TesteCalculoDFT();
		calculoFrequenciaSeno.setSize(200, 200);
		calculoFrequenciaSeno.add(chartPanelSeno);
		calculoFrequenciaSeno.setVisible(true);
		
		XYSeriesCollection frequenciaCossenoCollection = new XYSeriesCollection();
		frequenciaCollection.addSeries(seriesFrequenciaCoseno);
		JFreeChart chartFrequenciasCosseno = ChartFactory.createXYLineChart(
				"Spectro das Frequências", "Frequencia (Hz)", "Amplitude",
				frequenciaCossenoCollection, PlotOrientation.VERTICAL, true, true,
				false);
		ChartPanel chartPanelCosseno = new ChartPanel(chartFrequenciasCosseno);

		TesteCalculoDFT calculoFrequenciaCosseno = new TesteCalculoDFT();
		calculoFrequenciaCosseno.setSize(200, 200);
		calculoFrequenciaCosseno.add(chartPanelCosseno);
		calculoFrequenciaCosseno.setVisible(true);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ChartUtilities.saveChartAsJPEG(new File("c://temp//junk.jpg"),
		// chart, 500, 500);

	}
}
