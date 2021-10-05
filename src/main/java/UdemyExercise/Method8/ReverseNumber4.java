package UdemyExercise.Method8;

/*
使用下面的方法头编写方法，反向显示一个整数：
public static void reverse(int number)
例如：reverse(3456)返回6543。编写一个测试程序，提示用户输人一个整数，然后显示它的反向数。
 */

import java.util.Scanner;

public class ReverseNumber4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    reverse(number);   // printlnは付けられない
  }

  public static void reverse(int number) {   // 戻り値がない
    while (number > 0) {
      System.out.print((number % 10));
      number /= 10;
    }
    System.out.println();
  }
}
