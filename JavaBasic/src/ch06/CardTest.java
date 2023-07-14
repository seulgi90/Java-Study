package ch06;

public class CardTest {

	public static void main(String[] args) {

		System.out.println("Card.with = " + Card.width); // Card.with = 100
		System.out.println("Card.height = " + Card.height); // Card.height = 250
		
		Card c1 = new Card() ;
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		// c1은 Heart,7이며, 크기는 (100,250)
		System.out.println("c2은 " + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
		// c2은 Spade,4이며, 크기는 (100,250)
		
		System.out.println("c1의 width와 height를 각각  50, 80으로 변경합니다");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		// c1은 Heart,7이며, 크기는 (50,80)
		System.out.println("c2은 " + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
		// c2은 Spade,4이며, 크기는 (50,80)
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다
	}

}
