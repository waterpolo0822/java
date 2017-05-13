package Joji_package;

public class while6 {
	public static void main(String args[])
	{
		int a=1;
		while(a<=5)
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
			int d=a-1;
			while(d>=1)
			{
				System.out.print(d);
				d--;
			}
			System.out.println();
			a++;
		}
	}

}
