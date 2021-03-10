import java.util.Objects;

public class Course {

	private String courseName;
	private int duration;
	private Instructor instructor;
	
	public Course(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName);
		setDuration(duration);
		setInstructor(instructor);
	}

	/**
	 * @return course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @return duration of course
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @return instructor
	 */
	public Instructor getInstructor() {
		return instructor;
	}
	
	/**
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = (Objects.isNull(courseName) || courseName.isEmpty()) ? "Unknown" : courseName;
	}

	/**
	 * @param duration
	 */
	public void setDuration(int duration) {
		if (duration >= 4) {
			this.duration = duration;			
		} else {
			System.err.println("The duration should be set more than 4.");
			this.duration = 4;
		}
	}

	/**
	 * @param instructor
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
