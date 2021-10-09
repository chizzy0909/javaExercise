package UdemyExercise.recursive21;

//数字倒序

public class Test3 {

  public static void main(String[] args) {
    int n = 1876;
    xMethod(n);

  }

  public static void xMethod(int n) {
    if (n > 0) {
      System.out.print(n % 10);
      xMethod(n / 10);
    }
  }
}
