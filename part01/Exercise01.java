package part01;

import java.util.Scanner;

public class Exercise01 {
	
	public static void main(String[] args) {
		int number;
		Scanner scnner = new Scanner(System.in);
		
		System .out.print("Input integer number: ");
		number = scnner.nextInt();
		if(number >= 0) {
			System.out.println("Day la so nguyen duong");
		} else {
			System.out.println("Dy la so nguye am");
		}
	}
}
