package session_08;
public class PrintJob implements Runnable{
	String name;
	
	public PrintJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+"...Job Started by Thread: "
	+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" ..Job Completed by Thread: "
		+Thread.currentThread().getName());
	}
}
