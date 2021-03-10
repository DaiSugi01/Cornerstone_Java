package ca.employee;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
	
	protected final String UNKNOWN = "Unknown";
	
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;
	private LocalDate startDate;

	public Employee(String firstName, String lastName, int phoneNumber, String email, LocalDate startDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setStartDate(startDate);
	}

	public abstract double calculateIncome();

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/** 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (Objects.isNull(firstName) || firstName.isEmpty()) {
			System.err.println("First name shouled no be null. For default value, it is sat " + UNKNOWN);
			this.firstName = UNKNOWN;			
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (Objects.isNull(lastName) || lastName.isEmpty()) {
			System.err.println("Last name shouled no be null. For default value, it is sat " + UNKNOWN);
			this.lastName = UNKNOWN;			
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * @return phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(int phoneNumber) {
		if (phoneNumber > 0) {
			this.phoneNumber = phoneNumber;			
		} else {
			System.err.println("Phone number shouled be more than 0. For default value, it is sat 0");
			this.phoneNumber = 0;
		}
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		if (Objects.isNull(email) || email.isEmpty()) {
			System.err.println("Email shouled no be null. For default value, it is sat " + UNKNOWN);
			this.email = UNKNOWN;
		} else {
			this.email = email;
		}
	}

	/**
	 * @return date of birth
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
		} else {
			System.err.println("Start date shouled no be null.");
			this.startDate = LocalDate.now();
		}
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + getFullName() + 
				"\n\tPhone number: " + phoneNumber + 
				"\n\tEmail: " + email +
				"\n\tStart Date: " + startDate;
	}
	
}
