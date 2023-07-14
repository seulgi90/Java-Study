package ch05;

public class Excercise5_4 {
	
	public static void main(String[] args) {
		
//		2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
				int total = 0;
				float average = 0;
				
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						total += arr[i][j];
					}
				}
				average = total / (float) (arr.length * arr[0].length);
//				두 개의 피연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환 된 후 연산을 수행한다
//				int / float float / float float
				
				System.out.println("total="+total); // total=325
				System.out.println("average="+average); // average=16.25
				
		
	}
}
