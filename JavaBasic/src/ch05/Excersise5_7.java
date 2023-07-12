package ch05;

public class Excersise5_7 {

	public static void main(String[] args) {

//		커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다 
//		보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름돈이 부족합니다.’라고 출력하고 종료한다 
//		지불할 돈이 충분히 있으면 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다

		if (args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
		int money = Integer.parseInt(args[0]);
		System.out.println("money=" + money);
		
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0; // 필요한 동전의 개수
			coinNum = money / coinUnit[i];
			
			// 배열 coin에서 coinNum만큼의 동전을 뺀다
			//  만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다
			if (coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			
			// 금액에서 동전의 개수(coinNum) 와 동전단위를 곱한 값을 뺀다
			money -= coinNum*coinUnit[i];

			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // . 프로그램을 종료한다
		}
		System.out.println("=남은 동전의 개수=");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 :" + coin[i]);
		}
		
//			money=3170
//				500원: 5
//				100원: 5
//				50원: 3
//				10원: 2
//				=남은 동전의 개수=
//				500원 :0
//				100원 :0
//				50원 :2
//				10원 :3
		
//		money=3510
//				500원: 5
//				100원: 5
//				50원: 5
//				10원: 5
//				거스름돈이 부족합니다.


	}
}
