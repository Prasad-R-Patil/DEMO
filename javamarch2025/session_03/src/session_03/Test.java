package session_03;

import java.util.Scanner;
public class Test {	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int size = s.nextInt();
		Student stud[] = new Student[size];
		
		System.out.println("Enter Student details: ");
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter Student"+(i+1)+" data = ");
			System.out.println("Enter Rollno = ");
			int rn = s.nextInt();
			System.out.println("Enter Name = ");
			String nm = s.next();
			System.out.println("Enter Marks1 = ");
			int m1 = s.nextInt();
			System.out.println("Enter Marks2 = ");
			int m2 = s.nextInt();
			System.out.println("Enter Marks3 = ");
			int m3 = s.nextInt();
			
			stud[i] = new Student(rn,nm,m1,m2,m3);
		}
		
		/*System.out.println("Students are as follows:  ");
		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i].getRn()+" "+stud[i].getNm()+""
			+ " "+stud[i].getM1()+" "+stud[i].getM2()+" "+stud[i].getM3());
		}*/
		
		Student.getMarksObtained(stud);
	}

}
