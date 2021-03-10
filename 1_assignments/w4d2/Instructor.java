import java.util.Objects;

public class Instructor {

	private String firstName;
	private String lastName;
	private int phoneNumber;
	private int experienceYear;
	
	public Instructor(String firstName, String lastName, int phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperienceYear(experienceYear);
	}

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return phone number
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return experience year
	 */
	public int getExperienceYear() {
		return experienceYear;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = (Objects.isNull(firstName) || firstName.isEmpty()) ? "Unknown" : firstName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = (Objects.isNull(lastName) || lastName.isEmpty()) ? "Unknown" : lastName;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param experienceYear
	 */
	public void setExperienceYear(int experienceYear) {
		if (experienceYear < 1) {
			System.err.println("The experience year should be set more than 1.");
			this.experienceYear = 1;
		} else {
			this.experienceYear = experienceYear;			
		}
	}

	/**
	 * @return level of instructor
	 */
	public String getStatus() {
		switch (this.experienceYear) {
		case 1:
			return "Junior Instructor";
		case 2:
		case 3:
		case 4:
			return "Intermediate Instructor";
		default:
			return "Senior Instructor";
		}
	}

	/**
	 * @return first name + last name
	 */
	public String getInstructorFullName() {
		return this.firstName + " " + this.lastName;
	}
}
