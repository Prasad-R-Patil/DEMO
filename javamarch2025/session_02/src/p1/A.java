package p1;

 class A {
	
	protected int no ;
	 
	private A()
	 {
		 
	 }
	
	protected void getNo()
	{
		System.out.println("No = "+no);
	}
	
	public static void main(String[] args) {
		 A a = new A();
	}

}
