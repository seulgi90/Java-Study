package ch06;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d);
		System.out.println("After change(d)"); // After change(d)
		System.out.println("main() : x = " + d.x); // main() : x = 1000
		
		
	}
	
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x); // change() : x = 1000
	}
	
	// change 메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사된다 
	// -> 매개변수를 참조형으로 선언했기 때문에, x의 값이 아닌 주소가 매개변수 d에 복사되었다
}
