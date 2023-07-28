package ch06;

public class Exercise6_9 {

	class Marine {
		int x = 0, y = 0; // Marine (x,y) 의 위치좌표
		int hp = 60; // 현재 체력
		int weapon = 6; // 공격력
		int armor = 0; // 방어력

		void weaponUp() {
			weapon++;
		}

		void armorUp() {
			armor++;
		}

		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

// static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
// 단, 모든 병사의 공격력과 방어력은 같아야한다

// weapon, armor : 모든 병사의 공격력과 방어력은 같아야하므로 -> static
// weaponUp, armorUp : static 변수에 대한 작업을 하는 메서드 이므로 -> static