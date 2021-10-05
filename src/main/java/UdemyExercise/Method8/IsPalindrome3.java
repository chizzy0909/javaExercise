package UdemyExercise.Method8;

import java.util.Scanner;

/*使用下面的方法头编写两个方法：

 // Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

 // Return true if number is a palindrome
public static boolean isPalindrome(int number)

使用reverse 方法实现isPalindrome。
如果一个数字的反向倒置数和它的顺向数一样，这个数就称作回文数。
编写一个测试程序，提示用户输人一个整数值，然后报告这个整数是否是回文数。

 */
public class IsPalindrome3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    // Report whether the integer is a palindrome.
    System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
        "a palindrome.");
  }


  public static boolean isPalindrome(int number) {
    return number == reverse(number) ? true : false;
  }

  public static int reverse(int number) {
    String reverse = "";
    String n = number + "";
    for (int i = n.length() - 1; i >= 0; i--) {
      reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse);
  }

}
