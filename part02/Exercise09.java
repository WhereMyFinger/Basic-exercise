package part02;

import java.util.Scanner;

public class Exercise09 {
	
	public static int caculateFi(int number) {
		if(number == 0 || number == 1) {
			return 1;
		} else  {
			return caculateFi(number - 2) + caculateFi(number - 1);
		}
	}
	
	public static void main(String[] args) {
		int number = -1;
		Scanner scanner = new Scanner(System.in);
		
		while(number > 20 || number < 0) {
			System.out.println("Input: ");
			number = scanner.nextInt();
		}
		
		System.out.println(caculateFi(number));
	}
}