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
		
		int i = 1;
		while (i <= tourney.getNumberOfRounds()) {
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
		GUI.postString("(Version 2.3.4 - Made by Steve Dolman)");
		GUI.postString();
	}
}
