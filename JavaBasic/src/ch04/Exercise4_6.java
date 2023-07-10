package ch04;

public class Exercise4_6{

	public static void main(String[] args) {
		
		// 두 개의 주사위를 던졌을 때 , 눈의 합이 6이되는 모든 경우의 수를 출력
		
		for (int i = 1; i <= 6; i++) {
			for (int j =1 ; j<= 6; j ++) {
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + i+j);
				}
			}
		}
	}
	
//	1+5=15
//	2+4=24
//	3+3=33
//	4+2=42
//	5+1=51

}