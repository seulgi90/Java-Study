package ch06;

public class Exercise6_19 {

//	[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.

	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
	}
	
	// 예측 결과 
	// ABC123
	// After change: ABC123456
	
	// 정답 
//	ABC123
//	After change:ABC123
	// change 메서드는 종료되고, 작업세 사용하던 메모리는 반환하므로 change메서드의 지역변수인 str('ABC123456') 역시 메모리에서 제거됨
	// 다시 main 메서드로 돌아와서 문자열 str의 값을 출력하면 처음의 값과 변함없는 값이 출력
	// 문자열 ABC123456은 참조하는 변수가 하나도 없으므로 적절한 시기에 가비지컬렉터에의해 제거된다
}
