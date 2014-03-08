package ortiz.sound;

public class TesteBitReverso {
	
	public static void main(String[] args) {
		int num1 = 25;
		int result = num1;
		int bitCount = getBitCount(num1);
		
		System.out.println(bitCount);
		
		int bitMask = 1;
	
		for (int i = 1; i < bitCount; i++)
		{   
		  result <<= 1;
		  result |= (num1 >>= 1) & 1;
		  bitMask |= bitMask << 1;
		  
		}
		
		result &= bitMask;
		System.out.println(result);
	}
	
	public static int getBitCount(int numero) {
		int count = 0;
		int valorSoma = 1;
		while (valorSoma <= numero) {
			valorSoma <<= 1;
			count ++;
		}
		return count;
	}
}