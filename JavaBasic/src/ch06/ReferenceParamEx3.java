package ch06;

public class ReferenceParamEx3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.print("sum =" + sumArr(arr)); // sum =21
	}
	// 매개변수의 타입이 배열 -> 참조형 매개변수이다

	static void printArr(int[] arr) {
		System.out.println("[");

		for (int i : arr) {
			System.out.print(i + ","); 
			// [3,2,1,6,5,4,] // 정렬 전
			// [1,2,3,4,5,6,] // 정렬 후 
		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for (int i =0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++ ) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
