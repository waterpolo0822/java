package Joji_package;

public class while9 {
	public static void main(String[] args)
	{
		int a=1;
		while(a<=9)
		{
			if(a<=5)
			{
				int b=4;
				while(b>=a)
				{
					System.out.print(" ");
					b--;
				}
				int c=1;
				while(c<=a)
				{
					System.out.print(c);
					c++;
				}
			}
			else
			{
				int d=5;
				while(d<a)
				{
					System.out.print(" ");
					d++;
				}
				int f=1;
				int e=9;
				while(e>=a)
				{
					System.out.print(f);
					f++;
					e--;
				}
			}
			System.out.println();
			a++;
		}
	}
}
