package p1;

import java.text.DecimalFormat;

public class Demo {

	public static void main(String[] args) {
		
		double d = 12.6743443;
		DecimalFormat d1 = new DecimalFormat("0.000");
		System.out.println(d1.format(d));
		
		System.out.println(String.format("%.2f", d));
				
	}
	
}
