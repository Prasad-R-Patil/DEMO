
public class MyDate {
	
	private int day,month,year;
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.setDay(3);
		System.out.println("Day = "+d.getDay());
		int day = d.getDay();
		System.out.println("Day = "+day);
	}
}
