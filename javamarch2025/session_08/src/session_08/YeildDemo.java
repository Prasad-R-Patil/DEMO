package session_08;
public class YeildDemo implements Runnable{
	@Override
	public void run() {	
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==2)
			{
				Thread.yield();
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			}
			
	}	
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new YeildDemo());
		Thread t2 = new Thread(new YeildDemo());
		Thread t3 = new Thread(new YeildDemo());
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}


