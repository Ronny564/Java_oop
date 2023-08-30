package method;

public class MethodOverloadEx {

	public static void Sum()
	{
		int a =20;
		int b =30;
		System.out.println("Sum " + (a+b));
		
	}
	public static int Sum(int a) {
		int b = a+12;
		return b;
	}
	public static void Sum(int a,int b)
	{
		System.out.println("Sum =" + (a+b));
	}
	public static void Sum(float a, float b)
	{
		System.out.println("Sum is " + (a+b));
	}
	public static int Sum(int a, int b, float c)
	{
		return (int)(a+b+c);
	}
	public static void repChar()
	{
		for(int i=0;i<=45;i++)
		{
			System.out.print("+");
		}
		System.out.println();
	}
	public static void repChar(char ch)
	{
		for(int i=0;i<=45;i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	public static void repChar(char ch, int a)
	{
		for(int i =0;i<=a;i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Sum();
		System.out.println(Sum(2));
		Sum(5,5);
		Sum(1.5f,1.3f);
		System.out.println(Sum(2,3,4));
		repChar();
		repChar('*');
		repChar('=',30);
		
		
//		float a =2.5f;
//		int b = (int)a;
//		System.out.println(b);
	}

}
