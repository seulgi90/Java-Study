package ch04;

import java.util.Scanner;

public class FlowEx15 {

	public static void main(String[] args) {

		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("------------------------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
		
//		i 	 2*i 	 2*i-1 	 i*i 	 11-i 	 i%3 	 i/3
//		------------------------------------------------
//		1 	 2 	 		1 	 	1 	 10 	 1 	 	 0
//		2 	 4 	 		3 	 	4 	 9 	 	 2 		 0
//		3 	 6 	 		5 	 	9 	 8 		 0 		 1
//		4 	 8 	 		7 	 	16 	 7 		 1 		 1
//		5 	 10 	 	9 	 	25 	 6 		 2 		 1
//		6 	 12 	 	11 	 	36 	 5 		 0 		 2
//		7 	 14 	 	13 	 	49 	 4 		 1 		 2
//		8 	 16 	 	15 	 	64 	 3 		 2 		 2
//		9 	 18 	 	17 	 	81 	 2 		 0 		 3
//		10 	 20 	 	19 	 	100  1 		 1 		 3
	}
}
