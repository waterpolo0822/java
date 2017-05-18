package Joji_package;
import java.util.Scanner;
public class function10 
{
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		function10 obj=new function10();
		System.out.println("put the address");
		String a=m.next();
		System.out.println("put the title");
		String b=m.next();
		System.out.println("put the content");
		String c=m.next();
		obj.Email(a, b, c);
	}
	public void Email(String x,String y,String z)
	{
		System.out.println("the title is "+x);
		System.out.println("the address is "+y);
		System.out.println("the content");
		System.out.println(z);
	}

}
