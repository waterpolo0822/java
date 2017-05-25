package Joji_package;
interface calculation
{
	 void add();
	 void sub();
}
interface calcu
{
	 void mani();
	 void div();
	 void rem();
}
class math1 implements calculation , calcu
{
	int a=20;
	int b=5;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	public void mani()
	{
		int c=a*b;
		System.out.println(c);
	}
	public void  div()
	{
		int c=a/b;
		System.out.println(c);
	}
	public void rem()
	{
		int c=a%b;
		System.out.println(c);
	}
}

public class interface1 {
	public static void main(String[] args)
	{
		math1 obj=new math1();
		obj.add();
		obj.sub();
		obj.mani();
		obj.div();
		obj.rem();
	}

}
