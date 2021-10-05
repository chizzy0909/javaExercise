package UdemyExercise;

import java.util.Scanner;

public class basic1_4 {

  public static void main(String[] args) {

    /*
    1 请声明各种类型的变量，并且不赋初始值。
        输出各个类型的变量，来看下他们的默认初始值
        例如 int i;
            System.out.println(i);
     */

    byte a = 0;
    short b = 0;
    int c = 0;
    long d = 0;
    float e = 0;
    double f = 0;
    char g = 0;
    boolean h = false;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);

    //3 整数3除以整数2等于？
    int i = 3 / 2;
    System.out.println(i);

    //4 整数3除以浮点型类型的2 等于？
    double j = 3 / 2.0;
    System.out.println(j);

    //5 请声明一个常量，并对其赋值
    final double PI = 3.14159;

   /*
    6 分别写出以下几种命名来体现命名规则，具体名字不限(要有3个英文单词链接)
    6-1 类  Class CreditCardNumber
    6-2 方法  public void creditCardNumber()
    6-3 变量  int creditCardNumber
    6-4 常量  final int CREDIT_CARD_NUMBER
   */

    //7 分别声明值是2的float型，double型，long型
    float a1 = 2.0f;
    double a2 = 2.0d;
    long a3 = 2L;

    //8 声明变量x,y,z 并且分别赋值，输出，x加y的的结果再乘以z
    int x = 3;
    int y = 4;
    double z = 3.2;
    double xyz = (x + y) * z;
    System.out.println(xyz);

    //9 请写一段代码来阐述前置加，后置加的区别 (++i,i++的区别)
    int i1 = 1;
    int j1 = i1++; // i1赋值给j1，i1自增
    int k1 = j1 + i1++;  //后置自增不参与运算，i1自增
    System.out.println(j1 + " " + i1 + " " + k1);
    int i2 = 1;
    int j2 = ++i2; // +1后i2赋值给j2，i2自增
    int k2 = j2 + ++i2; // //前置自增参与运算，i1自增
    System.out.println(j2 + " " + i2 + " " + k2);

    /*
    10 解释 int x = 5/2.0
     10-1 为什么以上有编译错误, （原因文字写出来就行）
         2.0は浮動小数点型で、大きい数値の型は小さい数値の型に直接値を付けることができないため、キャストする必要がある。

     10-2解释什么情况需要显示的转型，什么时候发生自动转型，（原因文字写出来就行）
     　　大きい数値の型は小さい数値の型に直接値を付けるの際、キャストする必要がある。
     　　小さい数値の型は大さい数値の型に値を付けるの際、キャストすることは自動です。
　　　　　整数の型と浮動小数点数の型が同時にあって、自動的に浮動小数点数の型になる。

     10-3 写出两个例子，自动转型和显示转型
     */

    int x1 = (int) (5 / 2.0); // 2.0是浮点型，大的数据类型不能直接赋值给小的数据类型，所以需要显示转换。
    double x2 = 2; //小的数据类型可以直接赋值给大的数据类型，隐式转换。
    System.out.println(3 * 1.6); //既有整型又有浮点型，会自动转成浮点型。

    //11 请输出如下字符串
    //my uncle's dog eats nothing \ . "what a strange dog"
    String s1 = "my uncle's dog eats nothing";
    String s2 = "what a strange dog";

    //12 有一个字符串"sdflskjdfw2234234l" 判断 字符大写A是否在该字符串中。
    //不区分大小写，比如字符串"abc"的话，大写B或者小写b都算在"abc"中
    String s3 = "sdflskjdfw2234234l";
    System.out.println(s3.contains("A"));
    System.out.println(s3.toUpperCase().contains("ABC"));

    //13 如何比较两个字符串 用== 可以判断吗，如果不能应该用什么方法，写出正确的比较方法
    //不能用==，他比较引用类型所指向的对象的地址
    System.out.println(s1.equals(s2));

    //14 已知字符串"abcd...xyz"，26个字母都包括的一个字符串，键盘输入2个字符，比如第一次输入e ，第二次如数 m，
    // 那么请返回 "fghijkl"这样的一个字符串，也就是 2个字母之前的字符串
    String s4="abcdefghijklmnopqrstuvwxyz";

    //11111111111111111111

  }

}
