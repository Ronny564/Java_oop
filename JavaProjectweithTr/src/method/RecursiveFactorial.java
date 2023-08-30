package method;

import java.util.Scanner;

public class RecursiveFactorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = sc.nextInt();
		long fact = Factorial(num);
		System.out.println("Factorial is " + fact);
	}
	public static long Factorial(long num)
	{
		if(num<=1)
			return 1;
		else
			return num*Factorial(num-1);
	}
}
