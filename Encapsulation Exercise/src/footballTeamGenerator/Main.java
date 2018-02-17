package footballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Team> teams = new HashMap<>();
		
		String inputs;
		
		while (!(inputs = read.readLine()).equals("END")) {
			String[] input = inputs.split(";");
			String teamName = input[1];
			Team team = new Team(teamName);
			Player player = null;
			String playerName = "";
			
			try {
				switch (input[0]) {
					case "Team":
						teams.putIfAbsent(teamName, team);
						break;
					case "Add":
						playerName = input[2];
						int endurance = Integer.valueOf(input[3]);
						int sprint = Integer.valueOf(input[4]);
						int dribble = Integer.valueOf(input[5]);
						int passing = Integer.valueOf(input[6]);
						int shooting = Integer.valueOf(input[7]);
						player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
						if (!teams.containsKey(teamName)) {
							System.out.printf("Team %s does not exist.", teamName);
						} else {
							teams.get(teamName).addPlayer(player);
						}
						break;
					case "Remove":
						playerName = input[2];
						if (!teams.containsKey(teamName)) {
							System.out.printf("Team %s does not exist.", teamName);
						} else {
							teams.get(teamName).removePlayer(playerName);
						}
						break;
					case "Rating":
						if (!teams.containsKey(teamName)) {
							System.out.printf("Team %s does not exist.", teamName);
						} else {
							teams.get(teamName).addRating();
							System.out.println(teams.get(teamName));
						}
						break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
