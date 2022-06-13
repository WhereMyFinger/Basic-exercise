package part01;

import java.util.Scanner;

public class Exercise04 {
	
	public static void checkRightTriangle(float edge1, float edge2, float edge3) {
		if((edge1 < edge2 + edge3) & (edge2 < edge1 + edge3) & (edge3 < edge1+ edge2)) {
			if((edge1*edge1 == edge2*edge2 + edge3*edge3) &
				(edge2*edge2 == edge1*edge1 + edge3*edge3) &
				(edge3*edge3 == edge2*edge2 + edge1*edge1)) {
				System.out.println("this is a right triangle.");
			} else {
				System.out.println("this is a regular triangle.");
			}
		} else {
			System.out.println("This is not a triangle.");
		}
	}
	
	public static void main(String[] args) {
		float edge1 = 0;
		float edge2 = 0;
		float edge3 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
			System.out.print("Input: ");
			edge1 = scanner.nextFloat();
			edge2 = scanner.nextFloat();
			edge3 = scanner.nextFloat();
		}
		
		checkRightTriangle(edge1, edge2, edge3);
	}
}
