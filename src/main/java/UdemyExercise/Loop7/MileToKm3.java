package UdemyExercise.Loop7;

//(マイルをキロメートルに変換する)
// (1マイルあたり1.609キロメートル)

public class MileToKm3 {

  public static void main(String[] args) {

    final double MILE_PER_KM = 1.609;
    System.out.println("Miles        Kilometers");
    for (int i = 0; i < 200; i += 2) {
      double j = i / MILE_PER_KM;
      System.out.printf("  %-13d%5.2f\n",i,j);
    }

  }


}
