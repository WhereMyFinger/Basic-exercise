package part03;

import java.util.Scanner;

public class Exercise11 {
	
	public static void caculateAverage(int size, int[] arr) {
		float sum = 0;
		float averge;
		for(int i=0; i<size; i++) {
			sum += arr[i];
			//average /= (i+1);
		}
		averge = sum/size;
		System.out.println("Result: " + averge);
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n: ");
		num = scanner.nextInt();
			
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		caculateAverage(num, arr);
	}
}
