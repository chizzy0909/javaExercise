
public class Object1 {

  public static void main(String[] args) {
    A a = new A();
    a.point();
  }
}

class A {

  String s;

  A() {

  }

  A(String newS) {
    s = newS;
  }

  public void point() {
    System.out.println(s);
  }

}
