package UdemyExercise.String6;

//(サブ列の検出)2つの文字列を入力するようユーザに促すプログラムを作成し、
// 2番目の文字列が1番目の文字列のサブ列であるかどうかを検出する。

import java.util.Scanner;

public class CheckSubstring3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter string s1: ");
    String string1 = input.nextLine();
    System.out.print("Enter string s2: ");
    String string2 = input.nextLine();

    if (string1.contains(string2)) {
      System.out.println(string2 + " is a substring of " + string1);
    } else {
      System.out.println(string2 + " is not a substring of " + string1);
    }

    /*
    System.out.println(
        string2 + ((string1.contains(string2)) ? " is " : " is not ") + "a substring of "
            + string1);
    */

  }

}
