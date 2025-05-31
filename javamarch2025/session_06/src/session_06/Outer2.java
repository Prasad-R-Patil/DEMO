package session_06;
public class Outer2 {
	private int a = 100;
	private static float d = 10.2f;
	
	public static class Inner2
	{
		public void get()
		{
			//System.out.println("a = "+a);
			System.out.println("d = "+d);
		}
	}
	public static void main(String[] args) {
		Outer2.Inner2 i = new Outer2.Inner2();
		i.get();
	}
}
