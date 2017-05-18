package Joji_package;
import java.util.Scanner;

public class function11 {
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		function11 obj=new function11();
		System.out.println("’ê•Ó‚Ì’·‚³‚ğ‹L“ü‚µ‚Ä‚­‚¾‚³‚¢");
		float a=m.nextFloat();
		System.out.println("‚‚³‚ğ‹L“ü‚µ‚Ä‚­‚¾‚³‚¢");
		float b=m.nextFloat();
		
		float c=obj.triangle(a,b);
		System.out.println("–ÊÏ‚Í"+c+"‚Å‚·");
		
		System.out.println("”¼Œa‚Ì’·‚³‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		double d=m.nextDouble();
		double e=obj.circle(d);
		System.out.println("‰~‚Ì–ÊÏ‚Í"+e+"‚Å‚·");
		
		
	}
	public float triangle(float x,float y)
	{
		return(x*y/2);
	}
	public double circle(double x)
	{
		return(x*x*3.1);
	}

}
