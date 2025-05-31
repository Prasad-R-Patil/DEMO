package session_05;

import java.util.Objects;

public class Employee extends Object{	
	private int empId;
	private String empName;

	public Employee() {}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public boolean equals(Object ob)//Object ob = e2;
	{
		Employee e = (Employee)ob;
		if((this.empId == e.empId) && (this.empName.equals(e.empName)))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.empId+1;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Rahul");
		Employee e2 = new Employee(112,"Rahul");
		/*
		 * if(e1 == e2) System.out.println("Are Equal"); else
		 * System.out.println("Are not Equal");
		 */	
		if(e1.equals(e2))
		{
			System.out.println("Objects are Equal");
		}
		else
		{
			System.out.println("Objects are not Equal");
		}
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

	
}
