package UdemyExercise.OneDimenssionalArray9;

//编写一个方法，使用下面的方法头求出一个整数数组中的最小元素：
//public static double min(double[] array)

import java.util.Scanner;

public class Min5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 integers: ");

    double[] numbers = new double[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }
    System.out.println(min(numbers));

  }

  public static double min(double[] array) {
    double min = array[0];
    for (double e : array) {
      if (min > e) {
        min = e;
      }
    }
    return min;
  }
}
