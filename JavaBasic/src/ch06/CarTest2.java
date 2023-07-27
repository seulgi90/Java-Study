package ch06;

class Car1 {
	
	String color;
	String gearType;
	int door;
	
	Car1() {
		this("white", "auto", 4);
		// 또 다른 생성자 Car(String c, String g, int d)를 호출
		// 생성자간의 호출에는 생성자의 이름 대신  this를 사용해야만한다
	}
	
	Car1(String color) {
		this(color, "auto", 4);
	}
	
	Car1(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		
		System.out.println("c1의 color =" + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
		// c1의 color =white, gearType =auto, door =4
		System.out.println("c2의 color =" + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
		// c2의 color =blue, gearType =auto, door =4
	}
}
