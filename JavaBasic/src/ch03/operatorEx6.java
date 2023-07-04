package ch03;

public class operatorEx6 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 20;
//		byte c = a + b; // error : 이항 연산자는 피연산자의 크기가 4 byte보다 작으면 4byte(int형)로 변환한 다음에 연산을 수행한다 
		byte c = (byte) (a + b);
		
		System.out.println(c); // 30

		
	}

}
