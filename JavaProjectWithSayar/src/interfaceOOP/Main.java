package interfaceOOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2,3);
		System.out.println("Rectangle Area : " + r.area());
		System.out.println("Ractangle Parameter :" + r.perimeter()+"\n");
		
		Circle c = new Circle(12);
		System.out.println("Circle Area: " + c.area());
		System.out.println("Circle Perimeter: " + c.perimeter()+"\n");
		
		Triangle t = new Triangle(7,12,13);
		System.out.println("Triangle Area: "+ t.area());
		System.out.println("Triangle Perimeter: "+t.perimeter());
	}

}
