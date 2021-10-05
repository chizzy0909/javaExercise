package UdemyExercise.Select4;

import java.util.Scanner;

//( 对三个整数排序）编写程序，提示用户输入三个整数。以非降序的形式显示这三个整数。
public class SortOfInteger3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three integers: ");

    int integer1 = input.nextInt();
    int integer2 = input.nextInt();
    int integer3 = input.nextInt();

    if (integer1 > integer2 || integer1 > integer3) {
      if (integer1 > integer2){
        int temp = integer1;
        integer1 = integer2;
        integer2 = temp;
      }
      if (integer1 > integer3){
        int temp = integer1;
        integer1 = integer3;
        integer3 = temp;
      }
    }
    if(integer2 > integer3){
      int temp = integer2;
      integer2 = integer3;
      integer3 = temp;
    }

    System.out.println(integer1 + " " + integer2 + " " + integer3);


  }
}
