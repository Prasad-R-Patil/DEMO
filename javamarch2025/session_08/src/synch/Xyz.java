package synch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Xyz {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		System.out.println(l);
		List list = Collections.synchronizedList(l);
		list.add('C');
		System.out.println(list);
		System.out.println(l);
		
		Integer a = l.get(2);
		System.out.println("a = "+a);
		//l.add(new Integer("abc"));
		//l.add(new Integer('C'));
		//System.out.println(l);
		
	}

}
