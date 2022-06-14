package test01;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		float d = (a+b+c)/3;
		System.out.println(d);
	}	

}
