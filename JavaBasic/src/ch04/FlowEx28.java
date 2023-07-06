package ch04;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		
		int input = 0, answer = 0;
		
		answer = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			// 조건식의 연산결과가 참일 떄 수행될 문장들을 적는다
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요");
			} else {
				System.out.println("더 큰 수로 다시 시도하세요");
			}
		} while (input != answer);
		System.out.println("정답입니다.");
	}
//	1과 100사이의 정수를 입력하세요.>55
//	더 작은 수로 다시 시도하세요
//	1rhk 100사이의 정수를 입력하세요.>22
//	더 작은 수로 다시 시도하세요
//	1rhk 100사이의 정수를 입력하세요.>1
//	더 큰 수로 다시 시도하세요
//	1rhk 100사이의 정수를 입력하세요.>13
//	더 큰 수로 다시 시도하세요
//	정답입니다.

}
