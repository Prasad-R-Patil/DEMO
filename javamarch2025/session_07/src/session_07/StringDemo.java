package session_07;
public class StringDemo {
	public static void main(String[] args) {	
		String str = "Java";
		String str1 = new String("Java");
		String str2 = "Java";
		String str3 = " java ";
			
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str == str3);
		
		str = str.concat(" Trainer");
		System.out.println(str);
		
		System.out.println("charAt = "+str.charAt(2));
		System.out.println("compareTo "+str.compareTo(str3));
		System.out.println("upperCase = "+str.toUpperCase());
		System.out.println(str3);
		System.out.println("Trim = "+str3.trim());
		System.out.println(str);
		System.out.println(str.substring(1, 5));
		
		
		
		
		
	}

}
