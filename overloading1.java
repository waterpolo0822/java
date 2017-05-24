package Joji_package;
class math
{
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	//difference in the number of signature
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	//difference in data type
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	//difference in sequence
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
}

public class overloading1 {
	public static void main(String[] args)
	{
		math obj=new math();
		obj.add(5,6.4);
		obj.add(7, 9, 10);
		obj.add(2.9, 1.2);
		obj.add(1.5, 4);
	}

}
