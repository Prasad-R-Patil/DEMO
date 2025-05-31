package session_08;

public class Demo1
{
	
	public static void main(String[] args) {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread t[] = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread i:t)
		{
			System.out.println(i);
		}
	}
}