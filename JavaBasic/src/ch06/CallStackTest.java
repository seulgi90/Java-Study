package ch06;

public class CallStackTest {
	// 호출 스택
	public static void main(String[] args) {
		firstMethod();
	}
	
	// 객체를 생성하지 않고도 메서드를 호출할 수 있으려면 메서드 앞에 static을 붙여야한다
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()"); // secondMethod()

	}
	
	// JVM에 의해서  main()메서드가 호출 -> 호출스택에는 main 메서드를 위한 메모리공공간이 할당되고 수행된다
	// main메서드에서 fristMethod()를 호출 -> | firstMethod |
	//									 | main		   |
	
	// firstMethod에서 secondMethod() 호출 | secondMethod |
	//									 | firstMethod | 
	//									 | main		   |

	// secondMethod메서드에서 println() 호출  | println	   |
	//									 | secondMethod|
	//									 | firstMethod | 
	//									 | main		   |
	// println 메서드에 의해서 "secondMethod()"가 화면에 출력 
	// 대기중이 던 secondMethod에 더이상 수행할 코드가 없으므로 종료되고 자신을 호출한 firstMethod()로 돌아간다
	// firstMethod에도 더 이상 수행할 코드가 없으므로 종료되고 자신을 호출한 main()로 돌아간다
	// main메서드에서도 더 이상 수행할 코드가 없으므로 종료되어, 호출스택은 완전히 비워지게되고 프로그램 종료
}
