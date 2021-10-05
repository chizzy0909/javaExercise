package UdemyExercise.OneDimenssionalArray9;

//编写程序，读取10 个整数，然后按照和读入顺序相反的顺序将它们显示出来。

import java.util.Scanner;

public class DescensingSort2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 integers: ");
    int[] number = new int[10];

    for (int i = 0; i < number.length; i++) {
      number[i] = input.nextInt();
    }
    reverse(number);
  }

  public static void reverse(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
  }

}
