package UdemyExercise.regular;

//运用正则表达式相关知识编写一个程序
// 将“我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程”
// 还原成：我要学编程。
//可以编写一个专门的方法，也可以直接在main方法里实现。

public class Regex1 {

  public static void main(String[] args) {
    String s1 = "我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、"
        + "学编编编、、编编编程、、程程";
    String s2 = s1.replaceAll("\\、+", "");
    System.out.println(s2);
    String s3 = s2.replaceAll("(.)\\1+", "$1");
           // "(.)\\1+"匹配连续的多个个相同的任意字符    \\1 代表让第一组在出现一次    $1 代表第一组内容
    System.out.println(s3);
  }

}
