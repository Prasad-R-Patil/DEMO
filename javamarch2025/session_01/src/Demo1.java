public class Demo1 {	
	public static void main(String[] args) {		
		int a = 5/2;
		System.out.println("a = "+a);//2
		
		int b = 5%2;
		System.out.println("b = "+b);//1
		
		float c =(float) 5/2;
		System.out.println("c = "+c);//1.0 1 
		
		int d = a++;
		System.out.println(d+" "+a);//2 2    2 3 
		
		int e = ++a;
		System.out.println(e+" "+a);// 3 3    3 4    4 4
		
		//System.out.println(10/0);
		System.out.println(0.0/0.0);//NaN(Not a Number)
		System.out.println(-0.0/0.0);//
		
		int h = 100;
		h += a;//h = h+a;
		System.out.println(h);
		
		int value = (a>b)?a:b;
		System.out.println("Value = "+value);
		
	}

}
