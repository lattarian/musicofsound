package ortiz.sound.analisador.transformadas;



/**
 * 
 * <p>
 *	TODO Colocar documentação aqui  <br/>
 *	Data: 23/11/2012 <br/>
 * </p>
 * 
 * @author marcelo.ortiz
 */
public class TransformadaRapidaFourier {
	
	/**
	 * 
	 * <p>
	 * Faz a transformada.
	 * </p>
	 * 
	 * @param transformadaInput
	 *            - Dados de entrada.
	 * @return Objeto contendo as frequências, amplitudes e complexos.
	 */
public TransformadaOut efetuarTransformada(TransformadaIn transformadaInput) {
	
	double[] amostras = transformadaInput.getAmostras();
	
	int N = amostras.length;
	double[][] x = new double[N][2];
	
	for (int i = 0; i < x.length; i++) {
		x[i][0] = amostras[i];
	}
	
	double[][] X = fft(x);
	
	double amostrasPorSegundo = transformadaInput.getAmostrasPorSegundo();
	int numMaxFrequencias = N / 2;
	
	double[] frequencias = new double[numMaxFrequencias];
	double[] amplitudes = new double[numMaxFrequencias];
	
	double T = N / amostrasPorSegundo;
	double f0 = 1/T;
	
	for (int i = 0; i < numMaxFrequencias; i++) {
		double[] complexo = X[i];
		
		// MAGNITUDE
		amplitudes[i] = Math.sqrt(Math.pow(complexo[0], 2) + Math.pow(complexo[1], 2));
		frequencias[i] = f0 * i ;
	}
	
	TransformadaOut resultado = new TransformadaOut(frequencias, amplitudes, X);
	return resultado;
}
	
	/**
	 * 
	 * <p>
	 * Efetua a transformada rápida de Fourier de maneira recursiva. Primeiro
	 * organiza-se os elementos com o processo chamado bit reverso, depois os
	 * cálculos são feitos para os dados com dados pares e ímpares.
	 * </p>
	 * 
	 * @param x - dados que serão transformados. A medida que forem
	 *            calculados, a segunda dimensão do array, significando um
	 *            número imaginário, será preenchido se houver. A primeira vez
	 *            que é chamado esse método, o valor do número imaginário é
	 *            zero.
	 * @return Array significando os números complexos, onde, o primeiro
	 *         elemento do array é o número real, e o segundo o número
	 *         imaginário.
	 */
private double[][] fft(double[][] x) {
	int N = x.length;

    // base case
    if (N == 1) return new double[][]{{x[0][0], 0.0}};

    // se nao possuir tamanho de potência de 2, lançamos uma exception.
	if (N % 2 != 0) {
			throw new IllegalArgumentException(
					"Array com os dados amostrais deve possuir tamanho de potência de 2");
	}

	int metadeElementos = N/2;
    // Separamos os elementos pares e impares
    double[][] dadosPares = new double[metadeElementos][2];
    double[][] dadosImpares = new double[metadeElementos][2];
    
    for (int k = 0; k < N/2; k++) {
        dadosPares[k] = x[2*k];
        dadosImpares[k] = x[2*k + 1];
    }
    
	// fazemos os calculos recursivos. Quando só houver um elemento, os
	// dados impares serao calculados
    double[][] complexosPares = fft(dadosPares);
    double[][] complexosImpares = fft(dadosImpares);

    // combinamos os termos 
    double[][] X = new double[N][2];
    for (int k = 0; k < N/2; k++) {
        // e^(-i(2pi/N) * k) 
    	double _2pikN = -2 * k * Math.PI / N;
        
        double cos = Math.cos(_2pikN);
        double sen = Math.sin(_2pikN);
        
        X[k][0] = complexosPares[k][0] + (cos * complexosImpares[k][0]);
        X[k][1] = complexosPares[k][1] + (sen * complexosImpares[k][1]);
        // nos aproveitamos das propriedades de simetria da Identidade de Euler
        X[k + N/2][0] = complexosPares[k][0] - (cos * complexosImpares[k][0]);
        X[k + N/2][1] = complexosPares[k][1] - (sen * complexosImpares[k][1]);
    }
    
    return X;
}
}
