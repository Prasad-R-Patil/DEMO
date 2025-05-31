package session_06;
public class Outer1 {	
	private int a = 100;
	private static float d = 10.2f;
	public static void get()
	{
		int no = 100;
		class Inner1
		{
			private int b = 20;
			
			public void display() 
			{
				System.out.println("a = "+a);
				System.out.println("b = "+b);
				System.out.println("d = "+Outer1.d);	
			}
			
		}
		Inner1 i = new Inner1();
		i.display();
		
	}
	public static void main(String[] args) {	
		Outer1 o = new Outer1();
		o.get();
	}
}
