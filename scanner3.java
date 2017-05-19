package Joji_package;
import java.util.Scanner;


public class scanner3 {
	public static void main(String[] args)
	{Scanner www = new Scanner (System.in);
	
	System.out.println("put your name");
	String a = www.next();
	
	System.out.println("put your phone number");
	String b = www.next();
	
	System.out.println("put your e-mail address");
	String c = www.next();
	
	System.out.println("put your job");
	String d = www.next();
	
	System.out.println("put your salary");
	int e = www.nextInt();
	
	System.out.println("put your favoriet song");
	String f = www.next();
	
	System.out.println("put your favoriet animal");
	String g = www.next();
	
	System.out.println("your name is" + " " + a + "your phone numaber is" + " " + b + 
			           "\n" + "your e-mail address is"
	                   + c + "your job is" + " "+ d + "your salary is" + " " + e + 
	                   "your favorite song is" + " " + f + "your favorite animal is" + " " + g);

}
}
