package UdemyExercise.Select4;

/*(找到将来的日期）编写一个程序，提示用户输入代表今天日期的数字（周日 为 0, 周一为 1,……， 周六为 6 )。
  同时，提示用户输入一个今天之后的天数，作为代表将来某天的数字，然后显示这天是星期几
 */

import java.util.Scanner;

public class FindFutureDate2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter today’s day: ");
    int today = input.nextInt();
    System.out.print("Enter the number of days elapsed since today:");
    int daysElapsed = input.nextInt();

    int futureDay = (today + daysElapsed) % 7;

    System.out.print("Today is ");
    switch(today){
      case 0: System.out.println("Sunday");break;
      case 1: System.out.print("Monday"); break;
      case 2: System.out.print("Tuesday"); break;
      case 3: System.out.print("Wednesday"); break;
      case 4: System.out.print("Thursday"); break;
      case 5: System.out.print("Friday"); break;
      case 6: System.out.print("Saturday");
    }

    System.out.print(" and the future day is ");
    switch (futureDay)
    {
      case 0: System.out.println("Sunday"); break;
      case 1: System.out.println("Monday"); break;
      case 2: System.out.println("Tuesday"); break;
      case 3: System.out.println("Wednesday"); break;
      case 4: System.out.println("Thursday"); break;
      case 5: System.out.println("Friday"); break;
      case 6: System.out.println("Saturday");
    }
  }
}
