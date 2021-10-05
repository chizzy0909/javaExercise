package UdemyExercise.String6;

//(文字を与えるUnicodeコード)、1文字の入力を得て、そのUnicode値を表示するプログラムを作成する。

import java.util.Scanner;

public class Unicode6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String s = input.nextLine();
    char ch = s.charAt(0);

    System.out.println((int)ch);
  }
}
