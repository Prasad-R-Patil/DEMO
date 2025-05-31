package session_06;

public class Test extends Outer{	
	public static void main(String[] args) {	
		/*
		 * Coffee c = new Coffee() {
		 * 
		 * @Override public void taste() { System.out.println("Strong"); } };
		 * 
		 * c.taste();
		 */
		
		Coffee c = new A();
		System.out.println(c.getClass());	
	}
}
