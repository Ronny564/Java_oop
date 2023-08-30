package hw;

import java.util.Scanner;

public class SwitchtoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter TestCase");
		char testcase = sc.next().charAt(0);
		if(testcase=='a')
			System.out.println('b');
		else if(testcase=='b')
			System.out.println('c');
		else
		System.out.println('a');
//		char testCase='a';
//		if(testCase=='a')
//			System.out.println('b');
//		else if(testCase=='b')
//			System.out.println('c');
//		else
//			System.out.println('a');
		
		
	
		
	}

}
