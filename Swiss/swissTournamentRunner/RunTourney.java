package swissTournamentRunner;

public class RunTourney {

	static Tournament tourney = new Tournament();

	public static void main(String[] args) {

		GUI gui = new GUI(tourney);
		tourney.setGUI(gui);
		GUI.createAndShowGUI(true);

		showCredits();
		tourney.signUpPlayers();
		tourney.allParticipantsIn = true;

		while (tourney.roundNumber <= tourney.getNumberOfRounds() && tourney.players.size() > 1) {
			GUI.wipePane();
			tourney.shufflePlayers();
			tourney.updateParticipantStats();
			GUI.postString(GUI.generateInDepthRankings(tourney.players));
			tourney.generatePairings(0);
			tourney.pollForResults();
			if (tourney.isElimination) {
				tourney.elimination();
			} else {
				tourney.roundNumber++;
			}
		}
		TntFileManager.saveTournament(tourney);
		GUI.wipePane();
		GUI.postString("FINAL STANDINGS");
		GUI.postString();
		tourney.updateParticipantStats();
		GUI.postString(GUI.generateInDepthRankings(tourney.players));
	}

	private static void showCredits() {
		GUI.postString("Welcome to B-T-C, the Swiss Tournament Bracket Organiser!");
		GUI.postString("(Version 7.0.1 - Made by Steve Dolman)");
		GUI.postString("Shoutout to Rachel Dolman and Darren Macey for help in testing and debug.");
		GUI.postString();
	}
}
