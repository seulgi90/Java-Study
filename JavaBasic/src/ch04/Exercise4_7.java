package ch04;

public class Exercise4_7{

	public static void main(String[] args) {
		
		// ] Math.random() 1 6 value 을 이용해서 부터 사이의 임의의 정수를 변수 에 저장하는 코드를 완성하라
		
		int value = (int) ( Math.random() * 6 ) + 1;
		
		System.out.println("value:"+value);

	}
	// 0.0 * 6 <= Math.random() * 6 < 1.0 * 
	// 0 + 1 <= (int)(Math.random() * 6) + 1 < 6 + 1
	// 1 <= (int)(Math.random() * 6) + 1 < 7

}