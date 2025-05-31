package p1;
import java.util.Scanner;
public class Person {	
	private String fname;
	private String lname;
	private int age;
	//protected Scanner s = new Scanner(System.in);
	
	/*public void getData()
	{
		System.out.println("Enter First name = ");
		fname = s.next();
		System.out.println("Enter Last name = ");
		lname = s.next();
		System.out.println("Enter Age = ");
		age = s.nextInt();
	}*/
	
	/*
	 * public void displayData() {
	 * System.out.println("Name = "+fname+" "+lname+" Age = "+age); }
	 */
	
	public void getData(String fname,String lname,int age)
	{
		System.out.println("Name = "+fname+" "+lname+" Age = "+age);
	}

}
