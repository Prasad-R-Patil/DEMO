package session_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(new java.util.Date());
		
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sf.format(d);//formatting- date to string
		System.out.println(str);
		
		Date d1 = sf.parse(str);//Parsing - string to Date
		System.out.println(d1);
	}

}
