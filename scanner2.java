package Joji_package;
import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Put your first number");
		int a = obj.nextInt();
		
		System.out.println("Put your second number");
		int b = obj.nextInt();
		
		int c = a+b;
		System.out.println("The addiction are" + c);
		
		int d = a-b;
		System.out.println("The substraction are" + d);
		
		int e = a*b;
		System.out.println("The manipulation are" + e);
		
		int f = a/b;
		System.out.println("The divition are" + f);
		
		int g = a%b;
		System.out.println("The reminder are" + g);
		
		

	}

}
