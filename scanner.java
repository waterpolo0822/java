package Joji_package;

import java.util.Scanner;

public class scanner {

	private static Object ink;

	public static void main(String[] args) {
		
		Scanner aaa = new Scanner (System.in);
		System.out.println("Enter 1st number");
		int a = aaa.nextInt();
		System.out.println("Enter 2nd number");
		int b = aaa.nextInt();
		
		int c = a+b;
		
		System.out.println("the addition are = "+c);
		
	}

}
