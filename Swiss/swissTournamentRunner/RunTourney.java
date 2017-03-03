package swissTournamentRunner;

public class RunTourney {

	static Tournament tourney = new Tournament();

	public static void main(String[] args) {

		GUI gui = new GUI(tourney);
		tourney.setGUI(gui);
		GUI.createAndShowGUI();
		tourney.signUpPlayers();
		int numberOfRounds = tourney.logBase2(tourney.numberOfPlayers());
		numberOfRounds++;
		int i = 1;
		while (i <= numberOfRounds) {
			GUI.wipePane();
			tourney.shufflePlayers();
			tourney.updateParticipantStats();
			tourney.displayInDepthRankings();
			tourney.generatePairings();
			tourney.pollForResults();
			i++;
		}

		GUI.postString("And that's it over!");
		GUI.postString("FINAL STANDINGS");
		GUI.postString();
		tourney.updateParticipantStats();
		tourney.displayInDepthRankings();
	}	
}
