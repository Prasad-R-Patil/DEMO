package synch;

public class Factorial {
	
	public synchronized void fact(int num) throws InterruptedException
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
			Thread.currentThread().sleep(100);
			System.out.println("Fact = "+fact);
		}
		
		
	}

}
