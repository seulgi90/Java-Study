package ch03;

public class operatorEx29 {

	public static void main(String[] args) {

		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p = %d \t%s%n", p,  toBinaryString(p)); 
		//  p = 10 	00000000000000000000000000001010
		System.out.printf("~p = %d \t%s%n", ~p,  toBinaryString(~p)); 
		// ~ : 1의 보수 연산자
		// ~p = -11 	11111111111111111111111111110101
		System.out.printf("~p+1 = %d \t%s%n", ~p+1,  toBinaryString(~p+1));
		// 2의 보수 = 1의 보수 +1
		// ~p+1 = -10 	11111111111111111111111111110110
		System.out.printf("~~p = %d \t%s%n", ~~p,  toBinaryString(~~p));
		// ~~p = 10 	00000000000000000000000000001010
		System.out.println();
		
		System.out.printf(" n = %d%n", n); 
		//  n = 10 	11111111111111111111111111110110
		System.out.printf("~ (n-1) = %d%n", ~(n-1)); 
		// ~ (n-1) = 10
		
	}
	
	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}