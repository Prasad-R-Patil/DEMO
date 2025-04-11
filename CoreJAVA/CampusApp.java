package campus;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import campus.academics.*;
import campus.accounts.Fees;
import campus.data.*;

public class CampusApp {
	
	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
		
		  System.out.println("Enter How Many Faculty you Want:-"); int
		  size=s.nextInt();
		  
		  
		  Fees[] stud=new Fees[size];
		  
		  for(int i=0;i<stud.length;i++) { System.out.println("Enter Student Name:-");
		  String name=s.next();
		  
		  System.out.println("Enter Student Age:-"); int age=s.nextInt();
		  
		  System.out.println("Enter Student Address:-"); String address=s.next();
		  
		  System.out.println("Enter Student RollNo:-"); int rollNo=s.nextInt();
		  
		  System.out.println("Enter Student branch:-"); String branch=s.next();
		  
		  System.out.println("Enter Student semister:-"); int semister=s.nextInt();
		  
		  System.out.println("Enter Fees Amount:-"); int amount=s.nextInt();
		  
		  System.out.println("Enter Fees Pay Date (dd/MM/yyyy):-"); String payDate=s.next();
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  Date date = sdf.parse(payDate);
		  
		 
		  
		  stud[i]=new Fees(rollNo,branch,semister,name,age,address,amount,date);
		  
		  }
		  
		  
		  Fees fs=new Fees();
		  
		  fs.calfees(stud);
		 
		
		
			/*
			 * System.out.println("Enter How Many Faculty you Want:-");
			 * 
			 * int size1=s.nextInt();
			 * 
			 * 
			 * Faculty[] fac=new Faculty[size1];
			 * 
			 * for(int i=0;i<fac.length;i++) { System.out.println("Enter Faculty  Name:-");
			 * String name=s.next();
			 * 
			 * System.out.println("Enter Faculty Age:-"); int age=s.nextInt();
			 * 
			 * System.out.println("Enter Faculty Address:-"); String address=s.next();
			 * 
			 * System.out.println("Enter Facultyid :-"); int fid=s.nextInt();
			 * 
			 * System.out.println("Enter Faculty Salary:-"); int salary=s.nextInt();
			 * 
			 * System.out.println("Enter Faculty branch:-"); String branch=s.next();
			 * 
			 * 
			 * 
			 * fac[i]=new Faculty(fid,salary,branch,name,age,address);
			 * 
			 * }
			 * 
			 * 
			 * Faculty pn=new Faculty();
			 * 
			 * pn.calSal(fac);
			 */
		
		
		
		
		
		
	}

}
