class Date {	
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	public static void swapDates(Date d1,Date d2)
	{
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("In Swapping ----->");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}
	
	public static void main(String[] args) {
		Date d1 = new Date(1,4,2025);
		Date d2 = new Date(2,5,2024);
		System.out.println("Before Swapping ----->");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		Date.swapDates(d1, d2);
		System.out.println("After Swapping ----->");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}		
}



