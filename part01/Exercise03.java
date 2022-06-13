package part01;

import java.util.Scanner;

public class Exercise03 {
	
	public static void checkTriangle(float edge1, float edge2, float edge3) {
		if((edge1 < edge2 + edge3) & (edge2 < edge1 + edge3) & (edge3 < edge1+ edge2)) {
			System.out.println("These are 3 edges of a triangle.");
		} else {
			System.out.println("these are not 3 edges of a triangle.");
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
		
		checkTriangle(edge1, edge2, edge3);
	}
}
