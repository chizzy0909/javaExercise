package UdemyExercise.Exception;

/*
(ArrayIndexOutBoundsException異常)
次の要件を満たすプログラムを作成します
 •ランダムに選ばれた100個の整数からなる配列を作る。
 •負けた人数のグループの添え字をユーザに提示し、対応する要素の値を表示する。
  指定された添え字が境界を越えると、メッセージOut of Boundsが表示される。
 */

import java.util.Scanner;

public class ArrayIndexOutBoundsException4 {

  public static void main(String[] args) {

    int[] array = new int[100];
    for (int i = 0; i < 100; i++) {
      array[i] = (int) (Math.random() * 100);
    }

    Scanner input = new Scanner(System.in);

  /*
    try {
      int index = input.nextInt();
      System.out.println(array[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out Of Bounds");
    }
  */
    System.out.println("Enter the index of array: ");
    int index = input.nextInt();

    try {
      if (index >= 100 || index < 0) {
        throw new Exception();  //抛出异常再catch,这里可以只写Exception，也可以具体到哪个异常
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Array Index Out Of Bounds");
    }
  }
}