package ch03;

public class Exercise3_1{

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33); // 6  33- 32비트 =1비트 이동
		System.out.println(1 + x << 34); // 6 34 -32비트 = 2비트 이동
		System.out.println(1 + x << 34); 
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

	}

}