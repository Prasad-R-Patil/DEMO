package session_05;

public class CalNumber {

	public void factorial(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	public static void main(String[] args) {
		ArithCal c = new Demo();
		c.getNo();
		ArithCal.sayHello();
		System.out.println(ArithCal.a);
		System.out.println(Demo.a);
		ArithCal.a =1;
	}
	
}
