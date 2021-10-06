public class Test25d {


  public static void main(String[] args) {
    TT t1 = new TT();
    System.out.println("t1's i = " + t1.i + " and j =" + t1.j);

    TT t2 = new TT();
    System.out.println("t2's i = " + t2.i + " and j =" + t2.j);
  }
}

class TT {

  static int i = 0;
  int j = 0;

  TT() {
    i++;
    j = 1;
  }
}