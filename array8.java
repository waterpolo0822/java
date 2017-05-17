package Joji_package;
import java.util.Scanner;
public class array8 {
	public static void main(String[] args)
	{
		Scanner m= new Scanner(System.in);
		int []a=new int[10];
		for(int b=0;b<=8;b++)
		{
			int c=b+1;
			System.out.println("Enter No."+c);
			a[b]=m.nextInt();
		}
		System.out.println("put your array number.");
		int e=m.nextInt();
		for(int d=8;d>=e;d--)
		{
			a[d+1]=a[d];
		}
		System.out.println("put your number");
		a[e]=m.nextInt();
		
		for(int f=0;f<=9;f++)
		{
			System.out.println(a[f]);
		}
	}

}
