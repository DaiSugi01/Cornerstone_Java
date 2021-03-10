package ca.employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		HourlyEmployee h1 = new HourlyEmployee(null, "H1last", 1111111, "h1@h1.com", LocalDate.of(1980, 4, 12), 10, 20);
		SalaryEmployee s1 = new SalaryEmployee("S1first", null, 2222222, "s1@s1.com", LocalDate.of(1990, 1, 11), 20, 40000);
		SalaryEmployee s2 = new SalaryEmployee("S2first", "S2last", 33333333, "s2@s2.com", LocalDate.of(2000, 2, 22), 10, 50000);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(h1);
		employees.add(s1);
		employees.add(s2);
		
		printEmployeeInfo(employees);
	}
	
	/**
	 * print out employees information
	 * @param employees
	 */
	public static void printEmployeeInfo(ArrayList<Employee> employees) {
		for (Employee e : employees) {
			System.out.println(e + "\n");
		}
	}

}
