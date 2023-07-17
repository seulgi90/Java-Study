package ch06;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d); // copy메서드를 호출하면서 참조변수 d의 값이 매개변수 d에 복사된다
		System.out.println("d.x = " + d.x); // d.x = 10
		System.out.println("d2.x = " + d2.x); // d2.x = 10
	}
	
	static Data copy(Data d) {
		Data tmp = new Data(); // 새로운 객체를 생성한 다음
		tmp.x = d.x; //  d.x에 저장 된 값을 tmp.x에 복사
		
		return tmp; // 메서드가 종료되면서 반환한 tmp값은 참조변수 d2에 저장된다 
	}
	
	// 반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미 
}
