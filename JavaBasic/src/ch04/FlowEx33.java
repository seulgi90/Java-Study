package ch04;

import java.util.Scanner;

public class FlowEx33 {

	public static void main(String[] args) {
	
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j =1; j <= 9; j++) {
				if (j==5)
					break Loop1;
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
//				2*1=2
//				2*2=4
//				2*3=6
//				2*4=8

	}

}
