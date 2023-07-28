package ch06;

// 실행 결과 : 홍길동,1,1,100,60,76,236,78.7
public class Exercise6_5 {

	public static void main(String args[]) {

		Student5 s = new Student5("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
	}
}

class Student5 {
	/*
	 * (1) . 알맞은 코드를 넣어 완성하시오
	 */
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	Student5() {
	}

	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
int getTotal() {
		
		return kor + eng + math;
	}
	
	float getAverage() {
		
		return (int) ((kor + eng + math) / 3f * 10 + 0.5f) / 10f;

	}

	
	String info() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
	}

}