package session_08;

public class MyThread extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()
				+ ""+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(7);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();	
	}
}
