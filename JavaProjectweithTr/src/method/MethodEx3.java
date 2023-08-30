package method;

import java.util.Scanner;

public class MethodEx3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		System.out.println("Enter Rows");
		int rows = sc.nextInt();
		System.out.println("Enter Column");
		int column = sc.nextInt();
		
		display(ch,rows,column);
	}
	public static void display(char ch, int rows,int column)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
	}
}


