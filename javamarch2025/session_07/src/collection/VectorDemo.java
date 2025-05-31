package collection;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		//Vector v = new Vector(20);
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
		/*(System.out.println(v);
		v.add('A');
		
		System.out.println(v);
		System.out.println(v.capacity());
		*/
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			int i =(int) e.nextElement();
			if(i%2 == 0)
				System.out.println(i);
		}
		
		System.out.println(v);	
	}
}
