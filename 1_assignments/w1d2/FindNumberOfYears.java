import java.util.Scanner;

/**
Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
and displays the number of years and days for the min- utes. 
For simplicity, assume a year has 365 days 
*/
public class FindNumberOfYears {
    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    final int MINUTES_PAR_YEAR = 525600;
    final int MINUTES_PAR_DAY = 1440;

    int minutes;

    while (true) {
      System.out.print("Please Enter a Minutes: ");
      minutes = sc.nextInt();
      if (minutes >= 0) {
        break;
      } else {
        System.out.println("Please enter number more than or eqaul to 0.");
      }
    }

    int year = minutes / MINUTES_PAR_YEAR;
    int remainder = minutes % MINUTES_PAR_YEAR;
    int day = remainder / MINUTES_PAR_DAY + 1;

    System.out.println(minutes + " minutes = " + year + "years and " + day + "days.");

  }
}
