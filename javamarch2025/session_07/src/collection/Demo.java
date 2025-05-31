package collection;
import java.util.ArrayList;
import java.util.Collections;
public class Demo {	
	public static void main(String[] args) {
		Collections.sort(null);
		ArrayList a = new ArrayList();
		a.add(10);
		System.out.println(a.add(20));
		a.add("abc");
		a.add('C');
		a.add(10);
		
		for(Object o:a)
		{
			System.out.println(o);
		}
		String str = (String) a.get(0);//RTE - ClassCastException
		int i = (int) a.get(2);
	}
}
