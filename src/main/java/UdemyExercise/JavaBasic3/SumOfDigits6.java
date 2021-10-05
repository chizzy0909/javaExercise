package UdemyExercise.JavaBasic3;

//编写程序，读取一个在0 和1000 之间的整数，并将该整数的各位数字相加。例如：整数是932 , 各位数字之和为14。
//提示：利用操作符%分解数字，然后使用操作符/ 去掉分解出来的数字。

import java.util.Scanner;

public class SumOfDigits6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    int digit1 = number / 100;
    int remainingDigit = number % 100;
    int digit2 = remainingDigit / 10;
    remainingDigit %= 10;
    int digit3 = remainingDigit;

    int sum = digit1 + digit2 + digit3;
    System.out.println(sum);

  }
}
