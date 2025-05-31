package p1;

public class Test1 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Person t = new Teacher();
		Teacher t1 = new Teacher();
		Person h = new HOD();
		Teacher h1 = new HOD();
		Object o = new Person();
		
		System.out.println(h1 instanceof Person);
		System.out.println(h1 instanceof Teacher);
		System.out.println(h1 instanceof HOD);
	}

}
