package method;

import java.util.Scanner;

public class MetodEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of reactangle");
		int length = sc.nextInt();
		System.out.println("Enter width of rectangle");
		int width = sc.nextInt();
		
		System.out.println("Area of Rectangle " + Area(length,width) ); 
		System.out.println("Parameter of Rectangle " + Parameter(length,width)); 
		A(length,width);
}
	public static int Area(int length,int width) {
		return(length*width);
		
	}
	public static int Parameter(int length,int width)
	{
		return (2*(length+width));
	}
	
	public static void A(int length, int width)
	{
		int A = length*width;
		System.out.println("A is " + A);
	}
}
