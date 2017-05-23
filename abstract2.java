package Joji_package;
import java.util.Scanner;
abstract class calculators
{
	abstract void add(int a,int b);
	abstract void sub(int a,int b);
	abstract void mani(int a,int b);
	abstract void div(int a,int b);
	abstract void rem(int a,int b);
}
class z extends calculator
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void mani(int a,int b)
	{
		System.out.println(a*b);
	}
	void div(int a,int b)
	{
		System.out.println(a/b);
	}
	void rem(int a,int b)
	{
		System.out.println(a%b);
	}
}

public class abstract2 
{
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		z obj =new z();
		System.out.println("put number");
		int x=m.nextInt();
		System.out.println("put number");
		int y=m.nextInt();
		obj.add(x, y);
		obj.sub(x, y);
		obj.mani(x, y);
		obj.div(x, y);
		obj.rem(x, y);
		
		
	}
}
