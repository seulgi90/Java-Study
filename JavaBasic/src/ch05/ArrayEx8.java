package ch05;

import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		int[] ball  = new int[45];
		
		// 배열의 각요소에 1~45의 값을 저장한다
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 1이 저장이 된다
		}
		int temp = 0; 
		int j = 0;
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
		// 0번쨰 부터 5번쨰 요소까지 모두 6개만 바꾼다
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45) ;
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		// 배열 ball의 앞에서 붜 6개의 요소를 출력한다
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
//		ball[0]=17
//		ball[1]=33
//		ball[2]=42
//		ball[3]=35
//		ball[4]=26
//		ball[5]=28
		
	}
	
}
