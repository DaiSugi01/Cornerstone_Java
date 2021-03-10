import java.util.Scanner;

public class ComputerPerimeterOfTriangle {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a length of A: ");
    int A = input.nextInt();
    System.out.print("Please enter a length of B: ");
    int B = input.nextInt();
    System.out.print("Please enter a length of C: ");
    int C = input.nextInt();
    
    if ((A + B > C) && (A + C > B) && (B + C > A)) {
      System.out.println("Valid");
    } else {
      System.out.println("Invalid");
    }
  }
}