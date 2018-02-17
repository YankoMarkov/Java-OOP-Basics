package onlineRadioDatabase;

class Song {
	private String artistName;
	private String songName;
	private int minutes;
	private int seconds;
	
	public Song(String artistName, String songName, int minutes, int seconds) {
		this.setArtistName(artistName);
		this.setSongName(songName);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}
	
	public String getArtistName() {
		return this.artistName;
	}
	
	private void setArtistName(String artistName) {
		if (artistName.length() < 3 || artistName.length() > 20) {
			throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
		}
		this.artistName = artistName;
	}
	
	public String getSongName() {
		return this.songName;
	}
	
	private void setSongName(String songName) {
		if (songName.length() < 3 || songName.length() > 30) {
			throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
		}
		this.songName = songName;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	private void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 14) {
			throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
		}
		this.minutes = minutes;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	private void setSeconds(int seconds) {
		if (seconds < 0 || seconds > 59) {
			throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
		}
		this.seconds = seconds;
	}
}
