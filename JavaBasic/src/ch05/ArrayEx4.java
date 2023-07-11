package ch05;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {

		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc); // ABCD
		System.out.println(num); // 0123456789
		
		// 배열 abc와 num을 붙여서 하나의 배열 result로 만든다
		char[] result = new char[abc.length + num.length];
		// arraycopy()는 지정된 범위 값들을 한 번에 통째로 복사
		// abc : abc[0]에서 result[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length , num.length);
		System.out.println(result); // ABCD0123456789
		
		// 배열 abc을 배열 num의 첫 번쨰 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num); // ABCD456789
		
		// number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num); // ABCD45ABC9
	}
	
}
