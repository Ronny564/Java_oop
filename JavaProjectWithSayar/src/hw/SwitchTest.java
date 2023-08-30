package hw;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		boolean con;
		do {
			System.out.println("Enter Num1");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2");
			int num2 = sc.nextInt();
			int result=0;
			System.out.println("Enter operator");
			char code = sc.next().charAt(0);
			switch(code) {
			case '+': result=num1+num2;
			System.out.println("Result :" + result);
			break;
			case '-': result=num1-num2;
			System.out.println("Result :" + result);
			break;
			case '*': result=num1*num2;
			System.out.println("Result :" + result);
			break;
			case '/': result=num1/num2;
			System.out.println("Result :" + result);
			break;
			default : System.out.println("Invalid Input");
			}
			System.out.println("Enter Again");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='Y');
		
	}

}
