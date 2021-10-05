package UdemyExercise.JavaBasic3;

import java.util.Scanner;

/*
编写一个程序，内容是提示用户输人驾驶的距离、每加仑多少英里的汽车燃油性能，以及每加仑的价格，然后显示旅程的费用。
人が運転する距離、1ガロンあたり何マイルの車の燃費、1ガロンあたりの価格をユーザーに提示し、旅程の料金を表示するプログラムを作ります。
 */
public class DrivingCost8 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble();

    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();

    System.out.print("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();

    double drivingCost = (distance / milesPerGallon) * pricePerGallon;

    System.out.println("The cost of driving is $" + drivingCost);

  }
}