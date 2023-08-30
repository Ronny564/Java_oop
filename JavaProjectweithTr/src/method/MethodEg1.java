package method;

import java.util.Scanner;

public class MethodEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		max(num1,num2);   // actual parameter (pass by value )
		
	}
	public static void max(int n1, int n2) {  // formal parameter
		if(n1>n2)
		{
			System.out.println("Maximun value =" +n1);
		}
		else
			System.out.println("Minimun value = " + n2);
	}

}
