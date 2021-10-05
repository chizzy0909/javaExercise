package UdemyExercise.Loop7;

//生徒数を入力し、それぞれの生徒の名前と点数を順に入力し、最高点と副高点を出す。

import java.util.Scanner;

public class TopTwo6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int n = input.nextInt();

    int highScore1 = 0, highScore2 = 0;
    String highScoreName1 = "", highScoreName2 = "";

    System.out.println("Enter each student’s name and score: ");
    for (int i = 1; i <= n; i++) {
      System.out.println("student " + i);

      System.out.print("  name: ");
      String name = input.next();

      System.out.print("  score: ");
      int score = input.nextInt();

      if (n == 1) {
        highScore1 = score;
        highScoreName1 = name;
        System.out.println(highScoreName1 + " got the highest score: " + highScore1);
        return;
      } else if (n == 2 && score > highScore1) {
        highScore2 = highScore1;
        highScore1 = score;
        highScoreName2 = highScoreName1;
        highScoreName1 = name;
      } else if (n == 2) {
        highScore2 = score;
        highScoreName2 = name;
      } else if (n > 2 && score > highScore1 && score > highScore2) {
        highScore2 = highScore1;
        highScore1 = score;
        highScoreName2 = highScoreName1;
        highScoreName1 = name;
      } else if (n > 2 && score > highScore2) {
        highScore2 = score;
        highScoreName2 = name;
      }
    }

    System.out.println(highScoreName1 + " got the highest score: " + highScore1 +
        "\n" + highScoreName2 + " got second highest scores: " + highScore2);
  }
}


