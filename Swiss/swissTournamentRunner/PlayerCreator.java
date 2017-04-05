package swissTournamentRunner;

public class PlayerCreator {

	private Tournament t;

	public PlayerCreator(Tournament tourney) {
		t = tourney;
	}

	public void capturePlayers() {
		while (!t.allParticipantsIn) {
			t.print("Enter the name of the next participant, or enter 'no' if done.\n");
			GUI.postString("(You can enter 'help' at any time for some instructions.)");
			t.waitForUserInput();
			switch (t.userSelection.toLowerCase()) {
			case "help":
				t.userSelection = null;
				Utils.showHelp();
				break;
			case "no":
				t.allParticipantsIn = true;
				t.userSelection = null;
				break;
			default:
				if (t.userSelection.contains(",")) {
					t.addBatch(t.userSelection);
				} else if (t.userSelection.length() > t.longestPlayerNameLength) {
					t.longestPlayerNameLength = t.userSelection.length();
					t.addPlayer(t.userSelection);
				} else {
					t.addPlayer(t.userSelection);
				}
				t.userSelection = null;
			}
		}
		t.addBye();
	}
}
