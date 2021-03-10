/**
 * Write a program that prompts the user to enter a letter
 * and check whether the letter is a vowel or consonant.
 */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class VowOrCon {

  public static void main(String[] args) {

    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a letter: ");
    String letter = (sc.nextLine());

    if (letter.length() != 1) {
      System.out.println("'" + letter + "' is an invalid input.");
      return;
    }

    char lowerLetter = Character.toLowerCase(letter.charAt(0));

    if (!Character.isLetter(lowerLetter)) {
        System.out.println("'" + letter + "' is an invalid input.");
    } else if (vowels.contains(lowerLetter)) {
        System.out.println("'" + letter + "' is a vowel.");
    } else {
        System.out.println("'" + letter + "' is a consonant.");
    }

    sc.close();

  }

}
