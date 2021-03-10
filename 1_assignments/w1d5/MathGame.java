import java.util.Scanner;

/**
 * Write a program with your partner that works as a two player math game in the console.
 * It should print out some sort of message letting you know the rules of the game. 
 * It should ask if you want to start the game. 
 * It will then randomly generate math questions (simple addition) one at a time for the players 
 * to answer. After every round you will print the current number of lives remaining. 
 * Each player will have 3 lives.
 */

public class MathGame {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");

    // get a input from a console.
    String userAnsYOrN;
    while (true) {
      userAnsYOrN = sc.next().toLowerCase();
      if (userAnsYOrN.equals("y") || userAnsYOrN.equals("n")) {
        break;
      } else {
        System.out.println("Enter y or n");
      }
    }

    if (userAnsYOrN.equals("n")) {
      System.out.println("Bye!");
      System.exit(0);
    }

    System.out.println("You each have 3 lives.");

    /* number of players */
    final byte MAX_PLAYER = 2;
    /* default number of each player's life */
    final byte LIFE_DEFAULT = 3;

    byte player1Lives = LIFE_DEFAULT;
    byte player2Lives = LIFE_DEFAULT;

    /* user to distinguish which user's turn */
    byte playerTurn = 1;
    short quizAns;
    short userAns;

    do {
      quizAns = makeQuiz("Player " + playerTurn);

      // get a user answer from a console.
      while (true) {
        System.out.print("Your answer: ");
        if (sc.hasNextShort()) {
          userAns = sc.nextShort();
          break;
        } else {
          System.out.println("Please Enter a number.");
          sc.next();
        }
      }
      
      if (quizAns == userAns) {
        System.out.println("Correct!");
      } else {
        System.out.println("Incorrect! The answer was " + quizAns + ".");

        if (playerTurn == 1) {
          player1Lives--;
        } else {
          player2Lives--;
        }  
      }

      playerTurn++;

      if (playerTurn > MAX_PLAYER) {
        playerTurn = 1;
      }

      System.out.println("The lives: Player 1: " + player1Lives + "/" + LIFE_DEFAULT +
       " Player 2: " + player2Lives + "/" + LIFE_DEFAULT);

    } while (player1Lives != 0 && player2Lives != 0);

    System.out.println("Player " + playerTurn + " wins!");
    sc.close();
  }

  public static short makeQuiz(String player) {

    short quizAns = Short.MIN_VALUE;
    byte num1 = (byte)((Math.random() * 100) + 1);
    byte num2 = (byte)((Math.random() * 100) + 1);

    // randomOperator will be +, -, or *.
    byte randomOperator = (byte)(Math.random() * 3);

    switch (randomOperator) {
      case 0:
        System.out.println(player + ": What is " + num1 + " + " + num2);
        quizAns = (short) (num1 + num2);
        break;
      case 1:
        System.out.println(player + ": What is " + num1 + " - " + num2);
        quizAns = (short) (num1 - num2);
        break;
      case 2:
        System.out.println(player + ": What is " + num1 + " * " + num2);
        quizAns = (short) (num1 * num2);
        break;
    }

    return quizAns;
  }
}