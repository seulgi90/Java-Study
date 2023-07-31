package ch07;

public class DrawShape {
  public static void main(String[] args) {
    Point[] p = {
        new Point(100, 100),
        new Point(140, 150),
        new Point(200, 100)
    };

    Triangle t = new Triangle(p);
    Circle c = new Circle(new Point(150, 150), 50);
    //    Point p = new Point(150, 150);
    //    Circle c = new Circle(p, 50);

    t.draw();
    c.draw();

  }

  //      [p1=(100, 100), p2=(140, 150), p3=(200, 100), color=black]
  //      [center=(150, 150), r=50, color=black]

}

class Shape {
  String color = "black";

  void draw() {
    System.out.printf("[color=%s]%n", color);
  }
}

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point() {
    this(0,0);
  }
  String getXY() {
    return "("+x+", "+y+")"; // x와y의값을 문자열로 반환
  }
}

class Circle extends Shape { // circle과 shape는 상속 관계
  Point center; // 원의 원점 좌표 , circle과 point는 포함 관계
  int r; // 반지름

  Circle() {
    this(new Point(0,0), 100); // Circle(Point center, int r)를 호출
  }

  Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }

  @Override
  void draw() { // 조상 클래스에 정의된 메서드를 자손 클래스에 정의 하는 것 = 오버라이딩
    System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
  }
}

class Triangle extends Shape {
  Point[] p = new Point[3];

  Triangle(Point[] p) {
    this.p = p;
  }

  @Override
  void draw() {
    System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
  }
}
