package session_05;
public class GcDemo {
	  protected void finalize() throws Throwable {
		  super.finalize();
		  System.out.println("Object Garbage Collected!");
	  }
	
	public static void main(String[] args) {
		GcDemo g1 = new GcDemo();
		GcDemo g2 = new GcDemo();
		GcDemo g3 = new GcDemo();	
		//...
		//...
		//nullify the objects
		g1 = null;
		g2 = null;
		g3 = null;
		System.gc();	
	}
}
