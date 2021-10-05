package UdemyExercise.Math5;

//(16進数を2進数に変換する)プログラムを作成し、ユーザーに16進数の入力を促し、対応する2進数を表示する。

import java.util.Scanner;

public class HexadecimalToBinary4 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of the hexadecimal:");
    String hexadecimal = input.next();

    //文字列パラメータを符号付きの10進数整数に解析する。
    int decimal = Integer.parseInt(hexadecimal,16);
    //整数パラメータをバイナリ文字列の表現形式に戻す。
    String binary = Integer.toBinaryString(decimal);

    System.out.println("The value of binary is: " + binary);

    //System.out.println("The binary value of the number is "
    // + Integer.toBinaryString(Integer.parseInt(hexadecimal,16)));

  }
}
