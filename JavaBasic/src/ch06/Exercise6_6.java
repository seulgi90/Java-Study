package ch06;

// 두 점의 거리를 계산하는 getDistance()를 완성하시오
// 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다

public class Exercise6_6 {

	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) { // 메서드 내에서 인스턴스 변수를 사용하지 않았다 -> 매개변수(지역변수)로 제공받아야한다
	/*
	(1) . 알맞은 코드를 넣어 완성하시오
	*/
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
	}
	
	public static void main(String args[]) {
		
	System.out.println(getDistance(1,1,2,2));
	
	}

}

