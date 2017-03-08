package swissTournamentRunner;

public class RunTourney {

	static Tournament tourney = new Tournament();

	public static void main(String[] args) {

		GUI gui = new GUI(tourney);
		tourney.setGUI(gui);
		GUI.createAndShowGUI();
		
		showCredits();
		tourney.signUpPlayers();
		int numberOfRounds = tourney.logBase2(tourney.numberOfPlayers());
		if (tourney.extraRound()) {
			numberOfRounds++;	
		}
		int i = 1;
		while (i <= numberOfRounds) {
			GUI.wipePane();
			tourney.shufflePlayers();
			tourney.updateParticipantStats();
			tourney.displayInDepthRankings();
			tourney.generatePairings();
			tourney.pollForResults(i);
			i++;
		}
		GUI.wipePane();
		GUI.postString("And that's it over!");
		GUI.postString("FINAL STANDINGS");
		GUI.postString();
		tourney.updateParticipantStats();
		tourney.displayInDepthRankings();
	}

	private static void showCredits() {
		GUI.postString("Welcome to B-T-C, the Swiss Tournament Bracket Organiser!");
		GUI.postString("(Version 1.3.1, Made by Steve Dolman)");
		GUI.postString();
	}
}
