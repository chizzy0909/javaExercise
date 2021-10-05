package UdemyExercise.String6;

//(ナンバープレートの生成)1つのナンバープレートが3つの大文字と4つの数字で構成されているとします。
// ナンバープレートを生成するプログラムを作成する。

public class PlateNumber5 {

  public static void main(String[] args) {

    int letter1 = (int) (65 + Math.random() * 26);
    int letter2 = (int) (65 + Math.random() * 26);
    int letter3 = (int) (65 + Math.random() * 26);

    int digit1 = (int) (Math.random() * 10);
    int digit2 = (int) (Math.random() * 10);
    int digit3 = (int) (Math.random() * 10);
    int digit4 = (int) (Math.random() * 10);

    System.out.println(
        "The plate number is " + (char) letter1 + (char) letter2 + (char) letter3
            + digit1 + digit2 + digit3 + digit4);

  }

}
