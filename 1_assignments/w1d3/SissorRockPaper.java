import java.util.Scanner;
import java.lang.Math;

public class SissorRockPaper {
  
  public static void main(String[] args) {
    System.out.println("This is a scissor, rock, paper!");

    Scanner input = new Scanner(System.in);

    // get a user input from console.
    int userChoice = -1;
    while (true) {
        System.out.print("scissor (0), rock (1), paper (2) : ");
        userChoice = input.nextInt();
        if (userChoice >= 0 && userChoice <= 2) {
            break;
        } else {
            System.out.println("Please enter number between 0-2.");
        }
    }

    // get a computer choice between 0-2.
    int computerChoice = (int)(Math.random() * 3);

    String userChoiceStr = "";
    switch (userChoice) {
        case 0:
            userChoiceStr = "scissor";
            break;
        case 1:
            userChoiceStr = "rock";
            break;
        case 2:
            userChoiceStr = "paper";
            break;
    }

    String computerChoiceStr = "";
    switch (computerChoice) {
        case 0:
            computerChoiceStr = "scissor";
            break;
        case 1:
            computerChoiceStr = "rock";
            break;
        case 2:
            computerChoiceStr = "paper";
            break;
    }

    int resultNum = userChoice - computerChoice;
    switch (resultNum) {
        case 0:
            System.out.println("The computer is " + computerChoiceStr + "  You are " + userChoiceStr + ". It is draw.");
            break;
        case 1:
            System.out.println("The computer is " + computerChoiceStr + ". You are " + userChoiceStr + ". You won.");
            break;
        case -2:
            System.out.println("The computer is " + computerChoiceStr + ". You are " + userChoiceStr + ". You won.");
            break;
        default:
            System.out.println("The computer is " + computerChoiceStr + ". You are " + userChoiceStr + ". You lose.");
    }
  }
}
