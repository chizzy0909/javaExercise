package UdemyExercise.regular;

//匹配一个给定字符串中的电话号码
//String phone = "18637866964"

public class TelNumber3 {

  public static void main(String[] args) {
    String phone = "18637866964";
    String reg = "^1[3,5,7,8,9]\\d{9}$";
    System.out.println(phone.matches(reg));
  }
}
