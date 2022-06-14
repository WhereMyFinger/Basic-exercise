package part04;

import java.util.Scanner;

public class Exercise19 {
	
	public static int count(char ch, String str) {
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		char ch = 97;
		String str;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input String: ");
		str = scanner.nextLine();
		
		System.out.println("number of character a in string: " + count(ch, str));
	}
}
