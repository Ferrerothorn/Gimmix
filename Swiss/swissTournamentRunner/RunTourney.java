package swissTournamentRunner;

import javax.swing.JFrame;

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
		GUI.postString("FINAL STANDINGS");
		GUI.postString();
		tourney.updateParticipantStats();
		tourney.displayInDepthRankings();
		GUI.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//TODO - admin should be able to overwrite round numbers
	//TODO - show all previous matches reported.

	private static void showCredits() {
		GUI.postString("Welcome to B-T-C, the Swiss Tournament Bracket Organiser!");
		GUI.postString("(Version 3.0.2 - Made by Steve Dolman)");
		GUI.postString("(You can enter 'help' at any time for some instructions.)");
		GUI.postString("Many thanks to debug & testing crew (@Darren Macey).");
		GUI.postString();
	}
}
