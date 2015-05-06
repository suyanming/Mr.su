package Homework;

class AAA
{
	static
	{
		System.out.println("我是AAA中的静态块");
	}
}
public class Position 
{
	static
	{
		System.out.println("我是最先被执行的静态块");
	}
	public static void main(String[] args)
	{
	AAA a = new AAA();
	System.out.println("我在了解静态（static）");
	}
}


