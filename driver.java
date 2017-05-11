package Joji_package;
import java.util.Scanner;


public class driver {
	public static void main (String [] args){
		Scanner o = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int a = o.nextInt();
		if(a > 17){
			System.out.println("You can drive.");
		}
		else {
			System.out.println("You can't drive.");
		}
		
	}

}
