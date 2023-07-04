package ch03;

public class operatorEx17 {

	public static void main(String[] args) {

		float pi = 3.141592f;
		
		float shortPi0 = (pi * 1000) / 1000f;
		System.out.println(shortPi0); // 3.141592
		
		float shortPi =(int) (pi * 1000) / 1000f;
		System.out.println(shortPi); // 3.141 : int형 간의 나눗셈 결과는 int형, 나눗셈 결과를 반올림하는 것이 아니라 버린다는 점 유의!
	
	}

}