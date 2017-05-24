package Joji_package;
class misao
{
	public void good()
	{
		System.out.println("misao is good place");
	}
}
class over extends misao
{
	public void  good()
	{
		System.out.println("misao is comfortable place");
	}
}

public class overriding1 {
	public static void main(String[] args)
	{
		over obj=new over();
		obj.good();
	}

}
