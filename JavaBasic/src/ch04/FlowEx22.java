package ch04;

import java.util.Scanner;

public class FlowEx22 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		for (int i =0; i < arr.length;i++) {
			System.out.printf("%d", arr[i]); // 1020304050
		}
		System.out.println();
		for (int tmp : arr) {
			System.out.printf("%d", tmp); // 1020304050
			sum += tmp;
		}
		
		System.out.println();
		System.out.println("sum="+sum); // sum=150
	}
}
