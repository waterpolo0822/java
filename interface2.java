package Joji_package;
import java.util.Scanner;
interface compare
{
	void big();
	void differnce();
}
interface odd
{
	void even();
	void odd();
}
class numbers implements compare,odd
{
	Scanner x=new Scanner(System.in);
	int num1;
	int num2;
	public void input()
	{
		System.out.println("put number");
		num1=x.nextInt();
		System.out.println("put number");
		num2=x.nextInt();
	}
	public void big()
	{
		if(num1>num2)
		{
			System.out.println(num1+" is begger.");
		}
		else
		{
			System.out.println(num2+" is smaller");
		}
	}
	public void difference()
	{
		System.out.println(num1-num2);
	}
	public void even()
	{
		int c=num1%2;
		int d=num2%2;
		if(c==0)
		{
			System.out.println(num1+" is even");
		}
		else
		{
			System.out.println(num1+" is odd");
		}
		if(d==0)
		{
			System.out.println(num2+" is even");
		}
		else
		{
			System.out.println(num2+" is odd");
		}
	}
}

public class interface2 {
	public static void main(String[] args)
	{
		numbers obj=new numbers();
		obj.input();
		obj.big();
		obj.difference();
		obj.even();
		
	}

}
