package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		MusicAPI API1 = new MusicAPI("Zara Zara mehekta hai", "Sonu Nigam", 1999);
		MusicAPI API2 = new MusicAPI("Abhi na jao chodke", "Anu Mallick", 2012);
		MusicAPI API3 = new MusicAPI("Beete Lamhe", "KK", 2000);
		MusicAPI API4 = new MusicAPI("Chamak Chalo", "Akon", 2017);

		ArrayList<MusicAPI> musicList = new ArrayList<MusicAPI>();

		musicList.add(API1);
		musicList.add(API2);
		musicList.add(API3);
		musicList.add(API4);

		for (MusicAPI music : musicList) {

			System.out.println(music);
		}
		
		ComparatorLogic logic=new ComparatorLogic();

		Collections.sort(musicList,logic);

		System.out.println("After Sorting....");

		for (MusicAPI music : musicList) {

			System.out.println(music);
		}

	}

}
