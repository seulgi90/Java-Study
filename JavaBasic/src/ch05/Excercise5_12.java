package ch05;

import java.util.Scanner;

public class Excercise5_12 {

	public static void main(String[] args) {
		
//				Q1. chair의 뜻은?  dmlwk 
//				틀렸습니다 정답은 의자입니다 .
//				Q2. computer의 뜻은 ?  컴퓨터
//				정답입니다.
//				Q3. integer의 뜻은 정수 ? 
//				정답입니다.
//				전체 3문제 중 2문제 맞추셨습니다

		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

			String tmp = sc.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
				counter++;
				
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);

			}

		}
		System.out.println("전체 " + words.length + "문제 중" + counter + "문제 맞추셨습니다.");
	}
}

