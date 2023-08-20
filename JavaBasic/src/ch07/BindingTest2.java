package ch07;

public class BindingTest2 {

  public static void main(String[] args) {

    Parent3 p3 = new Child3();
    Child3 c3 = new Child3();

    System.out.println("p3.x = " + p3.x);
    p3.method();

    System.out.println("c3.x = " + c3.x);
    c3.method();

    //        p3.x = 100
    //        Parent Method
    //        c3.x = 100
    //        Parent Method

  }

}

class Parent3 {
  int x = 100;

  void method() {
    System.out.println("Parent Method");
  }
}

class Child3 extends Parent3 {

}