package Assignment_05;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch;
		Bank [] sev=new Sevings[0];
		Bank [] cur=new Current[0];
		
		
		do {
			System.out.println("Chooes What do you  whant  Your Account Type....");
			System.out.println("1.Sevings Account:-");
			System.out.println("2.Current Account:-");
			System.out.println("3.Exit Process");
			
			System.out.println("==> Enter <==");
			ch=s.nextInt();
			
			
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("How Many You Can Create Seavings Account:->");
					int size=s.nextInt();
					
					sev=new Sevings[size];
					
					for(int i=0;i<sev.length;i++)
					{
						
						System.out.println("Enter Account Number:->");
						long accountNo=s.nextLong();
						
						
						System.out.println("Enter Account Holder Name:->");
						String name=s.next();
						
						System.out.println("Enter Account Blance:->");
						float balance=s.nextFloat();
						
						System.out.println("Enter Branch Name:->");
						String branch=s.next();
						if(balance>=5000)
						{
							sev[i]=new Sevings(accountNo,name,balance,branch);
							System.out.println("Seavings Account was Created...!");
						}
						else
						{
							System.out.println("Account not Created(Minimum Balance less than 5000)");
						}
												
					}
					
					break;
				}
				
				case 2:
				{
					System.out.println("How Many You Can Create Current Account:->");
					
					int size1=s.nextInt();
					
					cur=new Current[size1];
					
					for(int i=0;i<cur.length;i++)
					{
						
						System.out.println("Enter Account Number:->");
						long accountNo=s.nextLong();
						
						
						System.out.println("Enter Account Holder Name:->");
						String name=s.next();
						
						System.out.println("Enter Account Blance:->");
						float balance=s.nextFloat();
						
						System.out.println("Enter Branch Name:->");
						String branch=s.next();
						
						
						
						if(balance>=1000)
						{
							cur[i]=new Current(accountNo,name,balance,branch);
							System.out.println("Current Account was Created...!");
						}
						else
						{
							System.out.println("Account not Created(Minimum Balance less than 1000)");
						}
						
						
						
					}
					
					
					break;
				}
				
				case 3:
				{
					System.out.println("Thank You For Visiting");
					break;
				}
				
				default:
				{
					System.out.println("Plese Enter Valid Choice...!");
					break;
				}
				
			}
			
		}while(ch!=3);	
		
		System.out.println("--------------------------------------------------");
		Bank sav=new Sevings();
		
		sav.display(sev);
		double ds=sav.dcal(sev);
		
		Bank curr=new Current();
		
		
		curr.display(cur);
		
		double dc=curr.dcal(cur);
		
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("Enter Account No :-");
		int ac=s.nextInt();
		for(int i=0; i<sev.length;i++)
		{
			if(ac==sev[i].accountNo)
			{
				System.out.println("Sevings = [ Account No-"+sev[i].accountNo+" Name-"+sev[i].name+" Balance-"+sev[i].balance+" Branch-"+sev[i].branch);
			}
		}
		
		for(int i=0; i<cur.length;i++)
		{
			if(ac==cur[i].accountNo)
			{
				System.out.println("Current = [ Account No-"+cur[i].accountNo+" Name-"+cur[i].name+" Balance-"+cur[i].balance+" Branch-"+cur[i].branch);
			}
		}
		
		
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("In bank total diposit is -->"+(ds+dc));
		
		System.out.println("--------------------------------------------------");
		
		
		
		
		
	}

}
