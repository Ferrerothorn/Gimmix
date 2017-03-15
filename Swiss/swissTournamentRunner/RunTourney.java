package swissTournamentRunner;

public class RunTourney {

	static Tournament tourney = new Tournament();

	public static void main(String[] args) {

		GUI gui = new GUI(tourney);
		tourney.setGUI(gui);
		GUI.createAndShowGUI();

		showCredits();
		tourney.signUpPlayers();
		int numberOfRounds = tourney.logBase2(tourney.size());
		if (tourney.extraRound()) {
			numberOfRounds++;
		}
		tourney.setNumberOfRounds(numberOfRounds);

		tourney.roundNumber = 1;
		while (tourney.roundNumber <= tourney.getNumberOfRounds() && tourney.players.size() > 1) {
			GUI.wipePane();
			tourney.shufflePlayers();
			tourney.updateParticipantStats();
			tourney.displayInDepthRankings();
			tourney.generatePairings();
			tourney.pollForResults(tourney.roundNumber);
			if (tourney.isElimination) {
				tourney.elimination();
			}
			tourney.roundNumber++;
		}
		GUI.wipePane();
		GUI.postString("FINAL STANDINGS");
		GUI.postString();
		tourney.updateParticipantStats();
		tourney.displayInDepthRankings();
		GUI.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static void showCredits() {
		GUI.postString("Welcome to B-T-C, the Swiss Tournament Bracket Organiser!");
		GUI.postString("(Version 4.0.2 - Made by Steve Dolman)");
		GUI.postString("Shoutout to Rachel Dolman and Darren Macey for help in testing and debug.");
		GUI.postString("(You can enter 'help' at any time for some instructions.)");
		GUI.postString();
	}
}
