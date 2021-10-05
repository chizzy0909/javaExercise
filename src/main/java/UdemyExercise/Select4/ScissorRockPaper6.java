package UdemyExercise.Select4;

/*（游戏：剪刀、石头、布）编写可以玩流行的剪刀-石头-布游戏的程序。
  （剪刀可以剪布，石头可以砸剪刀，而布可以包石头。）
   程序提示用户随机产生一个数，这个数为0、1或者2，分别表示石头、剪刀和布。
   程序提示用户输入值0、1或者2，然后显示一条消息，表明用户和计算机谁赢了游戏，谁输了游戏，或是打成平手。
 */

import java.util.Scanner;

public class ScissorRockPaper6 {

  public static void main(String[] args) {

    int computer = (int) (Math.random() * 3);

    Scanner input = new Scanner(System.in);
    System.out.print("Enter scissor as 0 , rock as 1 , paper as 2: ");
    int user = input.nextInt();

    System.out.print("The computer is ");
    switch (computer) {
      case 0:
        System.out.print("scissor.");
        break;
      case 1:
        System.out.print("rock.");
        break;
      case 2:
        System.out.print("paper.");
    }

    System.out.println();
    System.out.print("You are ");
    switch (user) {
      case 0:
        System.out.print("scissor.");
        break;
      case 1:
        System.out.print("rock.");
        break;
      case 2:
        System.out.print("paper.");
    }

    System.out.println();
    if (computer == user) {
      System.out.println("It is a draw.");
    } else {
      boolean win = (user == 0 && computer == 2) ||
          (user == 1 && computer == 0) ||
          (user == 2 && computer == 1);
      if (win) {
        System.out.println("You won.");
      } else {
        System.out.println("You lose.");
      }
    }

  }
}
