package UdemyExercise.Math5;

/*
  (几何：最大圆距离）最大圆距离是指球面上两个点之间的距离。假设（x1,y1 ) 和（x2,y2) 是两个点的地理经纬度。
  两个点之间的最大圆距离可以使用以下公式计算：
  d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
  编写一个程序，提示用户以度为单位输人地球上两个点的经纬度，显示其最大圆距离值。
  地球的平均半径为6371.01 km。注意，你需要使用Math.toRadians 方法将度转换为弧度值。
  公式中的经纬度是相对北边和西边的，使用负数表示相对南边和东边的度数。
 */

import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

import java.util.Scanner;

public class DistanceOfCircle1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter point1 (latitude and longitude) in degrees:");
    double x1 = Math.toRadians(input.nextDouble());
    double y1 = Math.toRadians(input.nextDouble());

    System.out.println("Enter point2 (latitude and longitude) in degrees:");
    double x2 = Math.toRadians(input.nextDouble());
    double y2 = Math.toRadians(input.nextDouble());

    final double RADIUS_OF_EARTH = 6371.01;
    double distance = RADIUS_OF_EARTH * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
    System.out.println("The distance of the two points is:" + distance + " km.");

  }
}
