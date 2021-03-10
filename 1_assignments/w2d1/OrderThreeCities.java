/**
 * Write a program that prompts the user to enter three cities and
 * displays them in ascending order.
 */

import java.util.Arrays;
import java.util.Scanner;

public class OrderThreeCities {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] cities = new String[3];

    System.out.print("Enter the first city: ");
    String firstCity = sc.nextLine();
    firstCity = Character.toUpperCase(firstCity.charAt(0)) + firstCity.substring(1);
    cities[0] = firstCity;

    System.out.print("Enter the second city: ");
    String secondCity = sc.nextLine();
    secondCity = Character.toUpperCase(secondCity.charAt(0)) + secondCity.substring(1);
    cities[1] = secondCity;

    System.out.print("Enter the third city: ");
    String thirdCity = sc.nextLine();
    thirdCity = Character.toUpperCase(thirdCity.charAt(0)) + thirdCity.substring(1);
    cities[2] = thirdCity;

    Arrays.sort(cities);

    System.out.println("The three cities in a alphabetical order are " + String.join(" ", cities));
    sc.close();
  }

}
