package UdemyExercise.recursive21;

/*
(使用递归求最大公约数)求最大公约数的gcd(m,n)方法也可以如下递归地定义:
• 如果m*n为0,那么gcd(m,n)的值为n。
• 否则，gcd(m,n)就是gcd(n,m%n)。
编写一个递归的方法来求最大公约数。编写一个测试程序，提示用户输人两个整数，显示 它们的最大公约数
 */

public class GreatestCommonDivisor8 {

  public static void main(String[] args) {
    System.out.println(gcd(90,25));
  }

  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    }
    return gcd(n, m % n);
  }

}
