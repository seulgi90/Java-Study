package ch06;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		
		int[] x = { 10 };
		System.out.println("main() : X  = " + x[0]); // main() : X  = 10
		
		change(x);
		System.out.println("After change(d)"); // After change(d)
		System.out.println("main() : x = " + x[0]);  // main() : x = 1000
		
	}
	
	static void change(int[] x) { 
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]); // change() : x = 1000
	}
	
//			main() : X  = 10
//			change() : x = 1000
//			After change(d)
//			main() : x = 1000
	// int 배열타입의 참조변수이기때문에 이전 예제와 같은 결과를 얻는다

}
