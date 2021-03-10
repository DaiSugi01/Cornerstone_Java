/**
 * Write a program that prompts the user to enter the length from
 * the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.
 * 
 *    The formula for computing the area of a pentagon is Area 
 *      = (5 * s^2) / (4 * tan(PI/5))
 * 
 *    where s is the length of a side. The side can be computed using the bellow fomula.
 *      s = 2r sin(PI/5)
 * 
 *    where r is the length from the center of a pentagon to a vetex.
 *    Round up two digits after the decimal point.
 */

import java.util.Scanner;

public class AreaOfPentagon {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length from the center to a vertex: ");

    // length from the center of a pentagon to a vertex.
    double r = sc.nextDouble();

    // length of a side.
    double s = 2 * r * Math.sin(Math.PI / 5);

    double areOfPentagon = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
    // round up two digits after the decimal point.
    areOfPentagon = Math.round(areOfPentagon * 100) / 100d;

    System.out.println("The area of the pentagon is " + areOfPentagon);

    sc.close();
  }

}
