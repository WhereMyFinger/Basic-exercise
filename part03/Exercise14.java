package part03;

import java.util.Scanner;

public class Exercise14 {
	
	public static int[] sortArr(int size, int[] arr) {
		int temp;
		for(int i=0; i<size/2; i++) {
			temp = arr[i];
			arr[i] = arr[size-1-i];
			arr[size-1-i] = temp;
	}
		return arr;
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
		
		sortArr(num, arr);
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
