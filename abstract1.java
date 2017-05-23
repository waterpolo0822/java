package Joji_package;

public class abstract1 {
	
	public static void main(String[] args)
	{
		B obj =new B();
		obj.joji();
		obj.misaoit();
		
	}

}
abstract class A
{
	abstract void misaoit();
	abstract void joji();
	public void hello()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	void joji()
	{
		System.out.println("my name is joji");
	}
	void misaoit()
	{
		System.out.println("we're 6 members");
	}
}