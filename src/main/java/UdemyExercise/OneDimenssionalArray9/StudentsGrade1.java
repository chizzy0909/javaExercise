package UdemyExercise.OneDimenssionalArray9;

/*
编写一个程序，读入学生成绩，获取最高分best，然后根据下面的规则赋等级值。
如果分数>=best-10,等级为A
如果分数>=best-20,等级为B
如果分数>=best-30,等级为C
如果分数>=best-40,等级为D
其他情况下，等级为F
程序提示用户输入学生总数，然后提示用户输入所有的分数，最后显示等级得出结论。
 */

import java.util.Scanner;

public class StudentsGrade1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of students: ");
    int n = input.nextInt(); //确定数组大小

    int[] score = new int[n];  //创建数组
    char[] grade = new char[n];

    System.out.println("Enter all scores: ");
    for (int i = 0; i < n; i++) {
      score[i] = input.nextInt();  //对数组输入数据
    }

    getGrade(score, grade); //获得等级

    for (int i = 0; i < n; i++) {
      System.out.println("The score of student " + i + " is " + score[i]
          + " and the grade is " + grade[i]);
    }

  }

  public static int max(int[] scoreArray) {
    int max = scoreArray[0];
    for (int i = 0; i < scoreArray.length; i++) {
      if (scoreArray[i] > max) {
        max = scoreArray[i];
      }
    }
    return max;
  }

  public static void getGrade(int[] score, char[] grade) {

    for (int i = 0; i < score.length; i++) {
      if (score[i] >= max(score) - 10) {
        grade[i] = 'A';
      } else if (score[i] >= max(score) - 20) {
        grade[i] = 'B';
      } else if (score[i] >= max(score) - 30) {
        grade[i] = 'C';
      } else if (score[i] >= max(score) - 40) {
        grade[i] = 'D';
      } else {
        grade[i] = 'F';
      }

    }
  }

}
