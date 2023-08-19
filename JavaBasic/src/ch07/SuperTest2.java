package ch07;

public class SuperTest2 {

  public static void main(String[] args) {

    Child2 c = new Child2();
    c.method();
  }

}

class Parent2 {
  int x  = 10;
}

class Child2 extends Parent2 {

  int x = 20; // 조상 클래스에 선언된 멤버변수와 같은 이름의 멤버변수를 중복 정의 가능 ->참조변수 super이용하여 서로 구별

  void method() {
    System.out.println("x=" + x);
    System.out.println("this.x=" + this.x); // 자손 클래스에 선언된 멤버변수
    System.out.println("super.x=" + super.x); // 조상 클래스로부터 상속받은 멤버변수x

    //        x=20
    //        this.x=20
    //        super.x=10
  }
}
