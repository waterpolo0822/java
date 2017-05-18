package Joji_package;
import java.util.Scanner;
public class function5
{
	public static void main(String[] args)
	{
		Scanner m =new Scanner(System.in);
		function5 obj=new function5();
		
		int g=obj.add(90,23);
		System.out.println(g);
		
		int h=obj.subjection(23,5);
		System.out.println(h);
		
		int i=obj.manipulation(19,4);
		System.out.println(i);
		
		int j=obj.division(80,20);
		System.out.println(j);
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int subjection(int a,int b)
	{
		int d=a-b;
		return d;
	}
	public int manipulation(int a,int b)
	{
		int e=a*b;
		return e;
	}
	public int division(int a,int b)
	{
		int f=a/b;
		return f;
	}

}
