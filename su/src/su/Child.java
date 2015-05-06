package su;

public class Child extends Parent
{
	public Child()
	{
		super(1);
		
		System.out.println("child");
	}

	public static void main(String[] args)
	{
		Child child = new Child();
	}
}
class Parent
{
	public Parent(int i)
	{
		System.out.println("Parent");
	}
}
