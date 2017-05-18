package Joji_package;

public class function4 {
	static int a,b;
	public static void main(String[] args)
	{
		a=8;
		b=2;
		function4 obj =new function4();
		int g=obj.add();
		int h=obj.subjection();
		int i=obj.manipulation();
		int j=obj.division();
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		
	}
	public int add()
	{
		int c=a+b;
		return c;
	}
	public int subjection()
	{
		int d=a-b;
		return d;
	}
	public int manipulation()
	{
		int e=a*b;
		return e;
	}
	public int division()
	{
		int f=a/b;
		return f;
	}

}
