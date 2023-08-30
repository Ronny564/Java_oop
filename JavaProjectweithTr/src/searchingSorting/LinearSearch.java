package searchingSorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of element");
		int n = sc.nextInt();
		
		int[] A = new int [n];
		for(int i=0;i<A.length;i++)
		{
			System.out.println("Enter A value");
			A[i]=sc.nextInt();
		}
		System.out.println("Enter seach key");
		int key = sc.nextInt();
		
		linearSearch(A,key);
		
	}
	public static void linearSearch(int[]A, int key)
	{
		int i=1;
		for(i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println(key + "is found at indes "+ i);
				break;
			}
		}
		if(i==A.length)
			System.out.println(key+" is not found");
	}

}
