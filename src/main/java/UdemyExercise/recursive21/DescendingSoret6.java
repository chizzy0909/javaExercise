package UdemyExercise.recursive21;

/*
(以逆序输出一个整数中的數字)编写一个递归方法，使用下面的方法头在控制台上以逆序显示
一个 int 型的值:
public static void reverseDisp1ay(1nt value)
例如，reverseDisplay(12345)显示的是 54321。编写一个测试程序，提示用户输入一个整数,然后显示它的逆序数字。
 */

public class DescendingSoret6 {

  public static void main(String[] args) {
    int i=5358;
    reverseDisplay(i);
  }

  public static void reverseDisplay(int value) {
    if (value > 0) {
      System.out.print(value % 10);
      reverseDisplay(value / 10);
    }
  }
}
