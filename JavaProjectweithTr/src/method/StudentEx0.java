package method;

public class StudentEx0 {
	String name;
	int age;
	static String module = "Programming";
	
	public void createStudent()
	{
		System.out.println("Create Student object = " + name + " " + age);
	}
	public static void display()
	{
		System.out.println("Module " + module);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx0 st = new StudentEx0();
		st.name = "Lin";
		st.age = 20;
		st.createStudent();
		StudentEx0 st1 = new StudentEx0();
		st1.name = "Myat";
		st1.age = 20;
		st1.createStudent();
		
		System.out.println(StudentEx0.module);
		StudentEx0.display();
		
		
	}

}
