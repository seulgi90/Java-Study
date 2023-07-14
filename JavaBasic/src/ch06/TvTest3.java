package ch06; 

public class TvTest3 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " +  t1.channel + "입니다"); // t1의 channel값은 0입니다
		System.out.println("t2의 channel값은 " +  t2.channel + "입니다"); // t2의 channel값은 0입니다
		
		System.out.println(t1); // ch06.Tv@5aaa6d82
		System.out.println(t2); // ch06.Tv@73a28541
		
		t2 = t1; // t1이 저장하고있는 값(주소)을 t2에 저장
		System.out.println("t2 = t1; -> " + t2); // t2 = t1; -> ch06.Tv@5aaa6d82 // t1과 t2는 같은 주소값을 가지게 된다
		// 기존 t2가 참조하고있던 인스턴스는 더 이상 사용되어 질 수 없으므로 가비지 컬렉터에의해서 자동적으로 메모리에서 제거된다
		
		t1.channel = 7;
		System.out.println("t1의 channel값은 " +  t1.channel + "입니다"); // t1의 channel값은 7입니다
		System.out.println("t2의 channel값은 " +  t2.channel + "입니다"); // t2의 channel값은 7입니다
		
	}
}
