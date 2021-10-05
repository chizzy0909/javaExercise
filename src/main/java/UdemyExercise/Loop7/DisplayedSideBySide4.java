package UdemyExercise.Loop7;

//次の二つの表を並べて表示する

public class DisplayedSideBySide4 {

  public static void main(String[] args) {
    final double POUNDS_PER_KILOGRAM = 2.2;
    System.out.println("Kilograms       Pounds   |   Pounds        Kilograms");

    for (int k = 0, p = 0; k < 200 && p < 500; k += 2, p += 2) {

      System.out.printf("  %-15d%5.2f", k, p * 2.2);
      System.out.print("   |   ");
      System.out.printf("  %-15d%5.2f\n", p, k / 2.2);
    }
  }
}
