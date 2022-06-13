package part02;

import java.util.Scanner;

public class Exercise06 {
	
	public static int caculateSum(int num) {
		int sum = 0;
		for(int i=0; i<=num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(num <= 0) {
			System.out.print("Input: ");
			num = scanner.nextInt();
		}
		
		System.out.println(caculateSum(num));
	}
}
