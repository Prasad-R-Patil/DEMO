package session_03;
//public final class FinalDemo
public class FinalDemo{
	//private final int NO = 10;
	private final int NO;

	/*
	 * public FinalDemo() { NO = 100; }
	 */
	
	public FinalDemo(int nO) {
		super();
		NO = nO;
	}

	public final void getNo()
	{
		//no = 20;//CTE
	}

	public static void main(String[] args) {
		//final FinalDemo finalDemo = new FinalDemo();
		//finalDemo  = new FinalDemo();
		FinalDemo finalDemo = new FinalDemo(100);
		finalDemo.NO = 200;
	}
}
