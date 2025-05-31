package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ArrayLDemo {	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(3);
		l.add(4);
		l.add(78);	
		ListIterator<Integer> itr = l.listIterator();
		while(itr.hasPrevious())
		{
			int i = itr.previous();
			if(i == 3)
				//itr.set(11);
				//itr.remove();
				itr.add(13);
		}
		System.out.println(l);		
	}
}
