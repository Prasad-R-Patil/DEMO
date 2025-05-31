package synch;

public class MyThread2 extends Thread{
	
	Factorial f;
	
	public MyThread2(Factorial f)
	{
		this.f = f;
	}
	
	public void run()
	{
		try {
			f.fact(7);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
