package UdemyExercise.Method8;

/*使用下面的方法头编写方法，按升序显示三个数：
public static void displaySortedNumbers(double num1, double num2, double num3)
 */

import java.util.Scanner;

public class AscendingSort5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three integers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    displaySortedNumbers(number1, number2, number3);
  }

  public static void displaySortedNumbers(double num1, double num2, double num3) {
    double temp;
    if (num1 > num2 && num3 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    } else if (num1 > num3 && num2 > num3) {
      temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    System.out.println(num1 + " " + num2 + " " + num3);

  }
}
