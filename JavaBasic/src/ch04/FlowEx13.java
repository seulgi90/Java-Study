package ch04;

import java.util.Scanner;

public class FlowEx13 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i =1; i <=10 ; i++) {
			sum += i; // sum = sum + i
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
//			1부터  2까지의 합:  3
//			1부터  3까지의 합:  6
//			1부터  4까지의 합: 10
//			1부터  5까지의 합: 15
//			1부터  6까지의 합: 21
//			1부터  7까지의 합: 28
//			1부터  8까지의 합: 36
//			1부터  9까지의 합: 45
//			1부터 10까지의 합: 55
		}
	}
}
