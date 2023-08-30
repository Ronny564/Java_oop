package array;

public class StudentArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "Su Su", "Aung Aung", "Zin Zin", "Mg Mg", "Aung Aung" };

		int[] marks = { 89, 40, 100, 95, 80 };
		for (int i = 0; i < name.length; i++) {
			if (marks[i] > 50)
				System.out.println(name[i] + ": pass");
			else
				System.out.println(name[i] + ": fail");
		}
	}

}
