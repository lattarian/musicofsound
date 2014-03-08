package ortiz.sound.visao;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * 
 * <p>
 *	Classe responsável por criar gráficos FreeChart do som.  <br/>
 *	Data: 05/09/2012 <br/>
 * </p>
 * 
 * @author Marcelo Ortiz
 */
public class RenderizadorFreeChart {
	
	/**
	 * 
	 * <p>
	 * Obtém o gráfico da música.
	 * </p>
	 *
	 * @param frameRate - frames por segundo.
	 * @param amostras - Dados da amostra.
	 * @return ChartPanel com o gráfico representando os dados.
	 */
	public ChartPanel obterGraficoMusica(double frameRate, double[] amostras) {
		
		XYSeries seriesDiscreta = new XYSeries("Música");
		for (int i = 0; i < amostras.length; i = i + 50) {
			seriesDiscreta.add((1/frameRate) * i, amostras[i]);
		}
		XYSeriesCollection discretaCollection = new XYSeriesCollection();
		discretaCollection.addSeries(seriesDiscreta);
		JFreeChart chartMusicaDiscreta = ChartFactory.createXYLineChart(
				"Som no Tempo", "Tempo(s)", "Amplitude",
						discretaCollection, PlotOrientation.VERTICAL, true,
						true, false);
		ChartPanel chartPanelDiscreta = new ChartPanel(chartMusicaDiscreta);

		return chartPanelDiscreta;
	
	}
}
