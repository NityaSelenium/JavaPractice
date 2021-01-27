package javaPractice;

import java.io.CharConversionException;

public class WordOutput {
	
	
	public static boolean CompareString(String First, String Second) {
		
		
		if(First.compareTo(Second)==0) {
			
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(CompareString("Nitya", "nitya"));
		
	
		
		

	}

}
