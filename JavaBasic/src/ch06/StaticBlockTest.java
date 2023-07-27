package ch06;

public class StaticBlockTest {
	
	static int[] arr = new int[10]; // 명시적 초기화를 통해 배열 arr을 생성
	
	static { // 클래스 초기화 블록을 이용해서 배열의 각 요소들을 random()을 사용해서 임의의 값으로 채우도록했다
		for (int i = 0; i < arr.length; i++) {
			// 1과 10사이의 임의의 값을 배열 arr 에 저장
			arr[i] = (int)(Math.random()*10) + 1;
			
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] :" + arr[i]);
	}
	
//	arr[0] :8
//	arr[1] :9
//	arr[2] :3
//	arr[3] :8
//	arr[4] :6
//	arr[5] :8
//	arr[6] :6
//	arr[7] :3
//	arr[8] :7
//	arr[9] :1
	
}
