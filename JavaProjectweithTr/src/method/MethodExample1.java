package method;

public class MethodExample1 {
	
	int a,b;
	public MethodExample1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample1 m1 = new MethodExample1(10,20);
		System.out.println("Before Swapping");
		System.out.println("m1.a = "+ m1.a+ " m1.b" + m1.b);
		swap(m1);
		System.out.println("After Swapping");
		System.out.println("m1.a = "+ m1.a+ " m1.b" + m1.b);
	}
	public static void swap(MethodExample1 m2)
	{
		int temp = m2.a;
		m2.a=m2.b;
		m2.b=temp;
		
	}

}
