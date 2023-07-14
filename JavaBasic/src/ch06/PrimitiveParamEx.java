package ch06;

class Data { int x;}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d = new Data(); // 객체 생성
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d.x); // 1. 10을 넘긴다 // 5. 지역변수 x 가 사라진다 
		System.out.println("After change(d.x)"); // After change(d.x)
		System.out.println("main() : x = " + d.x); // main() : x = 10
	}
	
	static void change(int x) { // 2. x에 10이 넘어온다
		x = 1000;	// 3. 지역변수 x에 1000이 할당된다 
		System.out.println("change() : x = " + x); // 4. change() : x = 1000 이 출력된다
	}
	
	// change 메서드가 호출되면서 'd.x'가 change 메서드의 매개변수 x에 복사됨
	// change 메서드에서 x의 값을 1000으로 변경
	// change 메서드가 종료되면서 매개변수 x는 스택에서 제거됨
	
	// 'd.x'의 값이 변경 된것이 아니라 change메서드의 매개변수 x의 값이 변경 된 것
	// 기본형 매개변수는 변수에 저장된 값만 읽을 수 있을 뿐 변경할 수는 없다
}

