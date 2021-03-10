import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get a month from console.
        int month = -1;
        while (true) {
          System.out.print("Enter a month between 1-12: ");
          month = input.nextInt();
            if (month > 0 && month <= 12) {
                break;
            } else {
                System.out.println("Please enter number between 1-12.");
            }
        }
          
        // get a year from console.
        int year = -1;
        while (true) {
          System.out.print("Enter a year: ");
          year = input.nextInt();
            if (year > 0) {
                break;
            } else {
                System.out.println("Please enter number more than 0.");
            }
        }
      
        String monthStr = "";
        int days = -1;

        switch (month) {
            case 1:
                monthStr = "January";
                days = 31;
                break;
            case 2:
                monthStr = "February";
                days = (isLeap(year)) ? 29 : 28;
                break;
            case 3:
                monthStr = "March";
                days = 31;
                break;
            case 4:
                monthStr = "April";
                days = 30;
                break;
            case 5:
                monthStr = "May";
                days = 31;
                break;
            case 6:
                monthStr = "Jun";
                days = 30;
                break;
            case 7:
                monthStr = "July";
                days = 31;
                break;
            case 8:
                monthStr = "August";
                days = 31;
                break;
            case 9:
                monthStr = "September";
                days = 30;
                break;
            case 10:
                monthStr = "October";
                days = 31;
                break;
            case 11:
                monthStr = "November";
                days = 30;
                break;
            case 12:
                monthStr = "December";
                days = 31;
                break;
        }

        System.out.println(monthStr + " " + year + " had " + days + " days.");
    }

    public static boolean isLeap(int year) {
        if (year % 400 == 0) { return true; }

        if (year % 100 == 0 ) { return false; }

        if (year % 4 == 0) { return true; }

        return false;
    }
}
