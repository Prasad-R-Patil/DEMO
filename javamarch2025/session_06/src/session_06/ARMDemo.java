package session_06;

import java.io.*;

public class ARMDemo {
	
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("mno.txt");
				FileInputStream fis = new FileInputStream("abc.txt");)
		{
			int i;
			while((i=fis.read())!=-1)
				{
					System.out.print((char)i);
				}
		}
	}
}
