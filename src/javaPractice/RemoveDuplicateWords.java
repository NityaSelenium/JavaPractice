package javaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String str = "I I I LOVE LOVE LOVE     LOVE INDIA    INDIA  INDIA INDIA INDIA NITYA NITYA";

		/*
		 * Since the words are separated by space, we will split the string by one or
		 * more space
		 */
		String[] words = str.split("\\s+");

		// To Remove Duplicate Words
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(Arrays.asList(words));

		// join the words again by spaces

		StringBuilder sf = new StringBuilder();
		int index = 0;

		for (String s : lhs) {
			if (index > 0)

		    sf.append(" ");

			sf.append(s);

			index++;

		}

		str = sf.toString();

		System.out.println(str);

	}

}
