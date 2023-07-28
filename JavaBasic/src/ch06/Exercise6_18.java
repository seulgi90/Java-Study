package ch06;

public class Exercise6_18 {

//	[6-18] 다음의 코드를 컴파일하면 에러가 발생한다 컴파일 에러가 발생하는 라인과 그 .이유를 설명하시오

//	class MemberCall {
//		int iv = 10;
//		static int cv = 20;
	
//		int iv2 = cv;
//		static int cv2 = iv; // A 라인 -> static 초기화에 인스턴스 변수 사용 불가
//
//		static void staticMethod1() {
//			System.out.println(cv);
//			System.out.println(iv); // B 라인  -> static 메서드에서 인스턴스 변수 사용 불가
//		}
//
//		void instanceMethod1() {
//			System.out.println(cv);
//			System.out.println(iv); // C 라인
//		}
//
//		static void staticMethod2() {
//			staticMethod1();
//			instanceMethod1(); // D 라인  -> static 메서드에서 인스턴스 변수 사용 불가
//		}
//
//		void instanceMethod2() {
//			staticMethod1(); // E 라인
//			instanceMethod1();
//		}
//	}
}
