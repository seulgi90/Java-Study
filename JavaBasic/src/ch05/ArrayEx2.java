package ch05;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] { 100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i =0; i < iArr1.length; i++ ) {
			iArr1[i] = i +1;
		}
		
		for (int i =0; i < iArr2.length; i++ ) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}
		
		for (int i =0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+","); // 1,2,3,4,5,6,7,8,9,10,
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2)); // [8, 1, 7, 2, 9, 3, 10, 1, 2, 9]
		System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
		System.out.println(Arrays.toString(chArr)); // [a, b, c, d]
		System.out.println(iArr3); // [I@606d8acf : 배열을 가리키는 참조변수 iArr3의 값을 출력
		System.out.println(chArr); // abcd : char 배열은 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력된다
	}
}
