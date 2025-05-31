package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void getSum(List<? extends Number> l)
	{
		Number a = 0;
		  l.forEach(x -> { Number i = x; });
		

		/*System.out.println(l);
		int a = 0;
		for(Number i:l)
		{
			Integer sum = (Integer)i;
			a+=sum;
		}
		System.out.println("Sum = "+a);*/
	}
	
	public static void main(String[] args) {	
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//list.add(10); java.lang.UnsupportedOperationException
		Test.getSum(list);
	}
}
