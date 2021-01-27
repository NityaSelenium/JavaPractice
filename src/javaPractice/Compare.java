package javaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Compare {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Nitya", "Is", "Good", "Good", "Boy");

		List<String> list1 = Arrays.asList("Bikash", "Is", "Good", "Good", "Boy", "Nope");

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();

		for (String s : list) {

			hs.add(s);
		}


		for (String j : list1) {

			hs1.add(j);
		}

		
		hs.addAll(hs1);
		
		//hs.removeAll(hs1);
		
		
		System.out.println(hs);

	}

}
