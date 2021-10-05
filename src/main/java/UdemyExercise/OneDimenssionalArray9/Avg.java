package UdemyExercise.OneDimenssionalArray9;

//编写两个重载的方法，使用下面的方法头返回一个数组的平均数：
//public static int average(int[] array)
//public static double average(double[3] array)

import java.util.Scanner;

public class Avg {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double[] values = new double[10];

    System.out.print("Enter ten values of double type: ");
    for (int i = 0; i < values.length; i++) {
      values[i] = input.nextDouble();
    }

    System.out.println("The average value: " + average(values));
  }


  public static int average(int[] array) {
    int avg = 0;
    for (int e : array) {
      avg += e;
    }
    return avg/array.length;
  }

  public static double average(double[] array) {
    double avg = 0;
    for (double e : array) {
      avg += e;
    }
    return avg/array.length;
  }

}
