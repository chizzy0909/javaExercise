package UdemyExercise.OneDimenssionalArray9;

import java.util.Scanner;

/*
  编写一个方法，返回个数不确定的整数的最大公约数。指定这个方法头如下所示：
  public static int gcd(int… numbers)
  编写测试程序，提示用户输人 5 个数字，调用该方法找出这些数的最大公约数，并显示这个最大公约数。
 */
public class gcd6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 integers: ");

    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
    System.out.println(gcd(numbers));

  }

  public static int gcd(int... numbers) {   //可变长参数

    int min = numbers[0]; //先找到最小值
    for (int e : numbers) {
      if (e < min) {
        min = e;
      }
    }

    int gcd = 1;      // Initial gcd is 1
    boolean isDivisor;  // Is number a diviser

    for (int i = 2; i < min; i++) {
      isDivisor = true;
      for (int e : numbers) {
        if (e % i != 0) {
          isDivisor = false;
        }
      }
      if (isDivisor) {
        gcd = i;
      }
    }
    return gcd;
  }


}

