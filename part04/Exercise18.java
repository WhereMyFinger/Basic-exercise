package part04;

import java.util.Scanner;

public class Exercise18 {
	
	public static boolean check(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) > 48 & str.charAt(i) < 57) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input String: ");
		str = scanner.nextLine();
		
		if(check(str)) {
			System.out.println("Có");
		} else {
			System.out.println("không");
		}
	}
}
