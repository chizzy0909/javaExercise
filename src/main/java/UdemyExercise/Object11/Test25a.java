public class Test25a {

  public static void main(String[] args) {
    int[] a = {1, 2};
    swapA(a[0], a[1]);
    System.out.println(a[0]+" "+a[1]);
  }

  public static void swapA(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }
}
