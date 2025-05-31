package synch;

public class Test {
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		MyThread1 t1 = new MyThread1(f);
		MyThread2 t2 = new MyThread2(f);
		t1.start();
		t2.start();
		
	}

}
