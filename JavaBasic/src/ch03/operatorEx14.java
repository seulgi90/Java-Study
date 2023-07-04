package ch03;

public class operatorEx14 {

	public static void main(String[] args) {

		char c1 = 'a';
//		char c2 = c1+1; // 컴파일 에러 발생 : 수식에 변수가 들어가있는 경우에는 컴파일러가 미리 계산을 할 수 없기 때문에 형변환 필요
		char c2 = 'a' +1; // 형변환 없이도 에러가 나지 않는 이유: 리터럴 간의 연산이기 때문, 컴파일러가 미리 덧셈 연산을 수행하기 때문에 실행 시에는 덧셈 연산이 수행되지 않는다
		
		System.out.println(c2); // b
	
	}

}