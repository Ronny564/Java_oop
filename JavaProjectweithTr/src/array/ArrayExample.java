package array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row = sc.nextInt();
		System.out.println("Enter the number of column");
		int column = sc.nextInt();
		
		int[][]A = new int[row][column];
		for(int x=0;x<row;x++)
		{
			for(int y=0;y<column;y++)
			{
				System.out.print("Enter a value");
				A[x][y]=sc.nextInt();
			}
		}
		System.out.println("Display the Array: ");
		for(int x=0;x<A.length;x++)					//A.length = the number of row
		{
			for(int y=0;y<A[x].length;y++)			// A[x].length = the number of column
			{
				System.out.print(A[x][y]+ " ");
			}
			System.out.println();
		}
	}

}
