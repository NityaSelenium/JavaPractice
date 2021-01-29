package Sorting;

import java.util.Comparator;

public class ComparatorLogic implements Comparator<MusicAPI> {

	@Override
	public int compare(MusicAPI song1, MusicAPI song2) {
		
		if(song1.getYear()<song2.getYear()) {
			
			return -1;
		}
		
		if(song1.getYear()>song2.getYear()) {
			
			return +1;
		}
		
		return song1.compareTo(song2);
		
		
	}

}
