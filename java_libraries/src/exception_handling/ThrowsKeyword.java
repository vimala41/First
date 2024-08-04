package exception_handling;
import java.io.*;
public class ThrowsKeyword {
     public static void display() throws FileNotFoundException
     {
    	 FileOutputStream fos=new FileOutputStream("\"C:\\Users\\Vimala\\Downloads\\Dhulepalla Vimala Resume.pdf\"");
     }
	public static void main(String[] args) {
		try {
			display();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception Occurred");
		}

	}

}
