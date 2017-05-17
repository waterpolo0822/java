package Joji_package;
import java.util.Scanner;
public class array7 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int []a = new int[10];
		for(int b=0; b<=9; b++)
		{
			int c=b+1;
			System.out.println("Enter No." + c);
			a[b]=s.nextInt();
		}
		
		for(int d=0; d<=9; d++)
		{
			for(int e=d+1; e<=9; e++)
			{
				if(a[d]>a[e])
				{
					int f=a[d];
					a[d]=a[e];
					a[e]=f;
				}
			}
			System.out.println(a[d]);
			
		}
		
		
	}

}
