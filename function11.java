package Joji_package;
import java.util.Scanner;

public class function11 {
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		function11 obj=new function11();
		System.out.println("��ӂ̒������L�����Ă�������");
		float a=m.nextFloat();
		System.out.println("�������L�����Ă�������");
		float b=m.nextFloat();
		
		float c=obj.triangle(a,b);
		System.out.println("�ʐς�"+c+"�ł�");
		
		System.out.println("���a�̒�������͂��Ă�������");
		double d=m.nextDouble();
		double e=obj.circle(d);
		System.out.println("�~�̖ʐς�"+e+"�ł�");
		
		
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
