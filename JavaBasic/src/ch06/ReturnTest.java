package ch06;

public class ReturnTest {

	public static void main(String[] args) {
		
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result); // 8
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]); // 8
		// 반환값이 있는 메서드를 반환값이 없는 메서드로 바꾸는 방법
		// 반환 값이 없어도 참조형 매개변수를 활용하면 실행결과를 얻어올수 있다 
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b; 
	}
}
