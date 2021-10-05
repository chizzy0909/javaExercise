package UdemyExercise.Math5;

/*(10進数を16進数に変換する)
  0~15の間の整数を入力するようユーザに促し、それに対応する16進数を表示するプログラムを作成する。
  不正確に入力された数字に対しては、不正入力を促す。
 */

import java.util.Scanner;

public class DecimalToHexadecimal3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of the decimal:");
    int decimal = input.nextInt();

    switch (decimal) {
      case 0:
        System.out.println("the value of hexadecimal id 0");
        break;
      case 1:
        System.out.println("the value of hexadecimal id 1");
        break;
      case 2:
        System.out.println("the value of hexadecimal id 2");
        break;
      case 3:
        System.out.println("the value of hexadecimal id 3");
        break;
      case 4:
        System.out.println("the value of hexadecimal id 4");
        break;
      case 5:
        System.out.println("the value of hexadecimal id 5");
        break;
      case 6:
        System.out.println("the value of hexadecimal id 6");
        break;
      case 7:
        System.out.println("the value of hexadecimal id 7");
        break;
      case 8:
        System.out.println("the value of hexadecimal id 8");
        break;
      case 9:
        System.out.println("the value of hexadecimal id 9");
        break;
      case 10:
        System.out.println("the value of hexadecimal id A");
        break;
      case 11:
        System.out.println("the value of hexadecimal id B");
        break;
      case 12:
        System.out.println("the value of hexadecimal id C");
        break;
      case 13:
        System.out.println("the value of hexadecimal id D");
        break;
      case 14:
        System.out.println("The hex value is E");
        break;
      case 15:
        System.out.println("The hex value is F");
        break;

      default:
        System.out.println("The value is invalid.");
    }


  }

}
