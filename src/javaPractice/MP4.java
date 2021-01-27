package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		SongLibrary lib1 = new SongLibrary("Muskurane Ki Wajah", "CityLights", 2013);
		SongLibrary lib2 = new SongLibrary("Wajah Tum Ho", "Hate Story 4", 2014);
		SongLibrary lib3 = new SongLibrary("Tum Bin", "Tum Bin", 1995);
		SongLibrary lib4 = new SongLibrary("Tujhe Dekha To Ye", "DDLJ", 1992);
		SongLibrary lib5 = new SongLibrary("Sawa Sawa Mahia", "KKKG", 2000);
		SongLibrary lib6 = new SongLibrary("Aori Gori Akhio Wali", "Mohawatain", 2012);

		ArrayList<SongLibrary> MP4List = new ArrayList<SongLibrary>();

		MP4List.add(lib1);
		MP4List.add(lib2);
		MP4List.add(lib3);
		MP4List.add(lib4);
		MP4List.add(lib5);
		MP4List.add(lib6);

		Myutils.extracted(MP4List);

		System.out.println("After Sort...");

		Collections.sort(MP4List);

		Myutils.extracted(MP4List);
		
		lib1.equals(lib2);

	}

}
