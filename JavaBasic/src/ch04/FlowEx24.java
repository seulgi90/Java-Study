package ch04;

import java.util.Scanner;

public class FlowEx24 {

	public static void main(String[] args) {
		
		// while 문의 조건식은 생략 불가
		int i = 11;
		System.out.println("카운트 다운을 시작합니다");
		
		while(i-- != 0) {
			System.out.println(i);
			for (int j =0; j<2_000_000_000; j++) {
				
			}
		}
		System.out.println("Game Over");
	}
//	카운트 다운을 시작합니다
//	10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//	Game Over
}
