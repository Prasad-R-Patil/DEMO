package session_08;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExceutorDemo {	
	public static void main(String[] args) {
		
		PrintJob[] jobs= {
						new PrintJob("xyz"),
						new PrintJob("mno"),
						new PrintJob("abc"),
						new PrintJob("rtf"),
						new PrintJob("txt"),
						new PrintJob("pdf"),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		
		service.shutdown();	
	}
}