package part03;

import java.util.Scanner;

public class Exercise15 {
	
	public final static String CODE_PATTERN = "^[0]{2}[2-5]{1}L\\d{4}";
	
	public static void main(String[] args) {
		String[] code = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Input code number " + (i+1));
			code[i] = scanner.nextLine();
		}
		
		int check = 0;
		
		for(int i=0; i<5; i++) {
			if(code[i].matches(CODE_PATTERN)) {
				check++;
			}
		}
		
		if(check == 5) {
			System.out.println("Đúng rồi");
		} else {
			System.out.println("Sai rồi");
		}
		
	}

}
