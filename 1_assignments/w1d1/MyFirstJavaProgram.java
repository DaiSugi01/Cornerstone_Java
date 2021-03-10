// This program should declare a variable with some number as its value. 
// It should then print it to the console. then you will reassign the variable to a new value,
//  and print it out again.

public class MyFirstJavaProgram {
  
  public static void main(String args[]) {
    byte byteNum = 100;
    short shortNum = 20000;
    int intNum = 300000000;
    long longNum = 4000000000000L;

    System.out.println(byteNum);
    System.out.println(shortNum);
    System.out.println(intNum);
    System.out.println(longNum);

    byteNum = Byte.MIN_VALUE;
    shortNum = Short.MIN_VALUE;
    intNum =Integer.MIN_VALUE;
    longNum = Long.MIN_VALUE;

    System.out.println(byteNum);
    System.out.println(shortNum);
    System.out.println(intNum);
    System.out.println(longNum);
  } 
}
