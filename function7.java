package Joji_package;
import java.util.Scanner;
public class function7 {
	public static void main(String[] args)
	{
		Scanner m =new Scanner(System.in);
		function7 obj=new function7();
		
		System.out.println("put your name");
		String a=m.next();
		String b=obj.hello(a);
		System.out.println("Hello "+b);
	}
	public String hello(String x)
	{
	   String a=x;
	   return a;
	}

}
