package Joji_package;
import java.util.Scanner;

public class array4 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String []misao= new String[10];
		
		int a=0;
		while(a<=9)
		{
			misao[a]=s.next();
			a++;
		}
		int b=0;
		while(b<=9)
		{
			System.out.println(misao[b]);
			b++;
		}
		
	}

}
