import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		// Create three Instructor Object 
		Instructor instructor1 = new Instructor(null, "", 012345, 0);
		Instructor instructor2 = new Instructor("Daiki2", "Sugihara2", 987654, 2);
		Instructor instructor3 = new Instructor("Daiki3", "Sugihara3", 123456, 5);

		// Create four Course Object 
		Course course1 = new Course("Course1", 4, instructor1);
		Course course2 = new Course("Course2", 5, instructor2);
		Course course3 = new Course("Course3", 6, instructor2);
		Course course4 = new Course("Course4", 7, instructor3);
		
		// Create ArrayList of Course called courses
		ArrayList<Course> courses = new ArrayList<>();
		
		// Add these four course object to the courses arrayList
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);

		printCourses(courses);
		
		ArrayList<Course> foundCourses = findCoursesByInstructor(courses);
		printCourses(foundCourses);
	}
	
	/**
	 * @param courses
	 * @return filtered courses array
	 */
	public static ArrayList<Course> findCoursesByInstructor(ArrayList<Course> courses) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Who's course would you find ?: ");
		String instructorName = input.nextLine();
		
		ArrayList<Course> foundCourses = new ArrayList<>();
		for (Course course : courses) {
			if (instructorName.equalsIgnoreCase(course.getInstructor().getInstructorFullName())) {
				foundCourses.add(course);
			}
		}
		
		input.close();
		
		return foundCourses;
	}
		
	/**
	 * print out all courses
	 * @param courses
	 */
	public static void printCourses(ArrayList<Course> courses) {
		if (courses.size() <= 0) {
			System.err.println("There is no courses in the array");
			return;
		}
		
		for (Course course : courses) {
			System.out.println("Course name: " + course.getCourseName() + 
					"\n\tDuration: " + course.getDuration() + " weeks. " +
					"\n\tInstructor: " + course.getInstructor().getInstructorFullName() +
					"\n\tlevel of instructor: " + course.getInstructor().getStatus() + " with " + 
					course.getInstructor().getExperienceYear() + " year of experience." +
					"\n\tPhone number: " + course.getInstructor().getPhoneNumber() + "\n");
		}
	}

}
