package UdemyExercise.recursive21;

/*
(以逆序输出一个字符串中的字符)编写一个递归方法，使用下面的方法头在控制台上以逆序显示一个宇符串:
public static void reverseDisplay(String value)
例如，reverseDisp1ay("abcd")显示的是 dcba。编写一个测试程序，提示用户输入一个字符串，然后显示它的逆序字符串。
 */

import java.util.Scanner;

public class DescendingSortChar1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = input.nextLine();
    reverseDisplay(s);

  }

  public static void reverseDisplay(String value) {

    if (value.length() == 0) {
      System.out.println(value);//base case
    } else {
      System.out.print(value.charAt(value.length() - 1)); // 输出最后一个字符
      reverseDisplay(value.substring(0, value.length() - 1)); // 递归
    }

  }
}
