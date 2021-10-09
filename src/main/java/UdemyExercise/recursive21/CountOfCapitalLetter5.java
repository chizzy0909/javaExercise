package UdemyExercise.recursive21;

/*
(求字符串中大写字母的个教)编写一个递归方法，返回一个字符串中大写字母的个数。
编写一 个测试程序.提示用户输人一个宇符串，然后显示该字符串中大写字母的数目。
 */

public class CountOfCapitalLetter5 {

  public static void main(String[] args) {
    String s = "AKBKHBvvwrwbr";
    System.out.println(getCount(s, 0));
  }

  public static int getCount(String s, int i) {
    if (i == s.length() - 1) {
      return 0;
    }
    int sum = 0;
    char c = s.charAt(i);
    if (Character.isUpperCase(c)) {
      sum++;
    }
    return sum + getCount(s, i + 1);
  }
}
