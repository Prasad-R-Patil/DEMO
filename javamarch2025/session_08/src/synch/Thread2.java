package synch;

public class Thread2 extends Thread{
	
	Account a;
	
	public Thread2(Account a)
	{
		this.a = a;
	}
	
	public void run()
	{
		try {
			a.deposit(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
