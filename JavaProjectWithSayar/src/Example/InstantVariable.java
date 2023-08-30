package Example;

public class InstantVariable {

	static String name = "Aung Aung";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getName();
		InstantVariable iv = new InstantVariable();
		iv.getAge();
	}
	public static void getName() {
		System.out.println(name);
	}
	public void getAge() {
		int age = 20;
		System.out.println(age);
	}
}
