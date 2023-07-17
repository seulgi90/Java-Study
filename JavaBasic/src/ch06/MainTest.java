package ch06;

public class MainTest {

	public static void main(String[] args) {

		main(null); // 재귀호출 -> 자기 자신을 다시 호출
	}
//	Exception in thread "main" java.lang.StackOverflowError
//	at ch06.MainTest.main(MainTest.java:7)
//	at ch06.MainTest.main(MainTest.java:7)
//	at ch06.MainTest.main(MainTest.java:7)
}