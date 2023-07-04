package ch03;

public class operatorEx22 {

	public static void main(String[] args) {

		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f); // 10.0 == 10.0f true
		System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f); // 0.1 == 0.1f false 
		// 정수형 과는 달리 실수형은 근사값으로 저장되므로 오차가 발생 할 수 있기 떄문
		// 10.0f는 오차없이 저장할 수 있는 값이라서 double로 형변환해도 그대로 10.0이 되지만
		// 0.1f는 저장할 떄 2진수로 변환하는 과정에서 오차가 발생
		
		System.out.printf("f == %19.17f%n", f); // f == 0.10000000149011612
		System.out.printf("d == %19.17f%n", d); // d == 0.10000000000000000
		System.out.printf("d2 == %19.17f%n", d2); // d2 == 0.10000000149011612
	}

}