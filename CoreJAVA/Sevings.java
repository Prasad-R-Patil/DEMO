package Assignment_05;

public class Sevings extends Bank{

	public Sevings() {
		super();
		
	}

	public Sevings(long accountNo, String name, float balance, String branch) {
		super(accountNo, name, balance, branch);
		
	}
	
	public void withdrawal()
	{
		
	}
	
	public void display(Bank[] b) {
		
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Sevings = [ Account No-"+b[i].accountNo+" Name-"+b[i].name+" Balance-"+b[i].balance+" Branch-"+b[i].branch);
		}
	}
	
	
	public double dcal(Bank []b)
	{
		double d = 0;
		for(int i=0;i<b.length;i++)
		{
			 d=d+b[i].balance;
		}
		return d;
	}

}
