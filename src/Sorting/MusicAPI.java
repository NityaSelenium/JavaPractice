package Sorting;

import java.util.Comparator;

public class MusicAPI {

	@Override
	public String toString() {
		return "MusicAPI [songName=" + songName + ", artistName=" + artistName + ", year=" + year + "]";
	}

	public int compareTo(MusicAPI AnotherMusic) {

		return this.getSongName().compareTo(AnotherMusic.getSongName());

	}

	public static Comparator<MusicAPI> compare = new Comparator<MusicAPI>() {

		@Override
		public int compare(MusicAPI song, MusicAPI song1) {

			if (song.getArtistName().equalsIgnoreCase(song1.getArtistName())) {

				return song.getYear().compareTo(song1.getYear());
			} else {

				return song.getArtistName().compareTo(song1.getArtistName());
			}
		}
	};

	private String songName;
	private String artistName;
	private Integer year;

	public MusicAPI(String songName, String artistName, Integer year) {

		this.songName = songName;
		this.artistName = artistName;
		this.year = year;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
