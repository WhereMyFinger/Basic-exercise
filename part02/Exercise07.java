package part02;

import java.util.Scanner;

public class Exercise07 {
	
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input: ");
		number = scanner.nextInt();
		for(int i=1; i<=20; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
	}
}
