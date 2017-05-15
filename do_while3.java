package Joji_package;

public class do_while3 {
	public static void main(String[] args)
	{
		int a=1;
		do
		{
			if(a<=5)
			{
				int b=1;
				do
				{
					System.out.print(" ");
					b++;
				}
				while(b<=4);
				
				int c=1;
				do
				{
					System.out.print(c);
					c++;
				}
				while(c<=a);
			}
			else
			{
				int d=6;
				while(d<a)
				{
					System.out.print(" ");
					d++;
				}
				int e=10;
				int f=11-a;
				do
				{
					System.out.print(f);
					f--;
					e--;
				}
				while(e>=a);
			}
			System.out.println();
			a++;
		}
		while(a<=10);
	}

}
