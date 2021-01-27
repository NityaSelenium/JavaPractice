package javaPractice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		
		String input="Hello World";
		
		Pattern p= Pattern.compile(" ");
		Matcher m=p.matcher(input);
		
		while(m.find()) {
			
			System.out.println(m.replaceAll("%20"));
			
		}
		
		
		
		
		
		

	}

}
