package ch06;

// 문제 6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오.
//실행결과
//3
//1K

public class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	/*
	 * (1) . 알맞은 코드를 넣어 완성하시오
	 */
	
	int num;
	boolean isKwang;
	
	// 기본 생성자
	SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + ( isKwang ? "K" : "" );
	}
	

}
