package UdemyExercise.Select4;

/*(计算三角形的周长）编写程序，读取三角形的三条边，如果输入值合法就计算这个三角形的周长；
   否则，显示这些输入值不合法。
   如果任意两条边的和大于第三边，那么输人值都是合法的。
 */

// 不理解 复制来的

import java.util.Scanner;

public class PerimeterOfTriangle7 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter three edges for a triangle
    System.out.println("Enter three edges for a triangle:");
    System.out.print(" Edge 1 points x, y: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print(" Edge 2 points x, y: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    System.out.print(" Edge 3 points x, y: ");
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
        (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
        (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

    if (!valid) {
      System.out.println("Input is invalid.");
      System.exit(1);
    }

    double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
    double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
    double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

    System.out.println("perimeter of triangle is " + (side1 + side2 + side3));

  }

}
