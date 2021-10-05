package UdemyExercise.JavaBasic3;

/*(将摄氏温度转换为华氏温度）
编写程序，从控制台读人double 型的摄氏温度，然后将其转换为华氏温度，并且显示结果。
转换公式如下所示：华氏温度 = (9/5) * 摄氏温度+32
提示：在Java 中，9/5 的结果是1, 但是9.0/5 的结果是1.8。
 */

import java.util.Scanner;

public class CelsiusToFahrenheit1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
    double Fahrenheit = (9 / 5.0) * celsius + 32;
    System.out.println("Fahrenheit is " + Fahrenheit);

  }

}
