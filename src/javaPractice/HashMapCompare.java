package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("India", "Delhi");
		map1.put("Orissa", "Bhubaneswar");
		map1.put("Bihar", "Patna");
		map1.put("US", "Washinton");
		
		
		HashMap<String, String> map2=new HashMap<String, String>();
		map2.put("India", "Delhi");
		map2.put("Orissa", "Bhubaneswar");
		map2.put("Bihar", "Patna");
		map2.put("US", "Washinton");
		map2.put("UK", "London");
		
		
		
		
		HashSet<String> hs=new HashSet<String>(map1.values());
		hs.addAll(map2.values());
		hs.removeAll(map1.values());
		
		System.out.println(hs);
		
		//System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList(map2.values())));
		
		
		
		

	}

}
