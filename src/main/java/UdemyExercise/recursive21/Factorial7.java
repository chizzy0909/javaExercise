package UdemyExercise.recursive21;

/*
(计算阶乘)使用 Biglnteger类，求得大数字的阶乘(例如，100!)。使用递归实
现 factorial 方法。编写一个程序，提示用户输人一个整数，然后显示它的阶乘。
 */

import java.math.BigInteger;

public class Factorial7 {

  public static void main(String[] args) {
    BigInteger n = BigInteger.valueOf(100);
    System.out.println(factorial(n, BigInteger.valueOf(1)));
  }

  private static BigInteger factorial(BigInteger n, BigInteger result) {
    if (n.equals(BigInteger.ZERO)) {
      return result;
    }
    return factorial(n.subtract(BigInteger.ONE), n.multiply(result));
  }
}
