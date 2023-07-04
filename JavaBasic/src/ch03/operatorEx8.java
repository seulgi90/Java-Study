package ch03;

public class operatorEx8 {

	public static void main(String[] args) {

		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // int타입과  int타입의 연산결과는 int 타입이다  -> long형으로 자동 형변환이되어도 값은 변하지 않는다
		long d = (long)a * b; // 올바른 결과를 얻드려면 변수 a 또는 b의 타입을 long 으로 형변환해야한다
		
		System.out.println(c); // -1454759936
		
		System.out.println(d); // 2000000000000

		
	}

}
