package oop;

public class Puppy {
	
		private int age;
		public Puppy(String name)
		{
			System.out.println("Puppy Name is " + name);
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getAge()
		{
			return age;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy pet = new Puppy("Holy");
		pet.setAge(20);
		System.out.println("Puppy Age is " + pet.getAge());
		
	}

}
