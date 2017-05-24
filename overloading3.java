package Joji_package;
import java.util.Scanner;
class ask
{
	int []num=new int[6];
	int repeat;
	int sum=0;
	public void ask(int a)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("How many numbers do you want?");
		repeat=x.nextInt();
	}
	public void ask()
	{
		for(int a=1;a<=repeat;a++)
		{
			Scanner m=new Scanner(System.in);
			System.out.println("put yor number "+a);
			num [a-1]=m.nextInt();
		}
		for(int b=0;b<=repeat;b++)
		{
			sum=sum+num[b];
		}
		System.out.println(sum);
	}
}
public class overloading3 {
	public static void main(String[] args)
	{
		ask obj=new ask();
		obj.ask(1);
		obj.ask();
	}

}
