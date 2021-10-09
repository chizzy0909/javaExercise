package UdemyExercise.generic23;

//实现下面的方法，返回数组中的最大元素。

public class ArrayMax3 {

  public static <E extends Comparable<E>> E max(E[] list) {
    E max = list[0];
    for (int i = 0; i < list.length; i++) {
      if (list[i].compareTo(max) > 0) {
        max = list[i];
      }
    }
    return max;
  }

}