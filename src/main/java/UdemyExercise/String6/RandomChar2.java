package UdemyExercise.String6;

//(ランダム文字) math.random()というメソッドを使ってランダムな大文字が1つを表示するプログラムを作成する。

import static java.lang.Math.random;

public class RandomChar2 {

  public static void main(String[] args) {

    //char a = 65; return A
    //char b = 'A'; return A
    //int c = 'A'; return65

    int a = 65 + (int) (Math.random() * 26);
    System.out.println((char) a);

  }
}
