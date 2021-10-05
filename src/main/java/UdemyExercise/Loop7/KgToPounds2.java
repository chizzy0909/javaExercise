package UdemyExercise.Loop7;

// (キログラムをポンドに変換する)
// プログラムを作成しる:0〜200の値を入力して、次の表を表示する　(注意:1キログラムあたり2.2ポンド)

public class KgToPounds2 {

  public static void main(String[] args) {

    final double POUNDS_PER_KILOGRAM = 2.2;  //定数を設定する
    System.out.println("Kilograms       Pounds"); //テーブルのヘッダーを表示します。

    for (int kg = 0; kg < 200; kg += 2) {
      double pounds = kg / 2.2;
      System.out.printf("  %-13d%6.1f\n", kg, pounds);
    }

  }
}

