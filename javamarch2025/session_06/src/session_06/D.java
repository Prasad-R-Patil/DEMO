package session_06;

import java.io.FileOutputStream;
import java.io.IOException;

public class D {
	
	public static void main(String[] args) throws IOException{
		int no = 65;
		FileOutputStream fos = null;
		try
		{
		//String str= " Hello World!!";
		fos = new FileOutputStream("c://abc.txt",true);
		fos.write(no);
		//byte[] b = str.getBytes();
		//fos.write(b);
		System.out.println("Success");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Finally Called");
		fos.close();
		}
	}

}
