package session_03;

public class Student {
	
	private int rn;
	private String nm;
	private float m1,m2,m3;
	
	//generate Parameterized constructor, getters and setters and toString
	public Student(int rn, String nm, float m1, float m2, float m3) {
		
		this.rn = rn;
		this.nm = nm;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}

	
	public String toString() {
		return "Student [rn=" + rn + ", nm=" + nm + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	public static void getMarksObtained(Student s[])
	{
		for(int i=0;i<s.length;i++)
		{
			float marks = s[i].getM1()+s[i].getM2()+s[i].getM2();
			System.out.println(s[i].getRn()+" "+s[i].getNm()+""
					+ " "+s[i].getM1()+" "+s[i].getM2()+" "+s[i].getM3()+" "+marks);
		}
		
	}

}
