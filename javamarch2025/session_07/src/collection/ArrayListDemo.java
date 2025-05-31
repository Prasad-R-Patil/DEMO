package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		System.out.println(a.isEmpty());
		a.add(10);
		// a.add("abc");//CTE
		a.add(null);
		a.add(20);
		// a.add(10.2);
		a.add(20);
		/*
		 * System.out.println(a); a.remove(3); System.out.println(a);
		 * System.out.println(a.get(2)); System.out.println(a.size());
		 */
		
		  List l = Collections.synchronizedList(a); 
		  System.out.println(l);
		  System.out.println(l.addAll(a));
		  System.out.println(a);
		 

			/*
			 * List<Integer> l = new ArrayList<Integer>(); l.add(10); l.add(20); l.add(3);
			 * l.add(4);
			 * 
			 * //l.add(a);
			 * 
			 * System.out.println(l);
			 * 
			 * System.out.println("----------------"); System.out.println(a.removeAll(l));
			 * 
			 * System.out.println(a); System.out.println(l);
			 */
		
		
		
		
		/*
		 * l.clear(); System.out.println(l); System.out.println(a);
		 */
		
		

		/*
		 * System.out.println("------------"); l.clear(); System.out.println(l);
		 * System.out.println(a);
		 * 
		 * 
		 * a.removeAll(l); System.out.println(a); System.out.println(l);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(a.contains(10));
		 */

	}

}
