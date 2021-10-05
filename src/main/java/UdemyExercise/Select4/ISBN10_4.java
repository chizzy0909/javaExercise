package UdemyExercise.Select4;

/*ISBN-10(国际标准书号）以前是一个 10 位整数d1d2d3d4d5d6d7d8d9d10
 最后的一位 d10 是校验和，它是使用下面的公式用另外 9个数计算出来的：
 (d1 x 1 + d2 x 2+ d3x 3+d4 x 4+d5 x 5+d6 x 6+ d7 x 7+ d8 x 8+ d9 x 9)% 11
 如果校验和为 10, 那么按照ISBN-10 的习惯，最后一位应该表示为 X。
 编写程序，提示用户输入前 9 个数，然后显示 10 位 ISBN (包括前面起始位置的 0 )。
 程序应该读取一个整数输入。
 */

import java.util.Scanner;

public class ISBN10_4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int digits = input.nextInt();

    int d1 = digits / 100000000;
    int remainingDigits = digits % 100000000;
    int d2 = remainingDigits / 10000000;
    remainingDigits %= 10000000;
    int d3 = remainingDigits / 1000000;
    remainingDigits %= 1000000;
    int d4 = remainingDigits / 100000;
    remainingDigits %= 100000;
    int d5 = remainingDigits / 10000;
    remainingDigits %= 10000;
    int d6 = remainingDigits / 1000;
    remainingDigits %= 1000;
    int d7 = remainingDigits / 100;
    remainingDigits %= 100;
    int d8 = remainingDigits / 10;
    remainingDigits %= 10;
    int d9 = remainingDigits;

    int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6
        + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    System.out.print("The ISBN-10 number is ");
    if (d10 == 10) {
      System.out.print("X");
    } else {
      System.out.print(d10);
    }

  }
}
