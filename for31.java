package Joji_package;

public class for31 {
	public static void main(String[] args)
	{
	
		for(int a=1; a<=9; a++)
		{
			int g=1;
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
				for(int d=a-1; d>=1; d--)
				{
					System.out.print(d);
				}
			}
			else
			{
				for(int e=6; e<=a; e++)
				{
					System.out.print(" ");
				
				}
				for(int f=9; f>=a; f--)
				{
					System.out.print(g);
					g++;
				}
				for(int h=9-a; h>=1; h--)
				{
					System.out.print(h);
					
				}
			}
		System.out.println();	
		}
	}

}
