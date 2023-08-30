package oop;

public class Students {
	
	public Students()   //default constractor
	{
		System.out.println("Students Constractor");
	}
	
	public Students(String name)
	{
		System.out.println("Name is  " + name);
	}
	public Students(int n1)
	{
		System.out.println("Number is " + n1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		Students st1 = new Students("Maung Maung");
		Students st2 = new Students(10);
		Students st3 = new Students("Aung Aung");
	}

}
