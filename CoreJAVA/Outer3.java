package session_06;

public class Outer3 {
	private int a=0;
	private static float d=10.2f;
	
	public static void get()
	{
		int no=100;
		
		class Inner1
		{
			private int b=20;
			
			public void display()
			{
				//System.out.println("a= "+Outer3.this.a);
				System.out.println("b= "+b);
				System.out.println("d= "+Outer3.d);
			}
			
			
		}
		Inner1 i=new Inner1();
		
		i.display();
	}
	
	public static void main(String[] args) {
		Outer3 o=new Outer3();
		o.get();
		                                                                                                        
	}
}
