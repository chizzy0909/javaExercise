package UdemyExercise.JavaBasic3;

//(将英尺转换为米）
//编写程序，读入英尺数，将其转换为米数并显示结果。一英尺等于0.305米。

import java.util.Scanner;

public class FeetToMeter3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value for feet: ");

    double feet = input.nextDouble();

    final double METERS_OF_ONE_FEET = 0.305;

    double meters = feet * METERS_OF_ONE_FEET;

    System.out.println(feet + " feet is " + meters + " meters");

  }

}
