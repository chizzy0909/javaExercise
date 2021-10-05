package UdemyExercise.OneDimenssionalArray9;

/*
  编写一个程序，读入个数不确定的考试分数，
  并且判断有多少个分数是大于或等于平均分，多少个分数是低于平均分的。
  输人一个负数表示输入的结束。假设最高分为100。
 */

//有问题

import java.util.Scanner;

public class LowerThanAvg3 {

  public static void main(String[] args) {
    System.out.println("Enter the integers between 1 and 100: ");
    int[] score = new int[100];

    count(score);

  }

  public static void count(int[] array) {
    Scanner input = new Scanner(System.in);
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();

      if (array[i] > 0 && array[i] <= 100) {
        sum += array[i];
      } else if (array[i] == 0) {
        break;
      }
    }

    double average = sum / array.length;

    int count1 = 0, count2 = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= average) {
        count1++;
      } else if (array[i] < average) {
        count2++;
      }
    }

    System.out.println(
        "The count bigger than avg is " + count1 + "\nThe count lower than avg is " + count2);
  }

}
