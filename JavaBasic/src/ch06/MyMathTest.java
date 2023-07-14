package ch06;

public class MyMathTest {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // long -> double로 자동 형변환 가능
		
		System.out.println("add = " + result1); // add = 8
		System.out.println("subtract = " + result2); // subtract = 2
		System.out.println("divide = " + result3); // divide = 15
		System.out.println("divide = " + result4); // divide = 1.6666666666666667
		
	}

}
