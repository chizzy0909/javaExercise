package UdemyExercise.generic23;

//为线性搜索实现以下泛型方法。

public class LinearSearch2 {

  public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
    for (int i = 0; i < list.length; i++) {
      if (key.compareTo(list[i]) == 0) {
        return i;
      }
    }
    return -1;
  }


}
