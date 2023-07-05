package ch03;

public class Exercise3_6{

	public static void main(String[] args) {
		
		// num 값 보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드
		int num = 24;
		
		System.out.println(10 - num%10); // 6  
		// 24보다 크고 가장 가까운 10의 배수 : 30 - 24 = 6 -> 10 - 4 =6
		// 35 : 40 - 35 = 5 -> 10 - 5 = 5 
	}
}