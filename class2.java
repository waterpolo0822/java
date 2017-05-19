package Joji_package;
import java.util.Scanner;
public class class2 
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		triangle obj=new triangle();
		String d="lt";
		String e="rt";
		String f="diya";
		String g="uppe";
		System.out.println("1 lt\n2 rt\n3 diya\n4 upper");
		System.out.println("choose the type.");
		int a=x.nextInt();
		System.out.println("put the number of raw");
		int b=x.nextInt();
		System.out.println("put the number of repeating");
		int c=x.nextInt();
		
		if(a==1)
		{
			obj.lt(c,b);
		}
		if(a==2)
		{
			obj.rt(c,b);
		}
		if(a==4)
		{
			obj.upper(c,b);
		}
		if(a==3)
		{
			obj.diya(c,b);
		}
		
	}
}
class triangle
{
	public void lt(int a,int b)
	{
		for(int c=1;c<=a;c++)
		{
		  for(int d=1;d<=b;d++)
		  {
			for(int e=1;e<=d;e++)
			{
				System.out.print(e);
			}
			System.out.println();
		  }
		}
	}
	
	public void rt(int a,int b)
	{
		for(int c=1;c<=a;c++)
		{
			for(int d=1;d<=b;d++)
			{
				for(int e=b-1;e>=d;e--)
				{
					System.out.print(" ");
				}
				for(int f=1;f<=d;f++)
				{
					System.out.print(f);
				}
				System.out.println();
			}
		}
	}
	public void upper(int a,int b)
	{
		for(int c=1;c<=a;c++)
		{
			for(int d=b;d>=1;d--)
			{
				for(int e=b;e>d;e--)
				{
					System.out.print(" ");
				}
				for(int f=1;f<=d;f++)
				{
					System.out.print(f);
				}
				for(int g=d-1;g>=1;g--)
				{
					System.out.print(g);
				}
				System.out.println();
			}
		}
	}
	public void diya(int a,int b)
	{
		int h=b/2+1;
		int i=b/2;
		for(int c=1;c<=a;c++)
		{
			for(int d=1;d<=h;d++)
			{
				for(int e=h-1;e>=d;e--)
				{
					System.out.print(" ");
				}
				for(int f=1;f<=d;f++)
				{
					System.out.print(f);
				}
				for(int g=d-1;g>=1;g--)
				{
					System.out.print(g);
				}
				System.out.println();
			}
			for(int j=i;j>=1;j--)
			{
				for(int k=i;k>=j;k--)
				{
					System.out.print(" ");
				}
				for(int l=1;l<=j;l++)
				{
					System.out.print(l);
				}
				for(int m=j-1;m>=1;m--)
				{
					System.out.print(m);
				}
				System.out.println();
			}
		}
	}
}
