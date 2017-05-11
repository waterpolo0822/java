package Joji_package;
import java.util.Scanner;


public class bmi {
	public static void main (String [] args){
		Scanner bmi = new Scanner (System.in);
		
		System.out.println("What's your weight ?");
		double a = bmi.nextDouble();
		
		System.out.println("How tall are you?");
		double b = bmi.nextDouble();
		
		double c = a/(b*b)*10000;
		System.out.print("your BMI is "+ c);
		
		if (c<18.5){
			System.out.println("\nYou are thin.");
		}
		else if ((18.5<=c)&&(c<25)){
			System.out.println("\nYou are normal.");
		}
		else if ((25<=c)&&(c<30)){
			System.out.println("\nYou are obese level1");
		}
		else if ((30<=c)&&(c<35)){
			System.out.println("\nYou are obese level2");
		}
		else if ((35<=35)&&(c<40)){
			System.out.println("\nYou are obese level3");
		}
		else{
			System.out.println("\nYou are obese level4");
		}
	}
	

}
