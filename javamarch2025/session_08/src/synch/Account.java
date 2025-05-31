package synch;

public class Account {
	
	private int balance;
	
	public Account()
	{
		balance = 10000;
	}
	
	public synchronized void deposit(int amount) throws InterruptedException
	{
		System.out.println("In deposit------");
		System.out.println(Thread.currentThread().getName()+" "+balance);
		int temp;
		temp = balance;
		temp+= amount;
		Thread.sleep(500);
		balance = temp;
		System.out.println("Updated Balance = "+Thread.currentThread().getName()
				+" "+balance);
	}
	
	public int getBalance()
	{
		return balance;
	}

}
