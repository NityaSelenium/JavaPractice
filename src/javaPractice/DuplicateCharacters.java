package javaPractice;

import java.util.LinkedHashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		LinkedHashMap<Character, Integer> hm = extracted("TTRREE");
		
		System.out.println(hm);

	}

	private static LinkedHashMap<Character, Integer> extracted(String str) {
		
		
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			Character c=str.charAt(i);
			
			if(hm.get(c)==null) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}
			
		}
		return hm;
	}

}
