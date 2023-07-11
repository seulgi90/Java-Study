package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {

		final int SIZE = 5;

		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}

		// 배열에 저장된 값을 뒤섞는다
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				// bingo[i][j]와 임으로 선택 된 값을 바꾼다
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
					System.out.println();
				}
			}
			System.out.println();
			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			// 입력 받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0 을 저장
			outer: 
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 이중 반복문을 벗어난다
					}
				}
			}
		} while (num != 0);
	}

}
