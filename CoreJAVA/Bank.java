package Assignment_05;

public abstract class Bank {
	protected long accountNo;
	protected String name;
	protected float balance;
	protected String branch;
	
	public Bank() {}
	
	public Bank(long accountNo, String name, float balance, String branch) {
		
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	
	
	
	
	public long getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public String getBranch() {
		return branch;
	}

	public abstract void display(Bank[] b);
	
	
	
	public void withdrowal(Bank[] e, float amt, int ac) {};
	
	public void deposit(Bank[] e, float amt, int ac) {};
	
	
	
	public void BankTBal()
	{
		
		
	}
	
	public double dcal(Bank []b)
	{
		return 0;
	}
	
	

}
