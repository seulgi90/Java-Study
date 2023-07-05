package ch03;

public class operatorEx28 {

	public static void main(String[] args) {

		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x)); 
		// x = 0XAB 		00000000000000000000000010101011
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y)); 
		// y = 0XF 		00000000000000000000000000001111
		
		System.out.printf("%#X | %#X = %#X \t%S%n", x, y, x |y,  toBinaryString(x|y)); 
		// 0XAB | 0XF = 0XAF 	00000000000000000000000010101111
		
		System.out.printf("%#X & %#X = %#X \t%S%n", x, y, x &y,  toBinaryString(x&y));
		// 0XAB & 0XF = 0XB 	00000000000000000000000000001011
		
		System.out.printf("%#X ^ %#X = %#X \t%S%n", x, y, x ^y,  toBinaryString(x^y));
		// 0XAB ^ 0XF = 0XA4 	00000000000000000000000010100100
		//  XOR -> = 0 , !=1
		System.out.printf("%#X ^ %#X ^ %#X = %#X \t%S%n", x, y, y, x ^ y ^ y,  toBinaryString(x^y^y));
		// 0XAB ^ 0XF ^ 0XF = 0XAB 	00000000000000000000000010101011
	}
	
	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}