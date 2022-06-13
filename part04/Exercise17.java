package part04;

import java.util.Scanner;

public class Exercise17 {
	
	public static void findIndexOfChar(char ch, String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				System.out.println("The index of " + ch + " in string: " + i);
			} else {
				count++;
			}
		}
		
		if(count == str.length()) {
			System.out.println("Không tồn tại trong chuỗi");
		}
	}
	
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input String: ");
		str = scanner.nextLine();
		
		char character;
		
		System.out.println("Input character: ");
		character = scanner.next().charAt(0);
		
		findIndexOfChar(character, str);
	}
}
