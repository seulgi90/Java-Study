package ch02;

public class FloatToBinEx {

	public static void main(String[] args) {

		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f); // 9.123457
		System.out.printf("%X%n", i); // 4111F9AE :16 진수로 출력
	}

}
