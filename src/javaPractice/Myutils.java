package javaPractice;

import java.util.ArrayList;

public class Myutils {
	
	public static <T> void extracted(ArrayList<T> AL) {
		for(T subject:AL) {
			
			System.out.println(subject);
		}
	}


}
