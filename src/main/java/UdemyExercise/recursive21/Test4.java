package UdemyExercise.recursive21;

public class Test4 {

  public static void main(String[] args) {

    System.out.println(factorial(0));
    System.out.println(factorial(1));
    System.out.println(factorial(2));
    System.out.println(factorial(3));
  }

  public static long factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
