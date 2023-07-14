package ch06; 

public class TvTest4 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3]; // 객체를 다루기 위한 참조변수들이 만들어진 것일뿐, 객체가 저장되지 않은것!
//		-> 객체를 생성해서 객체 배열의 각 요소에 저장해야 한다
//		tvArr[0] = new Tv();
//		tvArr[1] = new Tv();
//		tvArr[2] = new Tv();
//		-> (한줄로 변경 시 )
//		Tv[] tvArr = { newTv(), newTv(), newTv() };
//		-> (for문으로 만들 시)
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // channel 1증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
			
//					tvArr[0].channel=11
//					tvArr[1].channel=12
//					tvArr[2].channel=13
		}
	}
}
