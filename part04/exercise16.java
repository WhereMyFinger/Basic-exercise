package part04;

import java.util.Scanner;

public class exercise16 {
	
	public static boolean checkChar(char ch, String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
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
		
		char character;
		
		System.out.println("Input character: ");
		character = scanner.next().charAt(0);
		
		if(checkChar(character, str)) {
			System.out.println("Có");
		} else {
			System.out.println("Không");
		}
	}

}
