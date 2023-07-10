package ch03;

public class Exercise3_7{

	public static void main(String[] args) {
		
		// 화씨를 섭씨로 변환하는 코드 :  C = 5/9 X (F -32), 단 변환 결과값은 소수점 셋째자리에서 반올림
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		// 5/9 는 0 ->두 피연산 중 한쪽을 float형이나 double형으로 변경 필요 -> 5/9f 
		// (5/9f * (fahrenheit - 32) = 37.77778 임으로 소수점 셋째자리에서 반올림하기 위해  37.77778 *100 = 3777.778
		// 반올림 + 0.5해준다 -> 3777.778 + 0.5 = 3778.278
		// 결과를 int 타입으로 바꾼다  -> 3778
		// 100f으로 나눈다 -> 37.78 
		
		System.out.println("fahrenheit:" +  fahrenheit);
		System.out.println("celcius:" +  celcius);
		
		// -----------------------------------------------------------
		float f = 3 /2;
		System.out.println(f); // 1.0
		
		float f1 = 3 /2f;
		System.out.println(f1); // 1.5
	}
}