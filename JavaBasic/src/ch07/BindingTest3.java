package ch07;

public class BindingTest3 {

  public static void main(String[] args) {

    Parent4 p4 = new Child4();
    Child4 c4 = new Child4();

    System.out.println("p4.x =" + p4.x); // 예상 값 : 100
    p4.method(); 
    // 예상 값 : Parent Method(오답!!!!!!) 
    // ======= >  메서드의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인 Child4클래스에 정의된 메서드가 호출됨
    System.out.println();
    System.out.println("c4.x =" + c4.x); // 예상 값 : 200
    c4.method(); // 예상 값 : 200 , 100, 200

    //        p4.x =100
    //        x =200
    //        super.x =100
    //        this.x =200
    //
    //        c4.x =200
    //        x =200
    //        super.x =100
    //        this.x =200

  }

}


class Parent4 {
  int x = 100;

  void method() {
    System.out.println("Parent Method");
  }
}

class Child4 extends Parent4 {
  int x = 200;

  @Override
  void method() {
    System.out.println("x =" + x);
    System.out.println("super.x =" + super.x);
    System.out.println("this.x =" + this.x);
  }
}