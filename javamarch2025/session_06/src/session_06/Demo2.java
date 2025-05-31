package session_06;

public class Demo2 {
	
	public static void main(String[] args) {	
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("c = "+c);
			
		}catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println(e);
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println(e.getMessage());
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				e.printStackTrace();
			}
			else
			{
				System.out.println("Exception!!!");
			}
		}
	}
}
