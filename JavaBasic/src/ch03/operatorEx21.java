package ch03;

public class operatorEx21 {

	public static void main(String[] args) {

		System.out.printf("10 == 10.0ㄹ \t %b%n", 10 == 10.0f); // 10 == 10.0ㄹ 	 true
		System.out.printf("'0' == 0 \t %b%n", '0' == 0); // '0' == 0 	 false (문자'0' = 48)
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65); // 'A' == 65 	 true
		System.out.printf("'A' == 'B' \t %b%n", 'A'>'B'); // 'A' == 'B' 	 false
		
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1>'B'); // 'A'+1 != 'B' 	 false
		System.out.printf("'A'+1 == 'B' \t %b%n", 'A'+1 =='B'); // 'A'+1 == 'B' 	 true
	}

}