package part03;

import java.util.Scanner;

public class Exercise13 {
	
	public static int findMin(int size, int[] arr) {
		int min = 100000;
		for(int i=0; i<size; i++) {
			min = arr[i] < min ? arr[i] : min;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n: ");
		num = scanner.nextInt();
			
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Input element number " + (i+1));
			arr[i] = scanner.nextInt();
		}
		System.out.println(findMin(num, arr));
	}
}
