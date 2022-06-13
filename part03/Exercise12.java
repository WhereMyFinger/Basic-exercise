package part03;

import java.util.Scanner;

public class Exercise12 {
	
	public static int findMax(int size, int[] arr) {
		int max = 0;
		for(int i=0; i<size; i++) {
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n: ");
		num = scanner.nextInt();
			
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			while(arr[i]<=0) {
				System.out.println("Input element number " + (i+1));
				arr[i] = scanner.nextInt();
			}
		}
		
		System.out.println(findMax(num, arr));
	}

}
