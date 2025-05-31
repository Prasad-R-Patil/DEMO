package session_05;
public final class Student {	
	private final int rollNo;
	private final String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
public static void main(String[] args) {
		Student s = new Student(1, "Rahul");
		s.rollNo = 100;	
	}
}
