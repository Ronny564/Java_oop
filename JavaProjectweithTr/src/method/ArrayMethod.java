package method;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4};
		int B[]= {5,6,7,8};
		int c[]= Add(A,B);
		display(c);
	}
	public static int[] Add(int A[],int B[])
	{
		int C[]= new int[A.length];
		for(int i =0;i<A.length;i++)
		{
			C[i]=A[i]+B[i];
		}
		return C;
	}
	public static void display (int[] d)
	{
		for(int i =0;i<d.length;i++)
		{
			System.out.print(d[i]+ " ");
		}
//		System.out.println(Arrays.toString(d));
	}
}
