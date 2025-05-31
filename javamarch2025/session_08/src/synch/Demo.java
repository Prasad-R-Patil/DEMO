package synch;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Account a = new Account();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		t1.start();
		t2.start();
		Thread.sleep(1200);
		System.out.println("Balance = "+a.getBalance());
		
		
	}

}
