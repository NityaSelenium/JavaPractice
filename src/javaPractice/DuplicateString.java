package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str="I I I I LOVE LOVE INDIA INDIA INDIA INDIA";
		
		String[]eachwords=str.split(" ");
		
		
		LinkedHashMap<String, Integer> hs=new LinkedHashMap<String, Integer>();
		
		
		for(String words:eachwords) {
			
			if(hs.get(words)==null) {
				
				hs.put(words, 1);
			}else {
				hs.put(words, hs.get(words)+1);
			}
			
		}
		
		for(Entry<String, Integer>wordsseq:hs.entrySet()) {
			
			System.out.println("The word " + wordsseq.getKey() + " occures " + wordsseq.getValue() + " Times");
		}

	}

}
