package UdemyExercise.JavaBasic3;
/*
  编写程序，读入圆柱体的半径和高，使用下列公式计算圆柱体的体积：
  面积= 半径 x 半径 x pI
  体积= 面积 x 高
 */

import java.util.Scanner;

public class VolumeOfCylinder2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius and length of a cylinder: ");

    double radius = input.nextDouble();
    double length = input.nextDouble();

    double area = radius * radius * Math.PI;

    double volume = area * length;

    System.out.println("the area is " + area + " and " + "the length is " + length);
  }
}
