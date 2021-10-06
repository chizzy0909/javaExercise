public class Test25b {

  public static void main(String[] args) {
    int[] a = {1, 2};
    swapA(a);
    System.out.println(a[0] + " " + a[1]);
  }

  public static void swapA(int[] a) {
    int temp = a[0];
    a[0] = a[1];
    a[1] = temp;
  }
}
