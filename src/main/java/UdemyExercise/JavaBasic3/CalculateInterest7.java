package UdemyExercise.JavaBasic3;

/*(财务应用程序：计算利息）
  如果知道收支余额和年利率的百分比，就可以使用下面的公式计算下个月要支付的利息额：
  利息额 = 收支余额 x (年利率/ 1200)
  编写程序，读取收支余额和年百分利率，显示两个版本的下月利息。
 */

import java.util.Scanner;

public class CalculateInterest7 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter balance and annual interest rate : ");

    double balance = input.nextDouble();
    double annualInterestRate = input.nextDouble();

    double interest = balance * (annualInterestRate / 1200);

    System.out.println("The interest is " + interest);
  }



}
