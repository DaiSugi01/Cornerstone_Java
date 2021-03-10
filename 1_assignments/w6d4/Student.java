import java.util.Objects;

public class Student {

	private final String UNKNOWN = "UNKNOWN";
	
	private int id;
	private String email;
	private String fullName;
	
	public Student(int id, String email, String fullName) {
		setId(id);
		setEmail(email);
		setFullName(fullName);		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		if (id <= 0) {
			System.err.println("ID should be more than 0.");
			this.id = 1;
		} else {
			this.id = id;
		}
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (Objects.isNull(email) || email.trim().isEmpty()) {
			System.err.println("Email should not be null. it's set " + 
					UNKNOWN + " for defualt.");
			this.email = UNKNOWN;
		} else {			
			this.email = email;
		}
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		if (Objects.isNull(fullName) || fullName.trim().isEmpty()) {
			System.err.println("Full name should not be null. it's set " 
					+ UNKNOWN + " for defualt.");
			this.fullName = UNKNOWN;
		} else {			
			this.fullName = fullName;
		}
		
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ", Email: " + email + ", Full Name: " + fullName;
	}
}
