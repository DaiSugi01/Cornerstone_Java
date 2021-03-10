import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Student> students= new LinkedList<>();
				
		Scanner input = new Scanner(System.in);
		outer: while (true) {
			
			System.out.println("\nMenu to:" + 
					"\n  1 - add student" + 
					"\n  2 - display student" +
					"\n  3 - remove student" +
					"\n  4 - quit");
			
			int userAction = input.nextInt();
			switch (userAction) {
			case 1:
				addStudent(students);				
				break;
			case 2:
				displayStudents(students);
				break;
			case 3:
				removeStudentById(students);
				break;
			case 4:
				break outer;
			default:
				System.out.println("InValid input! Please input again.");
			}
		}
		System.out.println("See you!");
		input.close();
	}
	
	/**
	 * add student to the list
	 * @param students
	 */
	public static void addStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the student full name: ");
		String name = input.nextLine();
		
		System.out.print("Please Enter the student email: ");
		String email = input.nextLine();
		
		System.out.print("Please Enter the student id: ");
		int id = input.nextInt();
		
		Student student = new Student(id, email, name);
		students.add(student);
		System.out.println("Added: " + student);
		
	}
	
	/**
	 * print out all of the students in the list
	 * @param students
	 */
	public static void displayStudents(LinkedList<Student> students) {
		
		if (students.isEmpty()) {
			System.out.println("There is no sutudent in the list.");
			return;
		}
		
		Iterator<Student> iterator = students.iterator();
		
		System.out.println("********* Students information *********");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****************************************");
		iterator = null;
	}
	
	/**
	 * remove students by id
	 * @param students
	 */
	public static void removeStudentById(LinkedList<Student> students) {
		
		if (students.isEmpty()) {
			System.out.println("There is no sutudent in the list.");
			return;
		}
		
		displayStudents(students);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the student id you want to remove: ");
		int id = input.nextInt();
		
		Iterator<Student> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			Student s = iterator.next();
			if (s.getId() == id) {
				System.out.println("Removed: " + s);
				iterator.remove(); 
			}
		}
		
		iterator = null;
	}
	
}
