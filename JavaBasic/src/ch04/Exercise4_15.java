package ch04;

import java.util.Scanner;

public class Exercise4_15 {

	public static void main(String[] args) {

//		 다음은 회문수를 구하는 프로그램이다 회문수 란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다 
//		예를 들면 ‘12321’이나 ‘13531’ 같은 수를 말한다. 알맞은 코드를 넣어서 프로그램을 완성하시오

		int number = 12321;
		int tmp = number;
		int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
		while (tmp != 0) {

			result = result * 10 + tmp % 10; // 10 . 기존 결과에 을 곱해서 더한다
			tmp /= 10;

		}
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}