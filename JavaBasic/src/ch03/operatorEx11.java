package ch03;

public class operatorEx11 {

	public static void main(String[] args) {

		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); // 'd' - 'a' = 3  (68 -65 = 3)
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero); // '2' - '0' = 2 (50 -48) : 문자 '2(50)'를 숫자로 변환하려면 '0(48)'을 뺴주면 된다
		System.out.printf("'%c'= %d%n", a, (int) a); // 'a'= 97
		System.out.printf("'%c'= %d%n", d, (int) d); // 'd'= 100
		System.out.printf("'%c'= %d%n", zero, (int) zero); // '0'= 48
		System.out.printf("'%c'= %d%n", two, (int) two); // '2'= 50
		
	}

}