package oop;

public class Animal {
	private String name;
	private int height;
	private String gender;
	
	public String getGender(String gender)
	{
		this.gender = gender;
		return gender;
	}
	
	public void getAnimal()
	{
		name = "Aung Net";
		height = 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		System.out.println(dog.name);
		dog.getAnimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		System.out.println(dog.gender);
		dog.getGender("Male");
		System.out.println(dog.gender);
		
		
	}

}
