package Joji_package;
import java.util.Scanner;
public class function3 {
	static int a,b;
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		System.out.println("put your first number");
		a=m.nextInt();
		System.out.println("put your second number");
		b=m.nextInt();
		function3 obj=new function3();
		obj.add(a,b);
		obj.subjection(a,b);
		obj.manipulation(a,b);
		obj.division(a,b);
		
		obj.add(22,44);
		
	}
	public void add(int g,int h)
	{
		int c=g+h;
		System.out.println("the addiction are"+c);
	}
	public void subjection(int g,int h)
	{
		int d=g-h;
		System.out.println("the subjection are"+d);
	}
	public void manipulation(int g, int h)
	{
		int e=g*h;
		System.out.println("the manipulation are"+e);
	}
	public void division(int g,int h)
	{
		int f=g/h;
		System.out.println("the division are"+f);
	}

}
