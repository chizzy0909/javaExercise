package UdemyExercise.generic23;

//编写以下方法，打乱ArrayList。

import java.util.ArrayList;

public class ShuffleArray6 {

    public static <E> void shuffle(ArrayList<E> list) {
      for (int i = 0; i < list.size(); i++) {
        int index = (int)(Math.random() * list.size());
        E temp = list.get(i);
        list.set(i, list.get(index));
        list.set(index, temp);
      }
    }

}
