package Joji_package;
import java.util.Scanner;
public class function9
{
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		function9 obj=new function9();
		System.out.println("what'S your name?");
		String a=m.next();
		System.out.println("what's your sex?");
		String c=m.next();
		System.out.println("what's your tall");
		int b=m.nextInt();
		
		obj.introduce(a,c,b);
	    
	}
	public void introduce(String x,String y,int z)
	{
		System.out.println("my name is "+x);
		System.out.println("My sex is "+y);
		System.out.println("My tall is "+z);
	}
	
	


}
