package UdemyExercise.Math5;

//六角形の面積の公式を参照して、プログラムを書く。
//ユーザーに六角形の辺の長さを入力するよう提示して、それからその面積を表示します。
//s=(3/2)×√3a²

import java.util.Scanner;

public class HexagonalArea2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side: ");
    double side = input.nextDouble();

    //ユーザーが無効値を入力したので、実行を終了する。
    if(side < 0){
      System.out.println("Wrong value.");
      System.exit((int) side);
    }

    double area = (3 / 2.0) * Math.sqrt(3) * Math.pow(side,2);

    System.out.print("The area of the hexagon is ");
    System.out.printf("%.2f",area);

    //double area = (6 * Math.pow(side,2) / (4 * Math.tan(Math.PI / 6)));
    //System.out.println("The area of the hexagon is "+String.format("%.2f",area));

  }


}
