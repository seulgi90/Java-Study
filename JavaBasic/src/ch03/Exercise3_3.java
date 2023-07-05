package ch03;

public class Exercise3_3{

	public static void main(String[] args) {
		
		// num에 값에 따라 양수, 음수 , 0을 출력하는 코드
		int num = 10;
		
		System.out.println( num > 0 ? "양수" + num : ( num < 0 ? "음수" + num : "0"));
	}
}