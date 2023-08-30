package array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {13,5,15,2,4,1,-1,49,50};
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int index = Arrays.binarySearch(A,5);
		if(index<0)
			System.out.println("Not Found");
		else
		System.out.println(A[index]+ " is foind at index :" + index);
		int[] B= Arrays.copyOf(A, 10);
		System.out.println("B array value =" + Arrays.toString(B));
		Arrays.fill(B, 100); //Arrayname , 100 value pyung
		System.out.println("B array value =" + Arrays.toString(B));
		Arrays.fill(B, 0, 5, 55);//Arrayname,0 ka nay 5 a hti ko 55 htae
		System.out.println("B array value =" + Arrays.toString(B));
		int []C =Arrays.copyOf(A, A.length);
		System.out.println("C array value : "+ Arrays.toString(C));
		boolean equal =Arrays.equals(A, C);
		if (equal)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
