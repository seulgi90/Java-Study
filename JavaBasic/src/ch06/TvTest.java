package ch06; 

public class TvTest {

	public static void main(String[] args) {
		
		Tv t; // 참조 변수 t 선언
		t = new Tv(); // new 연산자에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다 
		t.channel = 7;
		t.channelDown(); // channel = 6
		System.out.println("현재 채널은 " + t.channel + " 입니다"); // 현재 채널은 6 입니다
	}
}
