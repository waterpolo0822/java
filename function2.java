package Joji_package;
import java.util.Scanner;
public class function2 {
	static int a,b;
	public static void main(String[] args)
	{
		Scanner m= new Scanner(System.in);
		System.out.println("put your firt number.");
		a = m.nextInt();
		System.out.println("put your second number.");
		b = m.nextInt();
		
		function2 obj= new function2();
		obj.add();
		obj.subjection();
		obj.manipulation();
		obj.division();
		obj.add();
		obj.division();
		obj.add();
		
	}
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void subjection()
	{
		int d=a-b;
		System.out.println(d);
		
	}
	public void manipulation()
	{
		int e=a*b;
		System.out.println(e);
	}
	public void division()
	{
		int f=a/b;
		System.out.println(f);
	}

}
