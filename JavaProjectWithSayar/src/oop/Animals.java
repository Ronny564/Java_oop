package oop;

public class Animals {
	String color = "Black";
	Animals(){
		System.out.println("Animal is created");
	}
	public void display() {
		System.out.println("Display Method of Animal Class");
	}

}
class Dog extends Animals{
	String color = "White";
	Dog()
	{
		super();
		System.out.println("Dog is created");
	}
	public void display()
	{
		System.out.println("Display method of Dog Class");
	}
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		display();
		super.display();
	}
}
class TestSuper{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.printColor();;
		
	}
}

