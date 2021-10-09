package UdemyExercise.recursive21;

import java.util.Arrays;
//数组排序
public class Test12 {

  public static void main(String[] args) {
    double[] list = {5.0, 6.0, 12.0, 8.0, 9.0};
    sort(list,4);
    System.out.println(Arrays.toString(list));
  }


  public static void sort(double[] list) {
    sort(list, list.length - 1);
  }

  public static void sort(double[] list, int high) {
    if (high > 1) {
      // Find the largest number and its index
      int indexOfMax = 0;
      double max = list[0];
      for (int i = 1; i <= high; i++) {
        if (list[i] > max) {
          max = list[i];
          indexOfMax = i;
        }
      }
      // Swap the largest with the last number in the list
      list[indexOfMax] = list[high];
      list[high] = max;
      // Sort the remaining list
      sort(list, high - 1);
    }
  }
}
