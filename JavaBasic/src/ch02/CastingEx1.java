package ch02;

public class CastingEx1 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = (int) d;
		
		System.out.println("d = "+d); // d = 85.4
		System.out.println("score = "+score); // score = 85

		// 기본형(primitive type)에서 boolean을 제외한 나머지 타입들은 서로 형변환 가능
		// 기본형과 참조형간의 형변환은 불가능
	
	}

}
