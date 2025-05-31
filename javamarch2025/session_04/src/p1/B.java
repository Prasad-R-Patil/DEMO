package p1;
public class B extends A{
	@Override
	public B getNo()
	{
		return this;
	}
	
	public void msg()
	{
		System.out.println("Hello!");
	}
	
	public static void main(String[] args) {
		B b = new B();
		B b1 = b.getNo();
		b1.msg();
		
		new B().getNo().msg();
		new B().msg();
	}

}
