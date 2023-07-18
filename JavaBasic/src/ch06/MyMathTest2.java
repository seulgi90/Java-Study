package ch06;

class MyMath2 {

	long a, b; // 인스턴스 변수
	
	// 인스턴스변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다
	long add() { return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return  a / b; }
	
	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다
	static long add(long a, long b) { return a + b; } // a,b는 지역변수
	static long subtract(long a, long b) { return a - b; } // a,b는 지역변수
	static long multiply(long a, long b) { return a * b; } // a,b는 지역변수
	static double divide(double a, double b) { return a / b; } // a,b는 지역변수
	
}

public class MyMathTest2 {
	public static void main(String[] args) {
		
		// 클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L)); // 300
		
		// 인스턴스메서드 호출 -> 객체를 생성 후에만 호출이 가능 
		MyMath2 mm = new MyMath2();
		System.out.println(mm.add()); // 0
		mm.a = 200L;
		mm.b =  100L;
		System.out.println(mm.add()); // 300

	}
}
