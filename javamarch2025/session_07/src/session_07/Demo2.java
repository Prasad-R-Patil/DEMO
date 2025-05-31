package session_07;

public class Demo2 {
	public static void main(String[] args) {
		
	String str = "Java is ObjeOct Oriented Language";
	//String[] s = str.split("\\s");
	String[] s = str.split("O");
	/*
	 * for(String s1:s) { System.out.println(s1); }
	 */
	for(int i=0;i<s.length;i++)
	{
		System.out.println(i+" "+s[i]);
	}
}
}

