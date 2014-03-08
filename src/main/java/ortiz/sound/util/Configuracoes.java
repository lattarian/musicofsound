package ortiz.sound.util;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Configuracoes {
	
		// 8000,11025,16000,22050,44100
		public static final int SAMPLE_RATE_DEFAULT = 44100;
		// 8,16
		public static final int SAMPLE_SIZE_BITS = 16;
		/** Constante com a janela de tempo que sera calculada a fft */
		public static final double DELTA_TEMPO_ANALISE;
		
		public static final int NUMERO_FREQUENCIAS_RELEVANTES = 5;
		
		public static final BigDecimal AMPLITUDE_CORTE = new BigDecimal(600d);
		
		private static final double DELTA_TEMPO_ANALISE_INICIAL = 0.2d;
		
		public static final int BUFFER_SIZE; 
		
		static {
			int logAmostrasBase2 = (int)Math.floor((Math.log(Configuracoes.SAMPLE_RATE_DEFAULT * DELTA_TEMPO_ANALISE_INICIAL) / Math.log(2)));
			// divisao por 8 é porque o valor é representado por 2 bytes
			int qtdAmostras = (int) Math.pow(2, logAmostrasBase2);
			
			BUFFER_SIZE = (int) qtdAmostras * (Configuracoes.SAMPLE_SIZE_BITS / 8);
			BigDecimal qtdAmostrasBig = new BigDecimal(qtdAmostras);
			BigDecimal sampleRateBig = new BigDecimal(SAMPLE_RATE_DEFAULT);
			
			DELTA_TEMPO_ANALISE = qtdAmostrasBig.divide(sampleRateBig, 4, RoundingMode.HALF_UP).doubleValue();
		}
}
