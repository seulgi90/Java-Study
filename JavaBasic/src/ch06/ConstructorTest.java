package ch06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

// 기본 생성자
class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		
//		Data2 d2 = new Data2(); // 컴파일 에러  -> 컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 클래스 내에 생성자가 하나도 없을 때 뿐
		Data2 d2 = new Data2(10); 
	}
}
