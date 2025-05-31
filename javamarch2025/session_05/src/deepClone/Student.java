package deepClone;

public class Student implements Cloneable {
	private int rollNo;
	private String name;
	private Course course;

	public Student(int rollNo, String name, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s =  (Student) super.clone();
		s.course = (Course) course.clone();
		return s;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Course c1 = new Course("Math", "Physics", "chemistry");
		Student s1 = new Student(1, "Sayalee",c1);
		System.out.println(s1);
		Student s2 = (Student) s1.clone();
		System.out.println(s2);
		
		s2.course.subject1 = "Electronics";
		System.out.println(s1.course.subject1);
	}

}
