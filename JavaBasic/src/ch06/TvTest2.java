package ch06; 

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " +  t1.channel + "입니다"); // t1의 channel값은 0입니다
		System.out.println("t2의 channel값은 " +  t2.channel + "입니다"); // t2의 channel값은 0입니다
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경"); // t1의 channel값을 7로 변경
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다"); // t1의 channel값은 7입니다
		System.out.println("t2의 channel값은 " + t2.channel + "입니다"); // t2의 channel값은 0입니다
		
		// 같은 클래스로부터 생성되었을지라도 각 인스턴스의 멤버변수는 서로 다른 값(주소)을 유지
		System.out.println(t1); // ch06.Tv@5aaa6d82
		System.out.println(t2); // ch06.Tv@73a28541
		
	}
}
