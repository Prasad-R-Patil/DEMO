
public class Employee 
{
	private int empId;//instance Variables
	private String empName;
	private float empSalary;
	
	public void initEmp()//member function
	{
		empId = 111;
		empName = "Rahul";
		empSalary = 12000.89f;
	}
	
	public void displayEmp()
	{
		System.out.println("Employee = "+empId+" "+empName+" "+empSalary);
	}

	public static void main(String[] args) {
		//Employee e;//reference variable
		//e = new Employee();//object creation
		Employee e = new Employee();
		System.out.println("Id = "+e.empId);
		System.out.println("Name = "+e.empName);
		System.out.println("Salary = "+e.empSalary);
		e.initEmp();
		e.displayEmp();
	}
}
