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

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class TesteCalculoFFT extends JFrame {

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
		double y[] = new double[N];

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

		XYSeries seriesDiscreta = new XYSeries("M'usica discretizada");
		for (int i = 0; i < N; i = i + 50) {
			seriesDiscreta.add(deltaTempo * i, y[i]);
		}
		XYSeriesCollection discretaCollection = new XYSeriesCollection();
		discretaCollection.addSeries(seriesDiscreta);
		JFreeChart chartMusicaDiscreta = ChartFactory
				.createXYLineChart("M'usica discreta", "Tempo(s)", "Amplitude",
						discretaCollection, PlotOrientation.VERTICAL, true,
						true, false);
		ChartPanel chartPanelDiscreta = new ChartPanel(chartMusicaDiscreta);

		TesteCalculoFFT calculoTempo = new TesteCalculoFFT();
		calculoTempo.add(chartPanelDiscreta);
		calculoTempo.setSize(200, 200);
		calculoTempo.setVisible(false);

		int passos = (int)Math.floor(calcularPassosNecessariosFFT(y.length));

		// devemos utilizar o tamanho do array como potencia de 2
		y = Arrays.copyOf(y, (int) Math.pow(2, passos));
		
		N = y.length;
		T = N / frameRate;
		double f0 = 1 / (T);

		FastFourierTransformer ffFast = new FastFourierTransformer(DftNormalization.STANDARD);
		Complex[] fftResult = ffFast.transform(y, TransformType.FORWARD);
		
		XYSeries seriesFrequencia = new XYSeries("Spectro de Frequencias FFT");
		
		int MAXSIZE = N / 2;
		
		for (int idx = 0; idx < MAXSIZE ; idx++) {
			double amplitude = Math.sqrt(Math.pow(fftResult[idx].getReal() /N, 2) + Math.pow(fftResult[idx].getImaginary()/N, 2));
			double frequency = f0 * idx;
			seriesFrequencia.add(frequency, amplitude);
		}
		
		XYSeriesCollection frequenciaCollection = new XYSeriesCollection();
		frequenciaCollection.addSeries(seriesFrequencia);
		JFreeChart chartFrequencias = ChartFactory.createXYLineChart(
				"Spectro das Frequências", "Frequencia (Hz)", "Amplitude",
				frequenciaCollection, PlotOrientation.VERTICAL, true, true,
				false);
		ChartPanel chartPanel = new ChartPanel(chartFrequencias);

		TesteCalculoFFT calculoFrequencia = new TesteCalculoFFT();
		calculoFrequencia.setSize(200, 200);
		calculoFrequencia.add(chartPanel);
		calculoFrequencia.setVisible(true);
		// ChartUtilities.saveChartAsJPEG(new File("c://temp//junk.jpg"),
		// chart, 500, 500);

	}
	
	public static double calcularPassosNecessariosFFT(int numAmostras) {
		return Math.log(numAmostras) / Math.log(2);
	}
}
