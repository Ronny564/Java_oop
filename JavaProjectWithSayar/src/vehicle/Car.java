package vehicle;

public class Car {
	public String name;
	public int age;
	
	public Car()
	{
		
	}
	public void showName(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println(name+ " " + age);
	}
}
