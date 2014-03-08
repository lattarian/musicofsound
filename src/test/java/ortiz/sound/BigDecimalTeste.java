package ortiz.sound;

import java.math.BigDecimal;
import java.text.NumberFormat;

import org.junit.Test;

public class BigDecimalTeste {
	@Test
	public void teste() {
		System.out.println("Actual PI value with no " + "scale defined : "
				+ (double) 22 / 7);

		int i = 22, j = 7;
		BigDecimal a = new BigDecimal(i);
		BigDecimal b = new BigDecimal(j), c = new BigDecimal(0);

		c = a.divide(b, 5, BigDecimal.ROUND_FLOOR);
		System.out.println("PI value with scale 5 : " + c);

		BigDecimal m = new BigDecimal(i);
		BigDecimal n = new BigDecimal(j), o = new BigDecimal(0);

		// Creating NumberFormat class num object
		NumberFormat num = NumberFormat.getInstance();

		// Invoking .setMinimumFraction() in object num
		num.setMinimumFractionDigits(5);
		System.out.println("Formated  PI value : " + num.format(c));

		/*
		 * Here an Arithmetic Exception is thrown by method
		 */
	
		i = 22;
		j = 0;
		BigDecimal x = new BigDecimal(i);
		BigDecimal y = new BigDecimal(j), 
				z = new BigDecimal(0);

		z = x.divide(y, 4, BigDecimal.ROUND_FLOOR);
		System.out.println("PI value with scale 4 : " + c);

	}

}
