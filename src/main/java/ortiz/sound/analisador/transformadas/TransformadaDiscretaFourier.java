package ortiz.sound.analisador.transformadas;


public class TransformadaDiscretaFourier {
	
	/**
	 * 
	 * <p>
	 * TODO Inserir a descricao do metodo
	 * </p>
	 *
	 * @param transformadaInput
	 * @return
	 */
	public TransformadaOut efetuarTransformada(TransformadaIn transformadaInput) {
		
		double[] amostras = transformadaInput.getAmostras();
		
		int N = amostras.length;
		
		double amostrasPorSegundo = transformadaInput.getAmostrasPorSegundo();
		int numMaxFrequencias = N / 2;
		
		double[] frequencias = new double[numMaxFrequencias];
		double[] amplitudes = new double[numMaxFrequencias];
		
		double T = N / amostrasPorSegundo;
		double f0 = 1/T;
		double[][] X = new double[N][2]; 
		
		for (int k = 0; k < N; k++) {

			double somaSenos = 0;
			double somaCosenos = 0;
			
			for (int n = 0; n < N; n++) {
				// e^(j*w*t) = cos(w*t) + j*sen(w*t)
				double twoPInjk = k * n * 2 * Math.PI / N;
				somaCosenos += amostras[k] * Math.cos(twoPInjk);
				somaSenos -= amostras[k] * Math.sin(twoPInjk);
			}
			somaCosenos = somaCosenos / N;
			somaSenos = somaSenos / N;
			
			// MAGNITUDE
			amplitudes[k] = Math.sqrt(Math.pow(somaCosenos, 2) + Math.pow(somaSenos, 2));
			// double amplitude = F[n]/N;
			frequencias[k] = f0 * k ;
			X[k] = new double[] { somaCosenos, somaSenos };
			
		}
		
		TransformadaOut output = new TransformadaOut(frequencias, amplitudes, X);
		return output;
		
	}
}
