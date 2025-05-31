package session_03;
import java.util.Scanner;
public class ArrayD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Arrays elements: ");
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
	}

}
