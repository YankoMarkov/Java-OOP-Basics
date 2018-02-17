package onlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		int totalSeconds = 0;
		int songsCounter = 0;
		
		for (int i = 0; i < num; i++) {
			String[] inputs = read.readLine().split(";");
			String artistName = inputs[0];
			String songName = inputs[1];
			String[] minutesAndSeconds = inputs[2].split(":");
			try {
				int minutes = Integer.valueOf(minutesAndSeconds[0]);
				int seconds = Integer.valueOf(minutesAndSeconds[1]);
				Song song = new Song(artistName, songName, minutes, seconds);
				totalSeconds += seconds + (minutes * 60);
				songsCounter++;
				System.out.println("Song added.");
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid song length.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Songs added: " + songsCounter);
		System.out.println("Playlist length: " + convertSeconds(totalSeconds));
	}
	
	private static String convertSeconds(int totalSeconds) {
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600) / 60;
		int seconds = totalSeconds % 60;
		
		return String.format("%dh %dm %ds", hours, minutes, seconds);
	}
}
