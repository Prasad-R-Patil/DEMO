package session_05;

public class Test1 {
	
	public static void main(String[] args) {
		//Bank b = new Bank();//cannot be instantiated
		Bank b = new IDBI();
		System.out.println("SBI = "+b.getROI());
		b.sayHello();
	}

}
