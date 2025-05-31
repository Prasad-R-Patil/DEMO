package session_08;
public class Test extends Thread
{	
	public Test(ThreadGroup tg,String name)
	{
		super(tg, name);
	}
	
	public void run()
	{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		Test t1 = new Test(pg, "One");
		Test t2 = new Test(pg,"Two");
		
		System.out.println(pg.getMaxPriority());
		System.out.println(cg.getMaxPriority());
		System.out.println(t1.getPriority());
		
		pg.setMaxPriority(3);
		Test t3 = new Test(pg,"Three");
		System.out.println(pg.getMaxPriority());
		System.out.println(t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		pg.list();
	
		System.out.println("Active count = "+pg.activeCount());
		
		Thread.sleep(1000);
		pg.list();
		
		System.out.println("Active count = "+pg.activeCount());
		
		
	}

}
