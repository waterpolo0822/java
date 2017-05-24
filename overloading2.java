package Joji_package;
import java.util.Scanner;
class cars 
{
	public void c()
	{
		System.out.println("your car name is ");
	}
}
class carname extends cars
{
	public void c(String name)
	{
		System.out.println(name);
	}
	public void c(int a)
	{
		System.out.println("suzuki");
	}
	
}



public class overloading2 
{
	public static void main(String[] args)
	{
		carname obj= new carname();
		obj.c();
		obj.c(1);
		obj.c();
		obj.c("toyota");
	}
}
