package Joji_package;
import java.util.Scanner;

public class function6 {
	public static void main(String[] args)
	{
	Scanner m=new Scanner(System.in);
	function6 obj=new function6();
	
	System.out.println("put your first number");
	int a=m.nextInt();
	System.out.println("put your second number");
	int b=m.nextInt();
	
	int c=obj.add(a,b);
	System.out.println("the addiction is "+c);
	int d=obj.sub(c,6);
	System.out.println("the subjection is "+d);
	int e=obj.man(d,8);
	System.out.println("the manipulation is "+e );
	int f=obj.div(e,2);
	System.out.println("the division is "+f);
	int g=obj.rem(f,5);
	System.out.println("the reminder is "+g);
	

	}
	public int add(int c,int d)
	{
		int e=c+d;
		return e;
	}
	public int sub(int c,int d)
	{
		int f=c-d;
		return f;
	}
	public int man(int c,int d)
	{
		int g=c*d;
		return g;
	}
	public int div(int c,int d)
	{
		int h=c/d;
		return h;
	}
	public int rem(int c,int d)
	{
		int i=c%d;
		return i;
	}
	

}
