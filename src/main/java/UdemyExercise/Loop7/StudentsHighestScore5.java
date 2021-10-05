package UdemyExercise.Loop7;

import java.util.Scanner;

public class StudentsHighestScore5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int n = input.nextInt();

    int highScore = 0;
    String highScoreName = "";

    System.out.println("Enter each student’s name and score: ");
    for (int i = 1; i <= n; i++) {
      System.out.println("student " + i);

      System.out.print("  name: ");
      String name = input.next();

      System.out.print("  score: ");
      int score = input.nextInt();

      if (score > highScore) {
        highScore = score;
        highScoreName = name;
      }
    }
    System.out.println(highScoreName + "got the highest score: " + highScore);
  }
}

