package session_04;
public class B extends A{	
	private int a ;
	
	public B()
	{
		a = 100;
	}
	
	@Override
	protected void getNo()
	{
		System.out.println("a = "+a);
	}
	
	public void m1()
	{
		System.out.println("In m1()");
	}
	
	public static void main(String[] args) {
		
	//	B b = new B();
	//	b.getNo();
		//Polymorphic reference
		A a = new B();
		((B)a).m1();
	}
}
