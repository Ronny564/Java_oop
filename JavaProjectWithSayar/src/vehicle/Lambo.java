package vehicle;

public class Lambo extends Car {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambo lam = new Lambo();
		lam.viewName();
	
	}

	public void viewName()
	{
		super.showName("Lambo", 20);
	}
}
