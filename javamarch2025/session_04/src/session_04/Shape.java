package session_04;

public abstract class Shape {
	protected int radius;
	protected int len,br;
	
	public Shape() {}
	
	public Shape(int radius)
	{
		this.radius = radius;
	}

	public Shape(int len, int br) {
		super();
		this.len = len;
		this.br = br;
	}
	
	public abstract void calculateArea();

	

}
