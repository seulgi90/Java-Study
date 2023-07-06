package ch04;

import java.util.Scanner;

public class FlowEx23 {

	public static void main(String[] args) {
		
		// while 문의 조건식은 생략 불가
		int i = 5;
		
		while(i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
		
//		4 - I can do it.
//		3 - I can do it.
//		2 - I can do it.
//		1 - I can do it.
//		0 - I can do it.
	}
}
