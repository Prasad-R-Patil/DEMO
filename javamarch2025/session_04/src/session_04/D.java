package session_04;

public class D extends C{
	
	public D()
	{
		//super();
		System.out.println("Default of D");
	}
	
	public D(int a)
	{
		super(100);
		System.out.println("Parameterized of D");
	}
	
	public static void main(String[] args) {	
		D d = new D(10);	
	}
}
