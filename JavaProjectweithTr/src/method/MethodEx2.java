package method;

import java.util.Scanner;

public class MethodEx2 {
	static Scanner sc = new Scanner(System.in);
	static int ft;
	static float inches;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ft1 =InputData();
		float ft2 = InputData();
		
		float resultfeet = add(ft1,ft2);
		
		display (resultfeet);
		
	}
	public static float InputData()
	{
		System.out.println("Enter feet");
		ft = sc.nextInt();
		System.out.println("Enter inches");
		inches = sc.nextFloat();
		
		if(inches >=12) {
			ft++;
			inches -=12;
		}
			
		
		float feet =convertFeet();
		return feet;
	}
	public static float convertFeet()
	{
		return ft + (inches/12);
	}
	public static float add(float f1,float f2)
	{
		return f1+f2;
	}
	public static void display (float resultfeet)
	{
		System.out.println("Result :" + resultfeet);
	}

}
