package session_06;

public class Demo {
	
	public static void msg()
	{
		getMsg();
	}
	
	public static void getMsg()
	{
		int a = 10/0;
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		Demo.msg();		
	}
}
//Default Exception Handler -
//Name of Exception:desc
//stack frame





