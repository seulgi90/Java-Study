package ch05;

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]); // 3092539244
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++; 
			// i = 0 -> numArr[0] = 3 -> counter[3]의 값을 1로 증가 시킨다 
			// i = 5 -> numArr[5] = 3 -> counter[3]이 되므로 1 + 1 -> 2가 된다 
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 =" + counter[i]);
//					0의 개수 =1
//					1의 개수 =0
//					2의 개수 =2
//					3의 개수 =2
//					4의 개수 =2
//					5의 개수 =1
//					6의 개수 =0
//					7의 개수 =0
//					8의 개수 =0
//					9의 개수 =2
		}
	}
	
}
