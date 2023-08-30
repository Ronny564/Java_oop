package method;

import java.util.Scanner;

public class RecursiveExample {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First Number");
		int fnum = sc.nextInt();
		System.out.println("Enter Second Number");
		int snum = sc.nextInt();
		sum(fnum,snum);
		
	}
	public static void sum(int a ,int b)
	{
		int add = a+b;
		System.out.println("Sum = " + add);
		if(add<=100)
		{
			System.out.println("Enter another first numbe");
			int n1= sc.nextInt();
			System.out.println("Enter another second number");
			int n2 = sc.nextInt();
			sum(n1,n2);
		}
	}

}
