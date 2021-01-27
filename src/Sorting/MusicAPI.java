package Sorting;

public class MusicAPI implements Comparable<MusicAPI>{
	
	@Override
	public String toString() {
		return "MusicAPI [songName=" + songName + ", artistName=" + artistName + ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(MusicAPI AnotherMusic) {
		
		return this.getSongName().compareTo(AnotherMusic.getSongName());
		
		
	}

	private String songName;
	private String artistName;
	private Integer year;
	
	public MusicAPI(String songName,String artistName,Integer year){
		
		this.songName=songName;
		this.artistName=artistName;
		this.year=year;
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
