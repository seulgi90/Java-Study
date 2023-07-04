package ch03;

public class operatorEx12 {

	public static void main(String[] args) {

		char c1 = 'a';
		System.out.println(c1); // a
		
		char c2 = c1;
		System.out.println(c2); // a
		
		char c3 = ' ';
		
		int i = c1 + 1; // 연산 결과 int형임에 유의 
		c3 = (char) (c1 + 1); // 98
		c2++; // 98
		c2++; // 99
		
		System.out.println("i=" + i); // i=98
		System.out.println("c2=" + c2); // c2=c
		System.out.println("c3=" + c3); // c3=b
	
		
	}

}