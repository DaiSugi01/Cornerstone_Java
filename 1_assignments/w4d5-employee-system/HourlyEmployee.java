package ca.employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

	private final int MAX_PAY_RATE = 40;
	
	private double payRate;
	private int hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, int phoneNumber, String email, LocalDate startDate,
			double payRate, int hoursWorking) {
		super(firstName, lastName, phoneNumber, email, startDate);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}

	/**
	 * @return pay rate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate
	 */
	public void setPayRate(double payRate) {
		if (payRate > 0) {
			this.payRate = payRate;
		} else {
			System.err.println("Pay Rate shouled be more than 0. For default value, it is sat $" + 1);
			this.payRate = 1;
		}
	}

	/**
	 * @return hours working
	 */
	public int getHoursWorking() {
		return hoursWorking;
	}

	/**
	 * @param hoursWorking
	 */
	public void setHoursWorking(int hoursWorking) {
		if (hoursWorking < 0) {
			this.hoursWorking = hoursWorking;
			System.err.println("Hours working shouled be more than 0. For default value, it is sat $" + 1);
		} else if (hoursWorking > MAX_PAY_RATE) {
			System.err.println("Hours working shouled be less than or equals to 40. For default value, it is sat $" + MAX_PAY_RATE);
			this.hoursWorking = MAX_PAY_RATE;
		} else {
			this.hoursWorking = hoursWorking;
		}
	}

	@Override
	public double calculateIncome() {
		return payRate * hoursWorking;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n\tPay Rate: $" + payRate + 
				"\n\tWorking Hours : " + hoursWorking + " hours" +
				"\n\tTotalIncome: $" + calculateIncome());
		return  sb.toString();
	}
}
