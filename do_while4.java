package Joji_package;

public class do_while4 {
	public static void main(String[] args)
	{
		for(int a=1;a<=5;a++)
		{
				for(int b=5;b>=a;b--)
				{
					System.out.print("x");
				}
				for(int c=1;c<a;c++)
				{
					System.out.print("-");
				}
				for(int e=3;e<=a;e++)
				{
					System.out.print("-");
				}
				if(a==1)
				{
					for(int f=1;f<=4;f++)
					{
						System.out.print("x");
					}
				}
				else
				{
					for(int g=5;g>=a;g--)
					{
						System.out.print("x");
					}
				}
				
			System.out.println();
		}
		for(int h=4;h>=1;h--)
		{
			for(int g=6;g>h;g--)
			{
				System.out.print("x");
			}
			for(int i=1;i<h;i++)
			{
				System.out.print("-");
			}
			for(int j=3;j<=h;j++)
			{
				System.out.print("-");
			}
			if((h>=2)&&(h<=4))
			{
				for(int k=6;k>h;k--)
				{
					System.out.print("x");
				}
			}
			else
			{
				for(int l=1;l<=4;l++)
				{
					System.out.print("x");
				}
			}
			System.out.println();
		}
	}
}
	


