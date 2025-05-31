package session_08;
public class JoinDemo implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo j1 = new JoinDemo();
		Thread t1 = new Thread(j1, "one");
		Thread t2 = new Thread(j1, "two");
		Thread t3 = new Thread(j1, "three");
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
	}

}
