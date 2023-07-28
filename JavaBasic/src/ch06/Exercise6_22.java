package ch06;

public class Exercise6_22 {
//	[6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오
//	메서드명 : isNumber
//	기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다 
//	모두 숫자로만 이루어져 있으면 를 반환하고 true ,
//	그렇지 않으면 를 반환한다 false .
//	만일 주어진 문자열이 null이거나 빈문자열 "" 이라면 false를 반환한다
//	반환타입 : boolean
//	매개변수 : String str 검사할 문자열

	/*
	 * (1) isNumber . 메서드를 작성하시오
	 */
	static boolean isNumber(String str) {

		if (str == null || str == "")  {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if ( ch < '0' || ch > '9') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String args[]) {

		String str = "123";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + " ? " + isNumber(str));

	}

}
