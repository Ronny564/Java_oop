package oop;

public class Vehicle {
	
	protected String brand = "Ford";
	public void honk()
	{
		System.out.println("Tuu, tuu!");
	}
}
class Car extends Vehicle{
	private String modelName="Mustang";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.honk();
		System.out.println(myCar.brand + myCar.modelName);
	}
	
}
