class base
{
	public base()
	{
		
	}
	public void test()
	{
		System.out.println("����������д�ķ���");
	}
}
public class Sub extends base
{
	private String name;
	public void test()
	{
		System.out.println(name.length());
	}
	public static void main(String[] args)
	{
		Sub s=new Sub();
	}
}