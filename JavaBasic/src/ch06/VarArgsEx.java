package ch06;

public class VarArgsEx {
	
	public static void main(String[] args) {
		
		String[] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("", "100", "200", "300")); // 100200300
		System.out.println(concatenate("-", strArr)); // 100-200-300-
		System.out.println(concatenate(",", new String[] { "1", "2", "3" })); // 1,2,3,
		System.out.println("[" + concatenate(",", new String[0]) + "]"); // []
		System.out.println("[" + concatenate(",") + "]"); // []
		
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		for (String str : args) {
			result += str + delim;
		}
		return result;
	}
	
	// 가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 이와 같이 구별되지 못하는 경우가 발생하기 쉽기 때문에 주의
//	static String concatente(String... args) {
//		return concatenate("", args);
//	}

}
