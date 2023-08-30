package method;

import java.util.Scanner;

public class MethodEx1 {
	
	static int result;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		System.out.println("Enter First Number");
		int fnum = sc.nextInt();
		System.out.println("Enter Second Number");
		int snum = sc.nextInt();
		System.out.println("Enter Operator");
		char ch= sc.next().charAt(0);
//		int result=0;
		
		switch (ch) {
		case '+': result= sum(fnum,snum);break;
		case '-': result=sub(fnum,snum);break;
		case '*': result= multi(fnum,snum);break;
		case '/': result= div(fnum,snum);break;
		default: System.out.println("Wrong Input");
		}
		System.out.println("Result " + result);
		}while(repeat());
		
	}
	public static int sum(int num1,int num2)
	{
		return (num1+num2);
	}
	public static int sub(int num1,int num2)
	{
		return (num1-num2);
	}
	public static int multi(int num1,int num2)
	{
		return (num1*num2);
	}
	public static int div(int num1,int num2)
	{
		return (num1/num2);
	}
	
	public static boolean repeat() {
		System.out.println("Do another Yes or No");
		String status = sc.next();
		if(status.equalsIgnoreCase("yes"))
			return true;
		else
			return false;
	}

}
