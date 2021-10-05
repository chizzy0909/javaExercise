package UdemyExercise.Method8;

/*
  五角数はn(3n-1)/2と定義され、ここでn=1,2,…。
  だから最初の数は1,5,12,22,次の方法を書いて五角数を返す:
  public static int getPentagonalNumber(int n)
  最初の100個の五角数を表示し、各行に10個表示するテストプログラムを作成します。
 */

public class PentagonalNumber1 {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int number = getPentagonalNumber(i);
      System.out.printf("%6d", number);
      if (i % 10 == 0) {
        System.out.println();
      }

    }
  }

  public static int getPentagonalNumber(int n) {
    return n * (3 * n - 1) / 2;
  }
}
