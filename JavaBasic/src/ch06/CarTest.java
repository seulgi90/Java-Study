package ch06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // 기본 생성자
	
	Car(String c, String g, int d) { // 매가 변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] arg) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4); // 인스턴스를 생성하는 동시에 원하는 값으로 초기화,  간결하고 직관적
		
		System.out.println("c1의 color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		// c1의 color =white, gearType =auto, door =4
		System.out.println("c2의 color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
		// c2의 color =white, gearType =auto, door =4
	}
}
