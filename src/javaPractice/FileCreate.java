package javaPractice;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		
		
		File f=new File("C:\\lib\\Nitya.txt");
		
		try {
			
			if( f.createNewFile()) {
				System.out.println("Success!!!");
			}
			else
		        System.out.println("Error, file already exists.");
			
		}  catch (IOException ioe) {
		      ioe.printStackTrace();

	}

}
}
