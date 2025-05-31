package p1;
public class Teacher extends Person{
	private String subject;
	private int years_of_exp;
	
	/*
	 * public void getData() 
	 * { super.getData();
	 * System.out.println("Enter Subject = "); 
	 * subject = s.next();
	 * System.out.println("Enter Years of Experience = "); 
	 * years_of_exp = s.nextInt(); 
	 * }
	 * 
	 * public void displayData() 
	 * { 
	 * super.displayData();
	 * System.out.println("Subject = "+subject+" Years of Exp = "+years_of_exp); 
	 * }
	 */
	
	public void getData(String fname,String lname,int age,String subject, 
			int years_of_exp)
	{
		super.getData(fname, lname, age);
		 System.out.println("Subject = "+subject+
				 " Years of Exp = "+years_of_exp);
	}
}
