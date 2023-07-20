package ch06;

public class MemberCall {

	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; 
//	-> Cannot make a static reference to the non-static field iv 
//	클래스 변수는 인스턴스 변수를 사용할 수 없다
	
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용 가능
	
	static void staticMethod1() { // 클래스 메서드
		System.out.println(cv);
//		System.out.println(iv); // 클래스메서드에서 인스턴스변수 사용 불가 : Cannot make a static reference to the non-static field iv
		
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체를 생성한 후에야 인스턴스변수 참조 가능
		
		// 클래스 메서드가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야 한다 
		// -> 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재 하지만, 
		// -> 클래스 멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있기 때문이다
	}
	
	void instanceMethod() { // 인스턴스 메서드
		System.out.println(cv);
		System.out.println(iv); // 인스턴스 메서드에서는 인스턴스변수를 바로 사용 가능
		
	}
	
	static void staticMethod2() { // 클래스 메서드
		staticMethod1(); // 같은 클래스 내의 클래스메서드 호출 가능
//		instanceMethod(); // 클래스메서드에서는 인스턴스 메서드를 호출 할수 없다 : Cannot make a static reference to the non-static method instanceMethod() from the type MemberCal
		MemberCall c = new MemberCall();
		c.instanceMethod(); // 인스턴스를 생성한 후에야 호출할 수 있다
	}
	
	
	void instanceMethod2() { // 인스턴스 메서드에서는 
		staticMethod1(); // 인스턴스 메서드와 
		instanceMethod(); // 클래스 메서드 모두 인스턴스 생성없이 바로 호출 가능 
	}
}
