package ch06;

class Car2 {
	
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
		// 또 다른 생성자 Car(String c, String g, int d)를 호출
	}
	
	Car2(Car2 c) { // 인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1); // c1의 복사본 c2를 생성한다
		
		System.out.println("c1의 color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		System.out.println("c2의 color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
//				c1의 color =white, gearType =auto, door =4
//				c2의 color =white, gearType =auto, door =4
		
		c1.door = 100; // c1의 인스턴스변수 door의 값을 변경
		System.out.println("c1.door=100; 수행 후");
		// c1.door=100; 수행 후
		
		System.out.println("c1의 color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		System.out.println("c2의 color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
//				c1의 color =white, gearType =auto, door =100
//				c2의 color =white, gearType =auto, door =4
		// 인스천스 c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만, 서로 독립적으로 메모리공간에 존재하는 별도의 인스턴스이므로 c1의 값들이 변경되어도
		// c2는 영향을 받지 않는다
	}
}
