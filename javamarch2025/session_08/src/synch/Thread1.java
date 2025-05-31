package synch;

public class Thread1 extends Thread{	
	Account a;
	
	public Thread1(Account a)
	{
		this.a = a;
	}
	
	public void run()
	{
		try {
			a.deposit(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
