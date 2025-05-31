package session_08;

public class DaemonThread extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+
					" Is Daemon Thread");
		}
		else
			System.out.println(Thread.currentThread().getName()+" User Thread");
	}
	public static void main(String[] args) {
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		d1.setDaemon(true);
		d1.start();
		d2.start();	
	}
}
/*Daemon Threads:
	Are Service providers
	ex: GC
	When all user thread die, then daemon thread dies
*/




