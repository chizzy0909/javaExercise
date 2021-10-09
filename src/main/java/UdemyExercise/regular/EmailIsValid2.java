package UdemyExercise.regular;

//编写正则表达式程序，定义一个方法，方法的声明为public boolean isValidEmail(String email),
//该方法检验email地址是否合法，合法返回true，否则返回false。

public class EmailIsValid2 {

  public boolean isValidEmail(String email) {
    String mail = "zsy@sina.com";
    String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}";//注意：这种匹配方式适用于国内部分邮件地址，不能匹配所有的邮件
    return mail.matches(regex);
  }
}
