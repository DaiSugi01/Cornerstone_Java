package ca.employee;

import java.time.LocalDate;

public class SalaryEmployee extends Employee {

	private double commissionRate;
	private double totalSales;
	
	public SalaryEmployee(String firstName, String lastName, int phoneNumber, String email, LocalDate startDate,
			double commitionRate, double totalSales) {
		super(firstName, lastName, phoneNumber, email, startDate);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
	}

	/**
	 * @return commission rate
	 */
	public double getCommitionRate() {
		return commissionRate;
	}

	/**
	 * @param commitionRate
	 */
	public void setCommitionRate(double commitionRate) {
		if (commitionRate > 0) {
			this.commissionRate = commitionRate;
		} else {
			System.err.println("Commition Rate shouled be more than 0. For default value, it is sat $" + 1);
			this.commissionRate = 1;
		}
	}

	public double getTotalSales() {
		return totalSales;
	}



	public void setTotalSales(double totalSales) {
		if (totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			System.err.println("Total sales shouled be more than 0. For default value, it is sat $" + 1);
			this.totalSales = 1;
		}
	}

	@Override
	public double calculateIncome() {
		return totalSales * (1- commissionRate/100);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\n\tTotal Sales: $" + totalSales +
				"\n\tCommission Rate: " + commissionRate +
				"\n\tIncome: $" + calculateIncome());
		return  sb.toString();
	}
}
