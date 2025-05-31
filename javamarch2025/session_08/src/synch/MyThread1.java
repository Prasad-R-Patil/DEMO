package synch;

public class MyThread1 extends Thread{
	
	Factorial f;
	
	public MyThread1(Factorial f)
	{
		this.f = f;
	}
	
	public void run()
	{
		try {
			f.fact(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
