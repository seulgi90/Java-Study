package ch04;

public class Exercise4_12 {

	public static void main(String[] args) {

//		2*1=2 3*1=3 4*1=4
//		2*2=4 3*2=6 4*2=8
//		2*3=6 3*3=9 4*3=12
//		5*1=5 6*1=6 7*1=7
//		5*2=10 6*2=12 7*2=14
//		5*3=15 6*3=18 7*3=21
//		8*1=8 9*1=9
//		8*2=16 9*2=18
//		8*3=24 9*3=27
		
		for (int i = 2; i<= 9; i++) {
			for (int j =1; j<=3; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
				
			}
			System.out.println();
		}
		
		
	}
}