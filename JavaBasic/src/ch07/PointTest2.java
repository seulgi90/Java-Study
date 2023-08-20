package ch07;

public class PointTest2 {

  public static void main(String[] args) {

    Point3D2 p3 = new Point3D2();
    System.out.println("p3.x=" + p3.x);
    System.out.println("p3.y=" + p3.y);
    System.out.println("p3.z=" + p3.z);

    //        p3.x=100
    //        p3.y=200
    //        p3.z=300

  }

}

class Point2 {
  int x =10;
  int y =20;

  Point2(int x, int y) {
    // 컴파일러가 super(); 자동 삽입 ( 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에)
    // 최고 조상 Object()의 생성자 호출
    this.x = x;
    this.y = y;

  }
}

class Point3D2 extends Point2 {
  int z = 30;

  Point3D2() {
    this(100, 200, 300); // Point3D2(int x, int y, int z) 호출
  }

  Point3D2(int x, int y, int z) {
    super(x, y);  // Point2(int x, int y) 호출
    this.z = z;
  }
}
