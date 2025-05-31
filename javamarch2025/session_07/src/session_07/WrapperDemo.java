package session_07;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int no = 100;
		Integer i = new Integer(no);//primitive to Wrapper - Boxing
		
		int b = i.intValue();//Wrapper to Primitive - Unboxing
		
		String str = "20";
		int a = Integer.parseInt(str);//String to primitive
		
		Integer c = Integer.valueOf(str);//String to Wrapper	
	}
}
