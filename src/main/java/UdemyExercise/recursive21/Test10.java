package UdemyExercise.recursive21;

public class Test10 {

  public static void main(String[] args) {
    int[] x = {1, 2, 3, 4, 5};
    xMethod(x, 5);
  }

  public static void xMethod(int[] x, int length) {
    System.out.print(" " + x[length - 1]);
    xMethod(x, length - 1);
  }

}
