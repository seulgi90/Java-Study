package ch05;

public class Excercise5_1 {

//	 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 .
//	 하시오.
//	 a. int[] arr[];
//	 b. int[] arr = {1,2,3,};
//	 c. int[] arr = new int[5];
//	 d. int[] arr = new int[5]{1,2,3,4,5};
//	 e. int arr1[5];
//	 f. int[] arr[] = new int[3][];
	
	// d. int[] arr = new int[5]{1,2,3,4,5};
	int[] arr = new int[]{1,2,3,4,5}; // { } 안에 개수에 따라 자동으로 크기가 결정되므로 [5] -> []
	
	// e. int arr1[5];
	int arr1[]; // 배열을 선언할 떄는 크기를 지정할 수 없다 
}
