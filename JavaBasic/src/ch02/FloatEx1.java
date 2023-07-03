package ch02;

public class FloatEx1 {

	public static void main(String[] args) {

		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		// %f는 기본적으로 소수점 이하 6자리까지만 출력, 7번쨰 자리에서 반올림
		System.out.printf("    123456789012345678901234%n"); //     123456789012345678901234
		System.out.printf("f  : %f%n", f); // f  : 9.123457 : 소수점 이하 6째자리까지 출력 _7번쨰 자리에서 반올림되었다
		System.out.printf("f  : %24.20f%n", f); // f  :   9.12345695495605500000 : 24자리 중에서 20자리는 소수점 이하의 수를 출력하라
		System.out.printf("f2  : %24.20f%n", f2); // f2  :   1.23456788063049320000 : 간혹 8자리이상 일치하는 경우도 있지만 항상 그런 것은 아님에 유의!
		System.out.printf("d  : %24.20f%n", d); // d  :   9.12345678901234600000
		
		
		
	}

}
