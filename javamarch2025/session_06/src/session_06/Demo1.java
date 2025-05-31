package session_06;
public class Demo1 {	
	public static void main(String[] args) {	
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("c = "+c);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			System.out.println("Atleast enter 2 parameters");
		}
		catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			System.out.println("Enter only Integer values");
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Denominator should not be zero");
		}
		catch (Exception e) {
			System.out.println("Exception Occurred!!");
		}
	}

}
