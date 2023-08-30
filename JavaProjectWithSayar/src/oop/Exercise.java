package oop;

import java.util.Scanner;

public class Exercise {
	String name;
	int age;
	public Exercise()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name =sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
//		this.name = name;
//		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise ex = new Exercise();
		System.out.println(ex.name+ " "+ ex.age+ " ");
		
		
	}

}
