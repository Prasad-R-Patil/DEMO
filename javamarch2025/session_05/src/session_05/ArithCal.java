package session_05;

public interface ArithCal {
	
	int a = 10;//static and final
	static final int no = 100;
	
	public void add(int a,int b);
	
	public abstract int sub(int a,int b);
	
	/*
	 * public ArithCal() {
	 * 
	 * }
	 */
	
	public static void sayHello()
	{
		System.out.println("Hello");
	}
	
	public default void getNo()
	{
		System.out.println("No "+no);
	}

}
