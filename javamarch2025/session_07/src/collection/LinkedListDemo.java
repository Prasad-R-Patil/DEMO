package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {	
	public static void main(String[] args) {	
		LinkedList<String> l = new LinkedList<String>();
		l.add("Rahul");
		//l.add(null);
		l.add("Sayalee");
		l.add("rohan");
		l.add("Priyanka");
		l.add("Rohan");
		/*System.out.println(l);
		
		l.add(1, "Mayur");
		System.out.println(l);
		
		l.set(2, "Chitali");
		System.out.println(l);
		
		l.addFirst("Monica");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);*/
		
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			//String s = (String) itr.next();
			String s = itr.next();
			if(s.equals("rohan"))
				itr.remove();
		}
		System.out.println(l);	
	}
}
