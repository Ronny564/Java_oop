package oop;

public class Calculation {
	int z;

	public void additional(int x, int y) {
		z = x + y;
		System.out.println("Addition is " + z);

	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("Subtraction is " + z);

	}

}

class my_Calculation extends Calculation {
	public void Multiplication(int x, int y) {
		z = x * y;
		System.out.println("Multiplication is " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_Calculation demo = new my_Calculation();
		int a = 40, b = 10;
		demo.additional(a, b);
		demo.subtraction(a, b);
		demo.Multiplication(a, b);
	}

}