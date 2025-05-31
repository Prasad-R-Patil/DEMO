package p1;

import java.util.Scanner;

public class Department {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Person p = new Teacher();
		Teacher p = new Teacher();
		System.out.println("Enter First name = ");
		String fname = s.next();
		System.out.println("Enter Last name = ");
		String lname = s.next();
		System.out.println("Enter Age = ");
		int age = s.nextInt();
		System.out.println("Enter Subject = ");
		String subject = s.next();
		System.out.println("Enter Years of Experience = ");
		int years_of_exp = s.nextInt();
		p.getData(fname,lname,age,subject,years_of_exp);
	//p.displayData();
		//Person p1 = new HOD();
	}
}
