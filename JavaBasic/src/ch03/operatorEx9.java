package ch03;

public class operatorEx9 {

	public static void main(String[] args) {

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		long c = a * b;
		
		System.out.println("a= " + a); // a= -727379968 : int타입과 int타입의 연산결과는 int 타입, int 타입의 최대값을 넘어선 오버플로우 발생
		System.out.println("b= " + b); // b= 1000000000000

		
	}

}
