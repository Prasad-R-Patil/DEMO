package Assignment04;

public class Factorial extends Processor {

	protected int fact=1;
	
	public Factorial(int data)
	{
		this.data=data;
	}
	@Override
	public void Process() {
		fact=1;
		for(int i=1;i<=data;i++)
		{
			 fact *= i;
		}
		
	}
	
	public void showData()
	{
		System.out.println("Factorial is :->"+fact);
	}

}
