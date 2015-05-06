package su;

public class People 
{
	private static int age;
	
	public static void change(int i)
	{
		i++;
	}
	public void change2(People p)
	{
		p = new People();
		p.setAge(p.age() + 1);
	}
	public void change3(People p,int i)
	{
		p.setAge(p.age() + 1);
		i++;
	}
	public static void main(String[] args) 
	{
		People  people = new People();
		int a = 0;
		people.change(people.age());
		System.out.println(people.age());
		
		People people1 = new People();
		people1.change2(people1);
		System.out.println(People.age());
		
		People people11 = new People();
		people11.change3(people11,people11.age());
		System.out.println(people11.age());
		
	}
	public static int age() {
		return age;
	}
	public static void setAge(int age) {
		People.age = age;
	}

}
