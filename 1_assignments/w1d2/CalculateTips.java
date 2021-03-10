import java.util.Scanner;

/*
Write a program that reads the subtotal and the gratuity rate, t
hen computes the gratuity and total. For example, 
if the user enters 10 for subtotal and 15% for gratuity rate, 
the program displays $1.5 as gratuity and $11.5 as total.  
*/
public class CalculateTips {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Please Enter a sudtotal: ");
    int subtotal = sc.nextInt();

    System.out.print("Please Enter a gratuity rate: ");
    int gratuity = sc.nextInt();
    double gratuityDouble = gratuity * 0.01;
    
    double totalAmount = subtotal + (subtotal * gratuityDouble);
    System.out.println("$" + totalAmount);

  }
}
