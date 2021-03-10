import java.lang.Math;

public class PickACard {

  public static void main(String args[]) {

    int cardNum = (int)(Math.random() * 13) + 1;
    int suit = (int)(Math.random() * 4);

    String suitStr = "";
    switch (suit) {
        case 0:
            suitStr = "Clubs";
            break;
        case 1:
            suitStr = "Diamonds";
            break;
        case 2:
            suitStr = "Hearts";
            break;
        case 3:
            suitStr = "Speads";
            break;
    }

    if (cardNum > 1 && cardNum < 11) {
      System.out.println("The card you picked is " + cardNum + " of " + suitStr);
    } else {
      switch (cardNum) {
        case 1:
            System.out.println("The card you picked is Ace of " + suitStr);
            break;
        case 11:
            System.out.println("The card you picked is Jack of " + suitStr);
            break;
        case 12:
            System.out.println("The card you picked is Queen of " + suitStr);
            break;
        case 13:
            System.out.println("The card you picked is King of " + suitStr);
            break;
        }
      }
    }
}
