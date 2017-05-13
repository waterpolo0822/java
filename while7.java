package Joji_package;

public class while7 {
	public static void main(String[] args)
	{
		int a=5;
		while(a>=1)
		{
			int b=5;
			while(b>a)
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
			
			int d=a-1;
			while(d>=1)
			{
				System.out.print(d);
				d--;
			}
			System.out.println();
			a--;
		}
	}

}
