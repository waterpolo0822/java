package Joji_package;
import java.util.Scanner;

public class calculator3 {
	public static void main(String [] args){
		Scanner www = new Scanner (System.in);
		
		System.out.println("How much are your bill?");
		int a = www.nextInt();
		
		System.out.println("How many are you?");
		int b = www.nextInt();
		
		int c = a/b;
		System.out.println("You shoud pay "+ c);
		
	}

}
