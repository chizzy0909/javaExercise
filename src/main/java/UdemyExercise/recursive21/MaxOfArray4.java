package UdemyExercise.recursive21;

//(找出数组中的最大数)编写一个递归方法，返回一个数组中的最大整数。
// 编写一个测试程序， 提示用户输人一个包含 8 个整数的列表 .然后显示最大的元素。

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray4 {

  public static void main(String[] args) {

    /*
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number integers: ");
    int n = input.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }
    System.out.println(Arrays.toString(array));

     */
    int[] array={1,2,3,4,12,6,7,8,9};

    System.out.println(maxOfArray(array, 0));

  }


  private static int maxOfArray(int[] array, int index) {

    if (index == array.length - 1) {
      return array[index];
    }
    return Math.max(array[index], maxOfArray(array, index+1));
  }

}
