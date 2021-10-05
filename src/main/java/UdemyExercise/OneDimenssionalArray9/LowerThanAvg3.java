package UdemyExercise.OneDimenssionalArray9;

/*
  编写一个程序，读入个数不确定的考试分数，
  并且判断有多少个分数是大于或等于平均分，多少个分数是低于平均分的。
  输人一个负数表示输入的结束。假设最高分为100。
 */


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
    int count = 0;

    int i,j;
    for ( i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
      int number = array[i];

      if (number > 0 && number <= 100) {
        sum += number;
        count++;
      } else {
        break;

      }
    }

    double average = (double) sum / count;

    int count1 = 0, count2 = 0;
    for ( j = 0; j < i; j++) {
      if (array[j] >= average) {
        count1++;
      } else if (array[j] < average) {
        count2++;
      }
    }
    System.out.println("The average is: " + average);
    System.out.println(
        "The count bigger than avg is " + count1 + "\nThe count lower than avg is " + count2);
  }

}
