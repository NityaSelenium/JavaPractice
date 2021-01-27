package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ConvertHshmapToArrayList {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		hs.put("Amazone", 1000);
		hs.put("Walmart", 2000);
		hs.put("Accenture", 3000);
		hs.put("Google", 4000);
		hs.put("ssx", 5000);
		
		System.out.println(hs.size());
		
		
		for(Entry<String, Integer>entry:hs.entrySet()) {
			
			System.out.println(entry.getKey() + "  "  + entry.getValue());
		}
		
		//Convert Keys List to a ArrayList
		
		List<String> list=new ArrayList<String>(hs.keySet());
		
		System.out.println(list);
		
		
		

	}

}
