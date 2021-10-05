package UdemyExercise.JavaBasic3;

/*( 财务应用程序：计算小费）
编写一个程序，读入一笔费用与酬金率，计算酬金和总钱数。例如，
如果用户输人10 作为费用，15% 作为酬金率，计算结果显示酬金为$1.5, 总费用为$11.S。
 */

import java.util.Scanner;

public class CalculateTips5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate:");

    double subtotal = input.nextDouble();
    double rate = input.nextDouble();

    double gratuity = subtotal * (rate / 100);
    double totalMoney = subtotal + gratuity;
    System.out.println("The gratuity is $" + gratuity + " and total is $" + totalMoney);

  }
}
