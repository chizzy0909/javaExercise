package UdemyExercise.recursive21;

//(字符串中某个指定字符出现的次教)编写一个递归方法，使用下面的方法头给出一个指定字符 在字符串中出现的次数。
//public static int count(String str,char a)

import java.util.Scanner;

public class CharacterCount2 {

  public static void main(String[] args) {
    String s = "Andrew Programming mmmm";
    char ch = 'm';
    System.out.println(count(s, ch));
  }

  public static int count(String str, char a) {
    int counter = 0;
    if (str.length() == 0) {
      return 0;   //基础条件：字符串长度为0
    }
    if (str.charAt(str.length() - 1) == a) {
      counter++;   //最后一个字符串
    }
    counter += count(str.substring(0, str.length() - 1), a);
    return counter;
  }
}
