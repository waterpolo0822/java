package Joji_package;
import java.util.Scanner;

public class array5 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int sum=0;
		int []a = new int[10];
		for(int b=0; b<=9; b++)
		{
			a[b] =s.nextInt();
		}
		for(int c=0;c<=9; c++)
		{
			sum=sum+a[c];
		}
		System.out.println(sum);
		
	}

}
