package ch03;

import java.util.Scanner;

public class operatorEx25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char ch = ' ';
		System.out.printf("문자를 하나 일력하세요.>");
		
		String input = sc.nextLine();
		ch = input.charAt(0); // char()
		
		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'z')) {
			System.out.printf("입력하신 문자는 영문자 입니다.%n");
		}
	}

}