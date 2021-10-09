package UdemyExercise.recursive21;

public class Test17 {
  public static void main(String[] args) {
    System.out.println(f1(3));
    System.out.println(f2(3, 0));
    System.out.println(f3(3, 0));
  }

  public static int f1(int n) {
    if (n == 0)
      return 0;
    else {
      return n + f1(n - 1);
    }
  }

  public static int f2(int n, int result) {
    if (n == 0)
      return result;
    else
      return f2(n - 1, n + result);  //尾递归
  }

  public static int f3(int n, int result) {
    if (n == 0)
      return 0;
    else
      return f3(n - 1, n + result);
  }
}
