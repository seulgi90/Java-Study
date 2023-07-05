package ch03;

import java.util.Scanner;

public class operatorEx26 {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b); // a=5, b=0
		System.out.printf("a != 0 || ++b !=0 = %b%n",  a!=0 || ++b !=0); 
		// a != 0 || ++b !=0 = true 
		// a != 0 의 결과가 참이라서 우측 피연산자를 평가하지 않았기 때문 
		
		System.out.printf("a=%d, b=%d%n",  a, b); // a=5, b=0
		System.out.printf("a==0 && ++b !=0 =  b=%b%n",  a==0 && ++b !=0); 
		// a==0 && ++b!=0 =  b=false
		System.out.printf("a=%d, b=%d%n",  a, b); // a=5, b=0
		
	}

}