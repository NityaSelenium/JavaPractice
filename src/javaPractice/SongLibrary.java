package javaPractice;

public class SongLibrary implements Comparable<SongLibrary> {
	
	
	@Override
	public String toString() {
		return "SongLibrary [songName=" + songName + ", movieName=" + movieName + ", year=" + year + "]";
	}
	public SongLibrary(String songName,String movieName,int year) {
		this.songName=songName;
		this.movieName=movieName;
		this.year=year;
	}
	
	private String songName;
	private String movieName;
	private Integer year;
	
	
	
	
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(SongLibrary AnotherSong) {

		return -this.getSongName().compareTo(AnotherSong.getSongName());

}
}
