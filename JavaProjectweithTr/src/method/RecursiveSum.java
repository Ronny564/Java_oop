package method;

import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sum(num);
		System.out.println("Sum is " + sum(num));
	}
	public static int sum(int num)
	{
		if(num==1)
			return 1;
		else
			return num+sum(num-1);
	}
}
