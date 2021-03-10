import java.util.Scanner;

/*
(Compute the volume of a cylinder) Write a program that reads in the 
radius and length of a cylinder and computes the area and volume 
using the following formulas:

  area = radius * radius * p 
  volume = area * length
*/
public class ComputeVolueOfCylinder {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    final double PI = 3.1415d;

    System.out.print("Please Enter a Radius: ");
    double radius = sc.nextDouble();

    System.out.print("Please Enter a Length: ");
    int len = sc.nextInt();

    double area = Math.pow(radius, 2) * PI;
    double volume = area * len;

    System.out.println(radius + " * " + radius + " * " + " P = "+ area + "(Area)");
    System.out.println(area + " * " + len + " = " + volume + " (volume)");
  }
}
