package UdemyExercise.Math5;

import java.util.Scanner;

/*(1ヶ月の日付)プログラムを作成して、
  ユーザーに1つの年と1ヶ月の名前の最初の3つの文字(最初の文字は大文字を使用します)を入力するように促し、
  その月の日数を表示します。
 */
public class DateOfMonth5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a year:");
    int year = input.nextInt();
    System.out.println("Enter a month:");
    String month = input.next();

    //その年がうるう年であるかどうかを検証します。
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
        || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
      System.out.println(month + " " + year + " has " + 31 + " days."); //どの月が31日あるかを検証する。
    } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep")
        || month.equals("Nov")) {
      System.out.println(month + " " + year + " has " + 30 + " days."); //どの月が30日あるかを検証する。
    } else {
      if (isLeapYear) {   //うるう年の結果から、2月の日数を決めます。
        System.out.println(month + " " + year + " has " + 29 + " days.");
      } else {
        System.out.println(month + " " + year + " has " + 28 + " days.");
      }
    }

  }
}

