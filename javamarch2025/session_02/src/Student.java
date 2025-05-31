public class Student {
	private int rollNo;
	private String name;
	private float marks;
	
	public Student()
	{
		System.out.println("Default Constructor Invoked!!");
		rollNo = 1;
		name = "Rahul";
		marks = 89.67f;
	}
	
	public Student(int rollNo,String name, float marks)
	{
		System.out.println("Parmeterized Constructor Called");
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.rollNo+" "+s.name+" "+s.marks);
		
		Student s1 = new Student(2,"Sayalee",98.78f);
		System.out.println(s1.rollNo+" "+s1.name+" "+s1.marks);
		
	}

}
