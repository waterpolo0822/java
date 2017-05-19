package Joji_package;
public class class1 
{
	public static void main(String[] args)
	{
		misao obj=new misao();
		obj.add();
		obj.subjection();
		obj.mani();
		obj.div();
		obj.reminder();
	}
}
    class misao
    {
	public void add()
	{
		int a=8;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
	public void subjection()
	{
		int a=8;
		int b=6;
		int c=a-b;
		System.out.println(c);
	}
	public void mani()
	{
		int a=8;
		int b=6;
		int c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		int a=8;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}
	public void reminder()
	{
		int a=8;
		int b=6;
		int c=a%b;
		System.out.println(c);
	}
	
}