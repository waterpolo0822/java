package Joji_package;
import java.util.Scanner;

public class weight {
public static void main (String[] args){
	Scanner w = new Scanner (System.in);
	
	System.out.println("Can you put your tall?");
	float a = w.nextInt();
	
	System.out.println("Can you put your weight?");
	float c = w.nextInt();
	
	float b = (a/100)*(a/100)*22;
	
	System.out.println("Your appropriate weight is "+b);
	
	if (c > b+20){
		System.out.println("You are fat.");
	}
	else if (c < b-20){
		System.out.println("You are thin.");
	}
	else if ((c < b+20)&&(c > b-20)){
		System.out.println("You have appropriate weight.");
	}
	
	
	
	
	
	
}
}
