package javaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DeleteOccurance {

	public static void main(String[] args) {

		System.out.println(Remove("backyard", 1));

	}

	public static String Remove(String str, int num) {

		char[] letters = str.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (Character letter : letters) {

			if (!hm.containsKey(letter)) {

				hm.put(letter, 1);
			} else {
				hm.put(letter, hm.get(letter) + 1);
			}

		}

		for (Entry<Character, Integer> eachLetter : hm.entrySet()) {


			if (eachLetter.getValue() == num) {

				str = str.replace(eachLetter.getKey().toString(), "");

			}

		}
		return str;

	}
}
