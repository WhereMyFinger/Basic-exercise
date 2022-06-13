package part04;

import java.util.Scanner;

public class Exercise20 {
	
	public final static String STRING_PATTERN = "^[A-Z]{1}\\S{0,18}[0-9]{1}";
	
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input string: ");
		str = scanner.nextLine();
		
		int check = 0;
		
		
		if(str.matches(STRING_PATTERN)) {
			System.out.println("Duyệt!");
		} else {
			System.out.println("Không duyệt");
		}
	}
}
