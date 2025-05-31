package session_07;

public class Demo {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.append(" Program");
		System.out.println(sb);
		/*
		 * sb.reverse(); System.out.println(sb);
		 */
		sb.insert(4, " Trainer");
		System.out.println(sb);
		/*sb.delete(4, 10);
		System.out.println(sb);*/
		sb.replace(4, 12, "Infoway");
		System.out.println(sb);
		
	}

}
