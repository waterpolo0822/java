package Joji_package;

public class do_while2 {
	public static void main(String[] args)
	{
		int a=1;
		do
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
			do
			{
				System.out.print(c);
				c++;
			}
			while(c<=a);
			}
			else
			{
				int c=4;
				do
				{
					System.out.print(" ");
					c--;
				}
				while(c>=1);
				
				int d=1;
				int e=10;
				do
				{
					System.out.print(d);
					d++;
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
