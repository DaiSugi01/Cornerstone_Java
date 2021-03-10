
/**
 * Write a program that displays the following table
 * (Note that 1 mile is 1.609 kilometers)
 */
public class ConvertMilesToKilometers {

  public static void main(String[] args) {

    System.out.println("Miles  Kilometers");
    final double KILOMETERS_PER_MILES = 1.609d;

    int miles = 10;
    for (int i = 1; i <= miles; i++) {
        double kilometers = i * KILOMETERS_PER_MILES;
        if (i < 10) {
          System.out.println(i + "      " + kilometers);
        } else {
          System.out.println(i + "     " + kilometers);
        }
    }
  }

}