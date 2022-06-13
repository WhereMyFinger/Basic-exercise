package part02;

import java.util.Scanner;

public class Exercise10 {
	
	public final static String STUDENT_ID_PATTERN = "^[B]170\\d{4}";
	
	public static void main(String[] args) {
		String studentId = null;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.println("Input student Id " + i);
			studentId = scanner.nextLine();
			
			if(studentId.matches(STUDENT_ID_PATTERN)) {
				System.out.println("Valid student ID.");
			} else {
				System.out.println("Invalid student ID");
			}
		}
	}
}
