package ch02;

public class PrintfEx2 {

	public static void main(String[] args) {

		String url = "wwww.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // f1=0.100000, 1.000000e-01, 0.100000
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // f2=10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); //f3=3140.000000, 3.140000e+03, 3140.00
		// %e : 지수 표현식
		
		// %f : 소수점 아래 6자리까지만 출력 -> 소수점 아래 7자리에서 반올림
		System.out.printf("d=%f%n", d); // d=1.234568
		System.out.printf("d=%14.10f%n", d); // d=  1.2345678900 (%14.10f: 전체 14자리 중 소수점 10자리)
		
		System.out.printf("[12345678901234567890]%n");// [12345678901234567890]
		System.out.printf("[%s]%n", url);// [wwww.codechobo.com]
		System.out.printf("[%20s]%n", url);// [  wwww.codechobo.com]
		System.out.printf("[%-20s]%n", url);// [wwww.codechobo.com  ]  : 왼쪽 정렬 후 남은 자리 공백
		System.out.printf("[%.8s]%n", url);// [wwww.cod]  : 왼쪽에서 8글자만 출력
		
		
		
	}

}
