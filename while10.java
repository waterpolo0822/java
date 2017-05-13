package Joji_package;

public class while10 {
	public static void main(String[] args)
	{
		int a=1;
		while(a<=9){
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
				int d=a-1;
				while(d>=1)
				{
					System.out.print(d);
					d--;
				}
			}
			else
			{
				int e=6;
				while(e<=a)
				{
					System.out.print(" ");
					e++;
				}
				int f=9;
				int g=1;
				while(f>=a)
				{
					System.out.print(g);
					g++;
					f--;
				}
				int h=9-a;
				while(h>=1)
				{
					System.out.print(h);
					h--;
				}
			}
			
			
			
			System.out.println();
			a++;
		}
	}

}
