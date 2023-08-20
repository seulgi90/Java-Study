package ch09;

// 9장 : java.lang 패키지
public class study {

  // Object 클래스 
  // - iv가 없다
  // - iv메서드 11개 -> 인스턴스 메서드로 이루어졌있고 iv를 사용 -> iv가 없다며? -> 메서드의 자손들은 iv를 가지고 있을 수 있기 때문에
  // - toString(), equals(), hashCode(), getClass() ... 등

  // - boolean equals(Object obj) : 주소 비교, 오버라이딩 많이 함(내용 비교)
  // - int hashCode() : 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드 반환(객체 주소 반환)
  //                : 32bit -> 64bit 로되면서 long hashCode() 이여야하나 바꾸지 못한다 
  //                : String클래스는 문자열의 내용이 같으면 같은 주소값(동일한 해시코드)을 사용하도록 되어있다
  // - String toString() : 객체(변수 묶음)를 string으로 변환
  // - Object clone() : Cloneable 인터페이스를 구현한 클래스에서만 객체를 복사
  //            : 공변 반환 타입 - 조상타입에서 자손 타입으로 변경
  //            : Object -> Point로 반환 타입 변경 하여 형변환의 번거로움을 줄였다  

  // 얕은 복사 : 같은 참조 값 = 내용 공유 = 원본 수정 시 복사본도 같이 수정된다 = 읽기 전용으로 할 때
  // 깊은 복사 : 다른 참조 값 = 내용 공유 안됨!! = 읽기 + 쓰기 할 때



}
