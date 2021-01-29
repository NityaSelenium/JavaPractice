package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		MusicAPI API1 = new MusicAPI("Zara Zara mehekta hai", "KK", 1999);
		MusicAPI API2 = new MusicAPI("Azhi na jao chodke", "KK", 2012);
		MusicAPI API3 = new MusicAPI("Azeete Lamhe", "KK", 2000);
		MusicAPI API4 = new MusicAPI("Abamak Chalo", "KK", 2001);

		ArrayList<MusicAPI> musicList = new ArrayList<MusicAPI>();

		musicList.add(API1);
		musicList.add(API2);
		musicList.add(API3);
		musicList.add(API4);

		for (MusicAPI music : musicList) {

			System.out.println(music);
		}
		
		//ComparatorLogic logic=new ComparatorLogic();

		Collections.sort(musicList,MusicAPI.compare);

		System.out.println("After Sorting....");

		musicList.forEach(System.out::println);

	}

}
