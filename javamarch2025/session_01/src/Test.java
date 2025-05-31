import java.util.Scanner;
public class Test {	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		  System.out.println("Enter a number = ");
		  int no = s.nextInt();
		  int fact = 1; 
		  for(int i=1;i<=no;i++)
		  { 
			  fact=fact*i; 
		   }
		  System.out.println("Factorial of "+no+" is "+fact);

		 System.out.println("Enter a character = ");
		 char ch = s.next().charAt(2);
		  System.out.println("Char = "+ch);
		 
		System.out.println("Enter name: ");
		String str = s.next();
		System.out.println("Name = "+str);
		
	}

}
