package UdemyExercise.generic23;

//编写一个泛型方法，，返回二维数组中的最大元素。

public class TwoDimensionArrayMax4 {

  public static <E extends Comparable<E>> E max(E[][] list) {
    E max = list[0][0];
    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list[i].length; j++) {
        if (list[i][j].compareTo(max) > 0)
          max = list[i][j];
      }
    }
    return max;
  }

}
