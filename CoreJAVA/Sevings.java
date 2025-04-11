package Assignment_05;

public class Sevings extends Bank {

	public Sevings() {
		super();
		
	}

	public Sevings(long accountNo, String name, float balance, String branch) {
		super(accountNo, name, balance, branch);
		
	}


	public void display(Bank[] b) {

		for (int i = 0; i < b.length; i++) {
			System.out.println("Sevings = [ Account No-" + b[i].accountNo + " Name-" + b[i].name + " Balance-"
					+ b[i].balance + " Branch-" + b[i].branch);
		}
	}

	public void withdrowal(Bank[] e, float amt, int ac) {
		
		float with = 0.0f;
		
		for (int i = 0; i < e.length; i++) {
			if ((e[i].balance >= 5000) && (e[i].accountNo == ac)) {
				with = e[i].balance - amt;
				if (with >= 5000) {
					e[i].balance = with;
					System.out.println("Custumer ->" + ac + " " + e[i].balance);
				}
			}

		}

	}

	public void deposit(Bank[] e, float amt, int ac) {
		
		float Depo = 0.0f;
		
		for (int i = 0; i < e.length; i++) {
			if (e[i].accountNo == ac) {
				Depo = e[i].balance + amt;
				e[i].balance = Depo;
				System.out.println("Custumer ->" + ac + " " + e[i].balance);
			}

		}

	}

	public double dcal(Bank[] b) {
		double d = 0;
		for (int i = 0; i < b.length; i++) {
			d = d + b[i].balance;
		}
		return d;
	}

}
