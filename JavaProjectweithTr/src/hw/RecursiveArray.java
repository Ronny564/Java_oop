package hw;

import java.util.Scanner;

public class RecursiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5};
//		Array(A,A.length-1);
		System.out.println("Value is " +Array(A,A.length-1));
		
	}
	public static int Array(int []a,int b)
	{
		if(b==0)
			return a[b];
		else
			return a[b]+Array(a, b-1);
	}
	

}
