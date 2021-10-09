package UdemyExercise.recursive21;

/*
(使用递归求一个整数各位数字之和)编写一个递归方法，使用下面的方法头计算一个整数中各位 数之和:
public static int sumDigits(long n)
例如，SumDigits(234)返回的是 2+3+4=9。编写一个测试程序，提示用户输入一个整数， 然后显示各位数字之和
 */

public class SumOfInteger3 {

  public static void main(String[] args) {
    int n = 43423515;
    System.out.println(sumDigits(n));
  }

  public static int sumDigits(long n) {
    int sum = 0;
    if (n == 0) {
      return 0;
    } else {
      sum += n % 10;
      sum += sumDigits(n / 10);
    }
    return sum;
  }
}
