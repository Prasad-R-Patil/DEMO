package session_07;

import java.util.regex.Pattern;

public class Demo3 {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("..a", "ja"));
		System.out.println(Pattern.matches("[^abc]", "a"));
		
		
		
	}

}
