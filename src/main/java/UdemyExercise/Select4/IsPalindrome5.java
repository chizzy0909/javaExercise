package UdemyExercise.Select4;

/*(回文数字）编写一个程序，提示用户输入一个三位的整数，然后确定它是否是回文数。
   如果一个数字从左到右以及从右到左都是一样的，这个数字称为回文数。
   负数的处理和正数一样。
 */

import java.util.Scanner;

public class IsPalindrome5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a three-digit integer: ");

    int integer = input.nextInt();
    int i1 = integer / 100;
    int remain = integer % 100;
    int i2 = remain / 10;
    remain %= 10;
    int i3 = remain;

    if (i1 == i3){
      System.out.println(integer+" is a palindrome");
    }else{
      System.out.println(integer+" is not a palindrome");
    }


  }


}
