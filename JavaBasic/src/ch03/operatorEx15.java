package ch03;

public class operatorEx15 {

	public static void main(String[] args) {

		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32); // char형과 int 형간 뺄셈연산 결과는 int 형이무로, char형으로 다시 형변환 필요함에 유의!
		
		System.out.println(upperCase); // A
	
		// 대문자와 소문자 간의 코드값 차이는 10진수로 32 이다
		// 소문자 -> 대문자 =  소문자 - 32
		// 대문자 -> 소문자 = 대문자 + 32
	}

}