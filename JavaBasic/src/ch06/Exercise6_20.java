package ch06;

public class Exercise6_20 {

//	[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.

//	메서드명 : shuffle
//	기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다, 처리한 배열을 반환한다.
//	반환타입 : int[]
//	매개변수: int[] arr 정수값이 담긴 배열 

//	[1, 2, 3, 4, 5, 6, 7, 8, 9]
//	[4, 6, 8, 3, 2, 9, 7, 1, 5]

	/*
	 * (1) shuffle메서드를 작성하시오
	 */
	static int[] shuffle(int[] arr) {

		if (arr == null || arr.length == 0) {
			return arr;
		}

		// 배열크기의 두배 정도의 횟수를 섞으면 충분히 섞인다
		for (int x = 0; x < arr.length * 2; x++) {
			// 배열 index범위 내의 임의의 두 값 얻기
			int i = (int) (Math.random() * arr.length);
			int j = (int) (Math.random() * arr.length);
			// arr[i] arr[j] . 와 의 값을 서로 바꾼다
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}


	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
