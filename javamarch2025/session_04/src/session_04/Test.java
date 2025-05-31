package session_04;

public class Test {
	
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s = new Circle(5);
		s.calculateArea();
		s = new Rectangle(5, 6);
		s.calculateArea();
		
	}

}
