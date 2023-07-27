package ch06;

public class OverloadingTest {
	
	public static void main(String[] args) {
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 = "  + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과 = "  + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과 = "  + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과 = "  + mm.add(3L, 3L));
		
		int[] a  = {100, 200, 300};
		System.out.println("mm.add(a) 결과 = " + mm.add(a));
	}
	
//	int add(int a, int b) - 
//	mm.add(3, 3) 결과 = 6
//	long add (long a, int b) - 
//	mm.add(3L, 3) 결과 = 6
//	long add (int a, long b) - 
//	mm.add(3, 3L) 결과 = 6
//	long add (long a, long b) - 
//	mm.add(3L, 3L) 결과 = 6
//	int add(int[] a) - 
//	mm.add(a) 결과 = 600

}

class MyMath3 {
	// 한 클래스 내에 이미 사용하려는 이름고 ㅏ같은 이름을 가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다
	// 오버로딩 조건 : 메서드의 이름이 같아아햔다, 매개변수의 개입 또는 탕비이 달라야 한다
	// 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다!!
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.println("long add (int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.println("long add (long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.println("long add (long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.println("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
}
