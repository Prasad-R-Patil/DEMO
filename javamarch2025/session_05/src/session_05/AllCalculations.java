package session_05;

public class AllCalculations {
	
	public static void main(String[] args) {
		
		//ArithCal c = new ArithCal();//cannot be instantiated
		Demo d = new Demo();
		d.add(10, 20);
		System.out.println("Sub = "+d.sub(7, 5));
		System.out.println("Min = "+d.min(6, 8));
		System.out.println("Avg = "+d.avg(89, 67));
		d.factorial(8);
		
		
	}

}
