package Joji_package;

public class while5 {
	public static void main(String[] args)
	{
		int a=1;
		while(a<=5)
		{
			int b=1;
			while(b<a)
			{
				System.out.print(" ");
				b++;
			}
			int c=5;
			while(c>=a)
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
			a++;
		}
	}

}
