package session_04;

public class Circle extends Shape{
	
	private final float PI = 3.14f;

	public Circle(int r)
	{
		super(r);
	}
	
	@Override
	public void calculateArea()
	{
		float area = PI * radius * radius;
		System.out.println("Area of Circle = "+area);
	}
	
	
}
