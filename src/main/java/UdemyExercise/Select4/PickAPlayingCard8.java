package UdemyExercise.Select4;

/*(游戏：挑一张牌）编写程序，模拟从一副 S2 张的牌中选择一张牌。
   程序应该显示牌的大小 (Ace、2、3、4、5、6、7、8、9、10、Jack、Queen、King)
   以及牌的花色（Clubs (黑梅花)、 Diamonds (红方块） 、Hearts (红心） 、Spades (黑桃））。
 */
public class PickAPlayingCard8 {

  public static void main(String[] args) {
    int rank = (int) (Math.random() * 13 + 1);
    int suit = (int) (Math.random() * 4);

    System.out.print("The card you picked is ");
    switch (rank) {
      case 1:
        System.out.print("Ace");
        break;
      case 2:
        System.out.print(rank);
        break;
      case 3:
        System.out.print(rank);
        break;
      case 4:
        System.out.print(rank);
        break;
      case 5:
        System.out.print(rank);
        break;
      case 6:
        System.out.print(rank);
        break;
      case 7:
        System.out.print(rank);
        break;
      case 8:
        System.out.print(rank);
        break;
      case 9:
        System.out.print(rank);
        break;
      case 10:
        System.out.print(rank);
        break;
      case 11:
        System.out.print("Jack");
        break;
      case 12:
        System.out.print("Queen");
        break;
      case 13:
        System.out.print("King");
    }

    System.out.print(" of ");
    switch (suit) {
      case 0:
        System.out.println("Clubs");
        break;
      case 1:
        System.out.println("Diamonds");
        break;
      case 2:
        System.out.println("Hearts");
        break;
      case 3:
        System.out.println("Spades");
    }
  }

}

