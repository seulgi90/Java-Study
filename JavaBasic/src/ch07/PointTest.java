package ch07;

public class PointTest {

  public static void main(String[] args) {
    Point3D p3 = new Point3D(1,2,3);
  }
}

class Point1 {
  int x, y;

  Point1(int x, int y) {
    this.x = x;
    this.y = y;
  }

  String getLocation() {
    return "x :" + x + ", y :" + y;
  }
}

class Point3D extends Point1 {
  int z;

  Point3D(int x, int y, int z) {

    super(x, y); // 조상클래스의 생성자를 호출하여 조상의 생성자에 의해 초기화되도록 해야한다
    // 생성자가 정의되어 있는 클래스에는 컴파일러가 기본 생성자를 자동적으로 추가하지 않는다

    this.x = x;
    this.y = y;
    this.z = z;
  }
  //  super(); 없을 경우
  // 컴파일 에러 발생 : 조상 클래스의 생성자 Point()를 찾을 수 없다
  // Implicit super constructor Point() is undefined. Must explicitly invoke another constructor

  @Override
  String getLocation() {
    return "x :" + x + ", y :" + y + ", z : " + z;
  }
}
