package session_05;

public class Demo extends CalNumber implements StaticCal,CompareCal{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition = "+(a+b));
	}

	@Override
	public int sub(int a, int b) {
		
		return (a-b);
	}

	@Override
	public int min(int a, int b) {
		
		int m = (a<b)?a:b;
		return m;
	}

	@Override
	public int avg(int a, int b) {
		
		return (a+b)/2;
	}

}
