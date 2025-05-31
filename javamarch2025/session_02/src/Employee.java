
public class Employee {
	
	private int empId;//instance Variables
	private String empName;
	private static int count;
	
	public Employee(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
		count++;
	}
	
	public String toString()
	{
		return "Employee [ "+empId+" "+empName+"]";
	}
	
	public static int getCount()
	{
		return count;
	}
	
	static
	{
		System.out.println("Static Block Called");
		count = 101;
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		Employee e1 = new Employee(111, "rahul");
		Employee e2 = new Employee(222, "sayalee");
		Employee e3 = new Employee(333, "priyanka");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		//System.out.println("Employee Count = "+Employee.count);
		System.out.println("Count = "+Employee.getCount());
		//Classname.static_method_name();
	
		
	}
}
