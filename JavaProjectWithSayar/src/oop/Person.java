package oop;

public class Person {
	String name;
	int age;
	public Person()
	{
		 name = "Aung Aung";
		 age = 30;
	}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Person person1 = new Person("Mg Mg ", 20);
		System.out.println(person.name + " " + person.age+ " ");
		System.out.println(person1.name+ " " + person1.age+ " ");
	}

}
