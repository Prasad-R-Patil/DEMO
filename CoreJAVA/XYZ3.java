package Assignment03;

import java.util.Scanner;

public class XYZ3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of  College Student:->");
		int size=s.nextInt();
		
		Student cs[]=new CollegeStudent[size];
		
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("Enter RollNO:->");
			
			int rollNo=s.nextInt();
			
			System.out.println("Enter Percentage:->");
			
			float percentage=s.nextFloat();
			
			
			System.out.println("Enter Which Semister:->");
			int semister=s.nextInt();
			
			
			
			
			cs[i]=new CollegeStudent(rollNo,percentage,semister);
		}
		
		
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter number of School Student:->");
		int size1=s.nextInt();
		
		Student ss[]=new SchoolStudent[size1];
		
		for(int i=0;i<ss.length;i++)
		{
			System.out.println("Enter RollNO:->");
			
			int rollNo=s.nextInt();
			
			System.out.println("Enter Percentage:->");
			
			float percentage=s.nextFloat();
			
			
			System.out.println("Enter Class :->");
			int ClassName=s.nextInt();
			
			
			
			
			
			
			ss[i]=new SchoolStudent(rollNo,percentage,ClassName);
		}
		
		Student css=new CollegeStudent();
		
		Student sss=new SchoolStudent();
		
		css.show(cs);
		
		sss.show(ss);
		
		
		
		System.out.println("---------------------------------------------------------------------");
		Scanner s2=new Scanner(System.in);
		
		System.out.println("Enter RollNo You Want To Find Student:->");
		
		int rn=s2.nextInt();
		
		System.out.println("---------------------------------------------------------------------");
		boolean flag=false;
		
		for(int i=0;i<cs.length;i++)
		{
			if(cs[i].rollNo==rn)
			{
				flag=true;
				if(css  instanceof CollegeStudent)
				{
					System.out.println("Student is College Student....! ");
				}
				else
				{
					System.out.println("Student is not College Student....! ");
				}
			}
			
			
			
		}
		
		if(flag==false)
		{
			System.out.println("College Student Not Found....!");
			
		}
		
		
		
		System.out.println("---------------------------------------------------------------------");
		
		flag=false;
		
		
		
		for(int i=0;i<ss.length;i++)
		{
			if(ss[i].rollNo==rn)
			{
				flag=true;
				if(sss  instanceof SchoolStudent)
				{
					System.out.println("Student is School Student....! ");
				}
				else
				{
					System.out.println("Student is not School Student....! ");
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("School Student Not Found....!");
			
		}
		
		
		
				
		System.out.println("---------------------------------------------------------------------");
		
		
	}

}
