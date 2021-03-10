import java.util.Scanner;

public class Assignments {
  
  public static void main(String[] args) {

    // Problem 1
    System.out.println("******* Problem 1 *******");
    int[] nums = {1, 4, 5, 7, 8, 9, 10, 12, 15, 30};
    System.out.println(binarySearch(nums, 1) == 0 ? "[Test Passed]" : "[Test Failed]");
    System.out.println(binarySearch(nums, 15) == 8 ? "[Test Passed]" : "[Test Failed]");
    System.out.println(binarySearch(nums, 11) == -1 ? "[Test Passed]" : "[Test Failed]");

    // Problem 2
    System.out.println("******* Problem 2 *******");
    System.out.println(getRandom(nums));

    // Problem 3
    System.out.println("******* Problem 3 *******");
    int[] intNumforCalcAve = {10, 20, 60};
    System.out.println(average(intNumforCalcAve) == 30 ? "[Test Passed]" : "[Test Failed]");
    double[] doubleNumforCalcAve = {10.5d, 30.5d, 19.6d};
    System.out.println(average(doubleNumforCalcAve) == 20.2d ? "[Test Passed]" : "[Test Failed]");

    // // Problem 4
    System.out.println("******* Problem 4 *******");
    Scanner sc = new Scanner(System.in);
    double[] doubleNumbers = new double[10];

    int i = 0;
    System.out.print("Please enter 10 double numbers: ");
    while (i < 10) {
        if (sc.hasNext()) {
            doubleNumbers[i++] = sc.nextDouble();
        } else {
            break;
        }
    }

    System.out.println(min(doubleNumbers));
  }


  /**
   * Write a binary search algorithm method in Java. you will have to set some arrays
   * inside your main method in order to test your binary search.
   *
   * @param nums, targetNUm;
   * @return index of the target number
   */
  public static int binarySearch(int[] nums, int targetNum) {

      int left = 0;
      int right = nums.length-1;

      while (left <= right) {
          int mid = (left+right) / 2;

          if (nums[mid] == targetNum) {
              System.out.print("The index is " + mid + " ");
              return mid;
          } else if (nums[mid] < targetNum) {
              left = mid + 1;
          } else if (nums[mid] > targetNum) {
              right = mid - 1;
          }
      }

      System.out.print("Not Found the number ");
      return -1;
  }

  /**
   * Write a method that return a random number between 1 and 54, excluding the numbers
   * passed in the argument.
   *
   * @param numbers
   * @return a random number
   */
  public static int getRandom(int[] numbers) {

      int randomNum;
      boolean isFind = false;
      do {
          isFind = false;
          randomNum = (int) ((Math.random() * 54) + 1);

          for (int number : numbers) {
              if (randomNum == number) {
                  isFind = true;
                  break;
              }
          }
      } while (isFind);

      return randomNum;
  }

  /**
   * Write two overloaded methods that return the average of an array.
   *
   * @param array
   * @return the (int) average of array
   */
  public static int average(int[] array) {
      int sum = 0;

      for (int number : array) {
          sum += number;
      }

      int average = sum / array.length;
      System.out.print("The average of int numbers of array is " + average + " ");
      return average;
  }

  /**
   * Write two overloaded methods that return the average of an array.
   *
   * @param array
   * @return the (double) average of array
   */
  public static double average(double[] array) {
      double sum = 0;

      for (double number : array) {
          sum += number;
      }

      double average = sum / array.length;
      System.out.print("The average of double numbers of array is " + average + " ");
      return average;
  }

  /**
   * Write a method that finds the smallest ellement in an array of double values.
   * 
   * @param array
   * @return the smallest number in the given array.
   */
  public static double min(double[] array) {
      double minVal = Double.MAX_VALUE;

      for (double number : array) {
          minVal = (minVal > number) ? number: minVal;
      }

      return minVal;
  }

}
