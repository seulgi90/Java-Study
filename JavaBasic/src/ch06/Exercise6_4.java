package ch06;

//1.메서드명 : getTotal 
//기 능: 국어 영어 수학 의 점수를 모두 더해서 반환한다 : (kor), (eng), (math) .
//반환타입 : int
//매개변수 없음 
//
//2.메서드명 : getAverage 
//기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다, 소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 없음

public class Exercise6_4 {

	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name); 
		System.out.println("총점:"+s.getTotal()); 
		System.out.println("평균:"+s.getAverage()); 
		}
}

class Student {

	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	Student() {}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
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

}