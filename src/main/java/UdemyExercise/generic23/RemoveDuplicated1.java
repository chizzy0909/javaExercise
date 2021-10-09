package UdemyExercise.generic23;

//编写以下方法，返回一个新的ArrayList。新的列表中包含来自原列表中不重复的元素。

import java.util.ArrayList;

public class RemoveDuplicated1 {

  public static <E extends Comparable<E>> ArrayList<E> removeDuplicated(ArrayList<E> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j).compareTo(list.get(i)) == 0) {
          list.remove(j);
        }
      }
    }
    return list;
  }


}
