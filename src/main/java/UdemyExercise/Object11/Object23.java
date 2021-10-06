public class Object23 {

  public static void main(String[] args) {
    Count count = new Count();
    int times = 10;

    for (int i = 0; i < 100; i++) {
      increment(count,times);
    }
    System.out.println(count.count);
    System.out.println(times);
  }

  public static void increment(Count c,int times){
    c.count++;
    times++;
  }
}

