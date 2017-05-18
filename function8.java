package Joji_package;
import java.util.Scanner;
public class function8 {
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		function8 obj=new function8();
		System.out.println("put your number");
		int a=m.nextInt();
		int b=m.nextInt();
		int c=obj.add(a,b);
		System.out.println(c);
	}
	public int add(int x,int y)
	{
		return (x+y);
	}

}
