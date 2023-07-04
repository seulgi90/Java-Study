package ch03;

public class operatorEx13 {

	public static void main(String[] args) {

		char c = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println(c++); // abcdefghijklmnopqrstuvwxyz
		}
		
		System.out.println();
		
		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println(c++); // ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		System.out.println();
		
		c = '0';
		for (int i = 0; i < 10; i++) {
			System.out.println(c++); // 0123456789
		}
	}

}