public class Object24 {

  public static void main(String[] args) {
    Circle circle1 = new Circle(1);
    Circle circle2 = new Circle(2);

    System.out.println(circle1.radius + " " + circle2.radius);

    swapA(circle1, circle2);
    System.out.println(circle1.radius + " " + circle2.radius);

    swapB(circle1, circle2);
    System.out.println(circle1.radius + " " + circle2.radius);
  }

  public static void swapA(Circle x, Circle y) {
    Circle temp = x;
    x = y;
    y = temp;
  }

  public static void swapB(Circle x, Circle y) {
    double temp = x.radius;
    x.radius = y.radius;
    y.radius = temp;
  }

}

class Circle {

  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

}

