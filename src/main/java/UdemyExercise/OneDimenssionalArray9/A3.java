package UdemyExercise.OneDimenssionalArray9;

import java.util.Scanner;

public class A3 {
//3 的另一正解
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter grade for students:");
    int[] grade = new int[10];
    int i, j;
    for (i = 0; i < grade.length; i++) {
      grade[i] = input.nextInt();
      int temp = grade[i];
      if (temp > 0 && temp < 100) {
        grade[i] = temp;
      } else {
        break;
      }
    }

    int count1 = 0;
    int count2 = 0;
    if (i != 0) {
      double ave = Average(grade, i);
      System.out.println(ave);
      for (j = 0; j < i; j++) {
        if (grade[j] >= ave) {
          count1++;
        } else if (grade[j] < ave) {
          count2++;
        }
      }
    }

    System.out.println("the number of greaterthanaverage is :" + count1);
    System.out.println("the number of greaterthanaverage is :" + count2);
  }

  public static double Average(int[] array, double i) {
    int sum = 0;
    for (int j = 0; j < i; j++) {
      sum += array[j];
    }
    return (sum / i);
  }

}
