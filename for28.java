package Joji_package;

public class for28 {
	public static void main(String[] args)
	{
	 int h=4;
		for(int a=1; a<=9; a++)
		{
			if(a<=5)
			{
				for(int b=4; b>=a; b--)
				{
					System.out.print(" ");
				}
				for(int c=1; c<=a; c++)
				{
					System.out.print(c);
				}
			}
			else
			{
				for(int d=6; d<=a; d++)
				{
					System.out.print(" ");
				}
				for(int e=1; e<=h; e++)
				{
					System.out.print(e);
				}
				h--;
			}
		System.out.println();
		}
	}

}
