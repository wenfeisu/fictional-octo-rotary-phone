class Animal
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("������������");
	}
}
class Brid extends Animal 
{
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���Ͽ��ٱ���...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		Bird b=new Bird();
		b.breath();
		b.fly();
		Wolf w=new Wolf();
		w.breath();
		w.run();
	}
}