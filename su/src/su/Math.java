package su;

public class Math
{
		public int add(int a,int b)
	     {
	     	return a + b;
	     }
	     public int subtract(int a,int b)
	     {
	     	return a - b;
	     }
	     public int multiply(int a,int b)
	     {
	     	return a * b;
	     }
	     public int divide(int a,int b)
	     {
	     	return a / b;
	     }
	     public static void main(String[] args)
	     {
	     	Math math = new Math();
	     	int x = 8;
	     	int y = 6;

	     	int a = math.add(x,y);
	     	int b = math.subtract(x,y);
	     	int c = math.multiply(x,y);
	     	double d = math.divide(x,y);
	     	
	     	System.out.println(a);
	     	System.out.println(b);
	     	System.out.println(c);
	     	System.out.println(d);
	     }
}
