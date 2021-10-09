package UdemyExercise.recursive21;

//回文

public class Test9 {

  public static void main(String[] args) {
    String s="abababa";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) {    // Base case
      return true;
    } else if (s.charAt(0) != s.charAt(s.length() - 1)) {    // Base case
      return false;
    } else {
      return isPalindrome(s.substring(1, s.length() - 1));    //左闭右开
    }
  }
}
