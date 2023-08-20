package ch08;

// 8장: 예외 처리
public class study {

  // 컴파일러: 문법체크, 구분 분석, 최적화, 자동 코드 추가, 번역(핵심)

  // 예외처리: 실행 중(runtime) 중 예외를 처리하는 것

  // 오류 종류
  // 컴파일 에러
  // 런타임 에러 : 에러(심각 - 코드로 처리 불가), Exception(덜 심각)
  // 논리적 에러 : 의도한대로 동작x

  // Exception 예외 종류
  // Exception의 자손 : 필수 처리 -> 필수를 선택 처리로 할 수도 있긴하다 
  // - IOException, ClassNotFoundException ...
  // RuntimeException : 선택 처리 ( 프로그래머의 실수)
  // - ArithmeticException 계산 예외
  // - ClassCastException 형변환 => 제네릭스 활용
  // - NullPointException  => Optinal 활용
  // - ArrayIndexOutOfBoundException => 향상된 for문, 이터레이터 등 활용

  // 예외 처리 방법
  // try - catch : 직접 처리
  // 예외 선언 : 보고 ( throws Exception )
  // 은폐 : 그냥 둠..?
  // 양쪽에서 처리( try - catch + 예외 선언 )

  // 작업 중 예외 발생 처리
  // Retry 
  // 무시해서 넘어가게해야되는 경우도 필요(무시한 것에 대한 로그 남기기 등 고려)
  // 로깅, 이메일 전송 

  // Throwable : 클래스 이다 (인터페이스 아님 유의)
  // Exception :  모든 예외의 최고 조상 ( 여러개의 catch문 중 마지막에 쓴다)
  // throw e; : 예외 되던지기

  // 연결 예외 
  // 세부 -> 좀더 큰단위의 예외로 바꿀때
  // new RuntimeException(new MemoryException)


}
