package Joji_package;
import java.util.Scanner;

public class function11 {
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		function11 obj=new function11();
		System.out.println("底辺の長さを記入してください");
		float a=m.nextFloat();
		System.out.println("高さを記入してください");
		float b=m.nextFloat();
		
		float c=obj.triangle(a,b);
		System.out.println("面積は"+c+"です");
		
		System.out.println("半径の長さを入力してください");
		double d=m.nextDouble();
		double e=obj.circle(d);
		System.out.println("円の面積は"+e+"です");
		
		
	}
	public float triangle(float x,float y)
	{
		return(x*y/2);
	}
	public double circle(double x)
	{
		return(x*x*3.1);
	}

}
