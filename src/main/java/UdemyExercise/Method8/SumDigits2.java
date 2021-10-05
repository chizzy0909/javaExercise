package UdemyExercise.Method8;

import java.util.Scanner;

/*
编写一个方法，计算一个整数各位数字之和。使用下面的方法头：
public static int sumDigits(long n)
例如：sumDigits(234)返回9(2+3+4).
提示：使用求余操作符％ 提取数字，用除号/ 去掉提取出来的数字。
  例如：使用234X10 (=4 ) 抽取4。然后使用234/10 (=23 ) 从234 中去掉4。
       使用一个循环来反复提取和去掉每位数字，直到所有的位数都提取完为止。
编写程序提示用户输入一个整数，然后显示这个整数所有数字的和。
 */
public class SumDigits2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = input.nextInt();
    System.out.println(number + " " + sumDigits(number));
  }

  public static int sumDigits(long n) {

    int sum = 0;
    int digit = 0;

    String nString = n + "";

    for (int i = 1; i <= nString.length(); i++) {
      digit = (int) (n / Math.pow(10, nString.length() - i));
      sum += digit;
      n = (int) (n % Math.pow(10, nString.length() - i));
    }
    return sum;
  }


}
