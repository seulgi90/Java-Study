package ch04;

public class Exercise4_3{

	public static void main(String[] args) {
	
		int n = 0;
		int sum = 0;
		
		for (int i = 1; i<=10; i++) {
			n += i;
			sum += n;
		}
		System.out.println(sum); // 220
	}

}