package session_04;

public class Rectangle extends Shape{

	public Rectangle(int len, int br) {
		super(len, br);	
	}
	
	@Override
	public void calculateArea()
	{
		int area = len * br;
		System.out.println("Area of Rectangle = "+area);
	}
	
	

}
