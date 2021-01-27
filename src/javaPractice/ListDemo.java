package javaPractice;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> AL=new ArrayList<String>();
		
		AL.add("History");
		AL.add("English");
		AL.add("Science");
		AL.add("Geography");
		AL.add("Math");
		AL.add("Geology");
		AL.add("History");
		
		Myutils.extracted(AL);

	}

	
}
