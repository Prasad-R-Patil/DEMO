
public class Addition {

	public int add(int... a)
	{
		System.out.println("Length = "+a.length);
		int sum = 0;
		/*
		 * for(int i=0;i<a.length;i++) { sum+=a[i]; }
		 */
		//for-each loop - Syntax: for(dataType varNm:array/collection){}
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		int addition = a.add(10, 20);
		System.out.println("Addition = "+addition);
		System.out.println("Sum = "+a.add(3, 1, 2));
		
	}

}
