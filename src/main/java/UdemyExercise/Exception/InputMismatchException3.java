package UdemyExercise.Exception;

// プログラムを書きます:ユーザーに2つの整数を読み出させ、その和を表示します。
// プログラムは入力が正しくなかった場合、ユーザーに再度数値を読み取るように促すべきだ。
// 输入类型不匹配异常  入力タイプ不一致の異常

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {

      try {
        System.out.print("Enter two integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("The numbers are " + number1 + " " + number2);
        continueInput = false;
      } catch (InputMismatchException e) {
        //e.printStackTrace();
        System.out.println("Try again.(Incorrect input:an integer is required)");
        input.nextLine(); //输入流标记位 移动到下一个输入位置。（丢弃当前输入行,跳到下一行）
                          //由于下一行没有内容，循环没结束，重新循环。
      }

    } while (continueInput);


  }


}
