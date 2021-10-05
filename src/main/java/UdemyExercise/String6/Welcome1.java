package UdemyExercise.String6;

import java.util.Locale;

public class Welcome1 {

  public static void main(String[] args) {
    //假设s1是"Welcome" 而s2 是"welcome", 为下面的陈述编写代码：

    String s1 = "Welcome";
    String s2 = "welcome";

    //a.检査s1和s2 是否相等，然后将结果赋值给一个布尔变量isEqual。
    boolean isEqual = s1.equals(s2);
    System.out.println(isEqual);

    //b.在忽略大小写的情况下检査s1和s2是否相等，然后将结果赋值给一个布尔变量isEqual1。
    boolean isEqual1 = s1.equalsIgnoreCase(s2);
    System.out.println(isEqual1);

    //c.比较s1和s2, 然后将结果赋值给一个整型变量x1。
    int x1 = s1.compareTo(s2);
    System.out.println(x1);

    //d.在忽略大小写的情况下比较s1和s2, 然后将结果赋值给一个整型变量x2。
    int x2 = s1.compareToIgnoreCase(s2);
    System.out.println(x2);

    //c.检査s1是否有前缀"AAA", 然后将结果赋值给一个布尔变量b1。
    boolean b1 = s1.startsWith("AAA");
    System.out.println(b1);

    //f.检査s1是否有后缀"AAA", 然后将结果赋值给一个布尔变量b2。
    boolean b2 = s1.endsWith("AAA");
    System.out.println(b2);

    //g. 将s1的长度赋值给一个整型变量x3。
    int x3 = s1.length();
    System.out.println(x3);

    //h.将s1的第一个字符赋值给一个字符型变量x4。
    char x4 = s1.charAt(0);
    System.out.println(x4);

    //i.创建新字符串s3, 它是s1和s2的组合。
    String s3 = s1 + s2;
    System.out.println(s3);

    //j.创建s1 的子串，下标从1开始。
    System.out.println(s1.substring(1));

    //k.创建s1 的子串，下标从1到4。
    System.out.println(s1.substring(1, 5));  //左闭右开，注意不是（1,4）

    //l.创建新字符串s3, 它将s1转换为小写。
    System.out.println(s1.toLowerCase());

    //m.创建新字符串s3, 它将s1转换为大写。
    System.out.println(s1.toUpperCase());

    //n.创建新字符串s3 , 它将s1两端的空白字符去掉。
    System.out.println(s1.trim());

    //o.将s1中第一次出现的字符 e 的下标赋值给一个int型变量x5。
    int x5 = s1.indexOf('e');
    System.out.println(x5);

    //p.将s1中最后一次出现的字符串abc的下标赋值给一个int型变量x6。
    int x6 = s1.lastIndexOf("abc");
    System.out.println(x6);
  }
}
