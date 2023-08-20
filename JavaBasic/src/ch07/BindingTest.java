package ch07;

public class BindingTest {

  public static void main(String[] args) {

    ParentB pb = new ChildB();
    ChildB cb = new ChildB();

    System.out.println("pb.x =" + pb.x); //  pb.x =100 , 인스턴스 변수 x는 참조변수의 타입에 따라서 달라진다
    pb.method(); // 참조 변수 타입에 관계없이 항상 실제 인스턴스의 타입인 ChildB클래스에 정의된 메서드가 호출

    System.out.println("cb.x = " + cb.x); // cb.x = 200
    cb.method();

    //        pb.x =100
    //        Child Method
    //        cb.x = 200
    //        Child Method

    // 멤버변수가 조상 클래스와 자손 클래스에 중복으로 정의 된 경우
    // 조상타입의 참조변수를 사용했을 때는 조상 클래스에 선언된 멤버변수가 사용되고,
    // 자손타입의 참조변수를 사용했을 때는 자손 클래스에 선언된 멤버변수가 사용된다
  }

}

class ParentB {
  int x = 100;

  void method() {
    System.out.println("Parent Method");
  }
}

class ChildB extends ParentB {
  int x = 200;

  @Override
  void method() {
    System.out.println("Child Method");

  }
}
