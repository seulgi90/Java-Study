package ch06;

public class FactorialTest2 {

	public static void main(String[] args) {
		int result = factorial(4);

		System.out.println(result); // 4*3*2*1 = 24 
	}

	static int factorial(int n) {
		
		int result = 0;
		
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1); // 다시 메서드 자신을 호출한다 (재귀호출)
		}
		return result;
	}
}
