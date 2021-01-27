package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WordOccurance {

	public static void main(String[] args) {
		
		String str="I I LOVE LOVE LOVE INDIA INDIA INDIA INDIA";
		
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		
		String[]eachWords=str.split(" ");
		
		for(String words:eachWords) {
			
			if(hm.get(words)==null) {
				
				hm.put(words, 1);
			}else {
				hm.put(words, hm.get(words)+1);
			}
		}
		
		
		for(Entry<String, Integer>entry:hm.entrySet()) {
			
			System.out.println("The word " + entry.getKey() + " Occures " + entry.getValue() + " times." );
		}

	}

}
