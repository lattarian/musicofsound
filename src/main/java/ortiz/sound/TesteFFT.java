package ortiz.sound;

import java.util.Arrays;

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

public class TesteFFT extends JFrame {

	public static void teste(String[] args) {

		double[] valoresFuncao = new double[400];

		XYSeries seriesDiscreta = new XYSeries("M'usica discretizada");

		double x = 0;
		for (double t = 0; t < 0.5; t = t+0.01) {
			double valor = calcularFuncaoExemplo(t);
			System.out.println(valor);
			valoresFuncao[(int)x++] = valor; 
			seriesDiscreta.add(x, valor);
		}
		
		XYSeriesCollection discretaCollection = new XYSeriesCollection();
		discretaCollection.addSeries(seriesDiscreta);
		JFreeChart chartMusicaDiscreta = ChartFactory
				.createXYLineChart("M'usica discreta", "Tempo(s)", "Amplitude",
						discretaCollection, PlotOrientation.VERTICAL, true,
						true, false);
		ChartPanel chartPanelDiscreta = new ChartPanel(chartMusicaDiscreta);

		TesteFFT calculoTempo = new TesteFFT();
		calculoTempo.add(chartPanelDiscreta);
		calculoTempo.setSize(200, 200);
		calculoTempo.setVisible(true);
		
		
		int passos = (int)Math.ceil(calcularPassosNecessariosFFT(valoresFuncao.length));

		valoresFuncao = Arrays.copyOf(valoresFuncao, (int) Math.pow(2, Math.ceil(passos)));
		System.out.println(valoresFuncao.length);
		FastFourierTransformer ffFast = new FastFourierTransformer(DftNormalization.STANDARD);
		Complex[] fftResult = ffFast.transform(valoresFuncao, TransformType.FORWARD);
		
		System.out.println(fftResult);
		
				
		/*
		 * TENTATIVA DE ORGANIZAR OS ELEMENTOS
		 * double[] aux = new double[valoresFuncao.length];
		for (int passoAtual = 1; passoAtual <= passos; passoAtual++) {
			for (int idxElementos = 0; idxElementos < valoresFuncao.length/2; idxElementos++) {
				aux[idxElementos] = valoresFuncao[idxElementos*2];
				aux[valoresFuncao.length/2 + idxElementos] = valoresFuncao[idxElementos*2];
			}
		}*/
		

		
		
		
	}
	
	public static double calcularPassosNecessariosFFT(int numAmostras) {
		return Math.log(numAmostras) / Math.log(2);
	}

	static double calcularFuncaoExemplo(double tempo) {
		return Math.cos(2 * Math.PI * 5 * tempo)
				+ Math.sin(2 * Math.PI* 20 * tempo);
	}
	
	static double[] organizarSampleTOFFT(double[] samples, int fator){
		
		while(Math.pow(2, fator)<samples.length) {
			for (int passos = 0; passos < fator; passos ++) {
				//double even[] = 
			}
			return organizarSampleTOFFT(samples, fator++);
		}
		
		
		
		return samples;
	}
	

}
