package UdemyExercise.JavaBasic3;

//(将磅转换为千克）
//编写程序，将磅数转换为千克数。程序提示用户输人磅数，然后转换成千克并显示结果。
// 一磅等于0.454 千克。

import java.util.Scanner;

public class PoundsToKilograms4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number in pounds:");

    double pounds = input.nextDouble();

    final double KG_OF_PER_POUNDS = 0.454;

    double kilograms = pounds * KG_OF_PER_POUNDS;

    System.out.println(pounds + " pounds is " + kilograms + " kilograms");

  }

}
