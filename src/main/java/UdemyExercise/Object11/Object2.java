import java.util.Date;

public class Object2 {


  public static void main(String[] args) {
    A1 a = new A1();
    System.out.println(a.x);

    Date date =new Date();
    System.out.println(date.getTime());
  }
}

class A1 {

  boolean x;
}
