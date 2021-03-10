/**
 * Write a program that reads the following information and
 * prints a payroll statement:
 *    Employee's name(e.g., Smith)
 *    Number of hours worked in a week (e.g, 10)
 *    Hourly pay rate (e.g., 20%)
 *    State tax withholding rate(e.g., 9%)
 */

import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter employee's name: ");
    String name = sc.nextLine();
    name = Character.toUpperCase(name.charAt(0)) + name.substring(1);

    System.out.print("Enter number of hours worked in a week: ");
    double numOfHours = sc.nextDouble();

    System.out.print("Enter hourly pay rate: ");
    double hourlyPayRate = sc.nextDouble();

    System.out.print("Enter federal tax withholding rate: ");
    double federalTax = sc.nextDouble();

    System.out.print("Enter state tax withholding rate: ");
    double stateTax = sc.nextDouble();

    System.out.print('\n');

    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + numOfHours);
    System.out.println("Pay rate: $" + hourlyPayRate);

    double grossPay = numOfHours * hourlyPayRate;
    System.out.println("Gross Pay: $" + grossPay);
    System.out.println("Deductions:");

    double federalTaxWithholding = Math.floor(grossPay * federalTax * 100) / 100.0d;
    System.out.println("\tFederal Withholding (" + (federalTax * 100) + "%): $" + federalTaxWithholding);

    double stateTaxWithholding = Math.floor(grossPay * stateTax * 100) / 100.0d;
    System.out.println("\tState Withholding (" + (stateTax * 100) + "%): $" + stateTaxWithholding);

    double totalDeduction = federalTaxWithholding + stateTaxWithholding;
    System.out.println("\tTotal Deduction: $" + totalDeduction);

    System.out.println("Net Pay: $" + (grossPay - totalDeduction));

    sc.close();
  }

}
