package Joji_package;

public class while8 {
	public static void main(String[] args)
	{
		int d=1;
		while(d<=9)
		{
			if(d<=5)
			{
				int a=1;
				while(a<=d)
				{
					System.out.print(a);
					a++;
				}
			}
			else
			{
				int c=1;
				int b=10;
				while(b>d)
				{
					System.out.print(c);
					c++;
					b--;
				}
			}
			System.out.println();
			d++;
		}
	}

}
