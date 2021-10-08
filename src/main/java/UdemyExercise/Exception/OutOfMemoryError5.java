package UdemyExercise.Exception;

//编写一个程序，它能导致JVM抛出一个OutOfMemoryError的异常，然后捕获并处理这个异常。
//JVM は OutOfMemoryError の例外を投げ、この例外を捕捉(ほそく)して処理する。

public class OutOfMemoryError5 {

  public static void main(String[] args) {
    try {
      int[] array = new int[Integer.MAX_VALUE];
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println(e.getMessage());
    }

  }
}
