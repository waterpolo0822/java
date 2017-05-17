package Joji_package;
import java.util.Scanner;

public class array6 {
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		int []a= new int[10];
		
		int b=0;
		while(b<=9)
		{
			int c=b+1;
			System.out.println("Enter No."+c);
			a[b]=m.nextInt();
			b++;
		}
		System.out.println("what number are you looking for?");
		int d=m.nextInt();
		int xx =0;
		for(int e=0;e<=9;e++)
		{
			if(a[e]==d)
			{
				xx++;
				
				break;
			}
		
		}
		if(xx>0)
		{
			System.out.println("i find your number.");
		}
		else
		{
			System.out.println("i couldn't find your number.");
		}
		
		
	}

}
