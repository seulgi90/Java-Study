package ch05;

public class Excercise5_9 {

	public static void main(String[] args) {

//		주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성

		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		
		char[][] result = new char[star[0].length][star.length];
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				
				int x = j;
				int y = star.length-1-i; // i+y = star.length-1 = y = star.length-1-i
				result[x][y]=star[i][j];  //  star[0][0] -> result[0][3], star[0][1] -> result[1][3]
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

		
//		기존
//		**   
//		**   
//		*****
//		*****
		
//		90 회전
//		****
//		****
//		**  
//		**  
//		**
	}
}
