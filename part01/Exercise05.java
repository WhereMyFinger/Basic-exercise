package part01;

import java.util.Scanner;

public class Exercise05 {
	
	public final static String STUDENT_ID_PATTERN = "^[B]\\d{7}";
	
	public static void main(String[] args) {
		String studentId = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input student ID: ");
		studentId = scanner.nextLine();
		if(studentId.matches(STUDENT_ID_PATTERN)) {
			System.out.println("Valid student ID.");
		} else {
			System.out.println("Invalid student ID");
		}
	}
}
