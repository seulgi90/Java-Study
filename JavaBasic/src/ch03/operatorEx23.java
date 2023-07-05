package ch03;

public class operatorEx23 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc"); //  "abc"=="abc" ? true
		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc"); //  str1=="abc" ? true
		
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc"); //  str2=="abc" ? false : 내용은 같지만 서로 다른 객체이기 때문데 다르다
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //  str1.equals("abc") ? true : 문자열 비교는 equals() 사용
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); //  str2.equals("abc") ? tru
		
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); //  str2.equals("ABC") ? false
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); //  str2.equalsIgnoreCase("ABC") ? true
		// 대소문자를 구별하지 않고 비교시 equalsIgnoreCase() 사용
		
	}

}