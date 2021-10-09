package UdemyExercise.recursive21;

public class Test7 {

  public static void main(String[] args) {
    System.out.println(xMethod(5));
  }

  static int xMethod(int n) {
    if (n == 1)
      return 1;
    else
      return n + xMethod(n - 1);
  }
}
