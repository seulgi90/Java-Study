package ch03;

public class Exercise3_9{

	public static void main(String[] args) {
		
		// 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록하는 코드
		
		char ch ='z';
		boolean b = ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z' || '0' <= ch && ch <='9');
		
		System.out.println(b);
	}
}