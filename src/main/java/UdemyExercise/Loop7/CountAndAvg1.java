package UdemyExercise.Loop7;

//正数と負数の数を集計し、それらの数の平均値を計算する。
//整数が順次入力され、0でループが終了する。

import java.util.Scanner;

public class CountAndAvg1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int positive = 0;
    int negative = 0;
    int count = 0;
    int total = 0;

    System.out.println("Enter a integer, the input ends if it is 0: ");
    int number = input.nextInt();
    if (number == 0) {
      System.out.println("The first number cannot be 0.");
      System.exit(1);
    }

    while (number != 0) {
      if (number > 0) {
        positive++;
      } else {
        negative++;
      }
      total += number;
      count++;
      number = input.nextInt();
    }

    double average = total / count;
    System.out.println(
        "The average is " + average + "\nthe total is " + total + "\nthe count is " + count);
  }


}
