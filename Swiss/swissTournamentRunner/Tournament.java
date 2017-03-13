package swissTournamentRunner;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament {

	public ArrayList<Player> players = new ArrayList<>();
	public ArrayList<Battle> currentBattles = new ArrayList<>();
	public ArrayList<Battle> totallyKosherPairings = new ArrayList<>();
	public String userSelection = null;
	int numberOfRounds;
	public GUI gui;
	int longestPlayerNameLength = 0;
	int x_elimination;

	public int getX_elimination() {
		return x_elimination;
	}

	public void setX_elimination(int x_elimination) {
		this.x_elimination = x_elimination;
	}

	public void signUpPlayers() {
		boolean allParticipantsIn = false;

		while (!allParticipantsIn) {
			GUI.postString("Enter the name of the next participant, or enter 'no' if done.\n");
			waitForUserInput();
			switch (userSelection.toLowerCase()) {
			case "help":
				userSelection = null;
				showHelp();
				break;
			case "admintools":
				adminTools();
				break;
			case "no":
				allParticipantsIn = true;
				userSelection = null;
				break;
			default:
				if (userSelection.contains(",")) {
					addBatch(userSelection);
				} else if (userSelection.length() > longestPlayerNameLength) {
					longestPlayerNameLength = userSelection.length();
					addPlayer(userSelection);
				} else {
					addPlayer(userSelection);
				}
				userSelection = null;
			}
		}
		addBye();
	}

	public void addPlayer(String p1) {
		if (!containsPlayer(p1)) {
			if (p1.length() > 0) {
				players.add(new Player(p1));
			}
			if (p1.length() > longestPlayerNameLength) {
				longestPlayerNameLength = p1.length();
			}
		}
		while (numberOfRounds < logBase2(players.size())) {
			numberOfRounds++;
		}
	}

	public void newTourney() {
		players.clear();
	}

	public void sortRankings(ArrayList<Player> ps) {
		Collections.sort(ps);
	}

	public String rankingsToOneBigString() {
		String output = "-=-=-=-Rankings-=-=-=-" + '\n';
		for (Player p : players) {
			output += p.getName();
		}
		return output;
	}

	public boolean containsPlayer(String string) {
		for (Player p : players) {
			if (p.getName().equals(string)) {
				return true;
			}
		}
		return false;
	}

	public void addBye() {
		if (players.size() % 2 != 0) {
			players.add(new Player("BYE"));
		}
	}

	public void shufflePlayers() {
		Collections.shuffle(players);
	}

	public void updateParticipantStats() {
		for (Player p : players) {
			p.recalculateScore();
		}
		for (Player p : players) {
			p.recalculateTB();
		}
		for (Player p : players) {
			p.recalculateOppWr();
		}
		for (Player p : players) {
			p.recalculateBuchholz();
		}
		for (Player p : players) {
			p.recalculateOppOppWr();
		}
		sortRankings();
		for (Player p : players) {
			p.updatePositionInRankings(players);
		}
	}

	public void displayInDepthRankings() {
		String participantString = "-=-=-=-Rankings-=-=-=-" + '\n';
		for (int i = 1; i <= players.size(); i++) {
			participantString += rpad("" + i + ") " + players.get(i - 1).getName() + "                         ",
					longestPlayerNameLength + 7) + "   "
					+ rpad("Score: " + players.get(i - 1).getScore() + "                         ", 15) + "   "
					+ rpad("TB: " + players.get(i - 1).getTB() + "                         ", 8) + "   "
					+ rpad("Opp WR: " + players.get(i - 1).getOppWr() + "                         ", 12) + "    "
					+ rpad("Opp Opp WR: " + players.get(i - 1).getOppOppWr() + "                         ", 16) + "   "
					+ rpad("Buchholz: " + players.get(i - 1).getBuchholz() + "                         ", 13) + "    "
					+ '\n';
		}
		GUI.postString(participantString);
	}

	public void generatePairings() {

		while (players.size() > 0) {
			Player p1 = players.remove(0);
			pairThisGuyUp(p1, currentBattles);
		}
		currentBattles.addAll(totallyKosherPairings);
		totallyKosherPairings.clear();

		for (Battle b : currentBattles) {
			players.add(b.getP1());
			players.add(b.getP2());
		}
	}

	private void pairThisGuyUp(Player p1, ArrayList<Battle> targetBattleList) {
		try {
			boolean opponentFound = false;
			int playerIndex = 0;

			while (!opponentFound) {
				Player temp = players.get(playerIndex);
				if (!p1.getOpponentsList().contains(temp) && !temp.getOpponentsList().contains(p1)) {
					temp = players.remove(playerIndex);
					Battle b = new Battle(p1, temp);
					targetBattleList.add(b);
					break;
				}
				playerIndex++;
			}
		} catch (Exception e) {
			GUI.postString("We had a spot of bother finding " + p1.getName() + " a partner.");
			disseminateBattles(currentBattles);
			players.add(p1);
			sortRankings(players);
			players.remove(p1);
			if (p1.getPositionInRankings() > players.size() / 2) {
				Collections.reverse(players);
			}
			pairThisGuyUp(p1, totallyKosherPairings);
			sortRankings(players);
		}
	}

	private void disseminateBattles(ArrayList<Battle> battles) {
		for (Battle b : battles) {
			Player p1 = b.getP1();
			Player p2 = b.getP2();
			players.add(p1);
			players.add(p2);
			b = null;
		}
		battles.clear();
	}

	private void printCurrentBattles(String roundString) {
		GUI.postString(roundString);
		for (Battle b : currentBattles) {
			String playerOneString = b.getP1().getName() + " (" + b.getP1().getPositionInRankings()
					+ ")                          ";
			String playerTwoString = b.getP2().getName() + " (" + b.getP2().getPositionInRankings()
					+ ")                          ";

			GUI.postString(
					rpad("Table " + b.getTableNumber() + ") ", 11) + rpad(playerOneString, longestPlayerNameLength + 8)
							+ "vs.    " + rpad(playerTwoString, longestPlayerNameLength + 8));
		}
	}

	public void pollForResults(int roundNumber) {
		String roundString = ("-=-=-=-ROUND " + roundNumber + "/" + numberOfRounds + "-=-=-=-");
		assignTableNumbers(currentBattles);

		while (currentBattles.size() > 0 && players.size() > 1) {
			try {
				printCurrentBattles(roundString);
				GUI.postString("Which game's result would you like to report?");
				GUI.postString();

				waitForUserInput();

				switch (userSelection.toLowerCase()) {

				case "help":
					userSelection = null;
					showHelp();
					break;
				case "admintools":
					userSelection = null;
					adminTools();
					break;
				default:
					int reportUpon = Integer.parseInt(userSelection);
					userSelection = null;
					Battle b = fetchBattle(reportUpon, currentBattles);
					currentBattles.remove(b);

					GUI.postString("And who won in " + b.getP1().getName() + " vs. " + b.getP2().getName() + "?");
					GUI.postString("1) " + b.getP1().getName());
					GUI.postString("2) " + b.getP2().getName());
					GUI.postString("3) Tied.");

					if (!((b.getP1().getName().equals("BYE") || (b.getP2().getName().equals("BYE"))))) {

						waitForUserInput();
						handleBattleWinner(b, userSelection);
					} else {
						if (b.getP1().getName().equals("BYE")) {
							b.getP2().beats(b.getP1());
							b = null;
						} else if (b.getP2().getName().equals("BYE")) {
							b.getP1().beats(b.getP2());
							b = null;
						}
					}

					userSelection = null;
					refreshScreen();
					break;
				}
			} catch (Exception e) {
				GUI.postString("Illegal input.");
				userSelection = null;
				pollForResults(roundNumber);
			}
		}
	}

	private void refreshScreen() {
		GUI.wipePane();
		updateParticipantStats();
		displayInDepthRankings();
		GUI.postString();
		GUI.postString();
	}

	void handleBattleWinner(Battle b, String winner) {
		switch (winner) {
		case "1":
			b.getP1().beats(b.getP2());
			b = null;
			break;
		case "2":
			b.getP2().beats(b.getP1());
			b = null;
			break;
		case "3":
			b.getP1().tied(b.getP2());
			b.getP2().tied(b.getP1());
			b = null;
			break;
		default:
			currentBattles.add(b);
			break;
		}
	}

	private void showHelp() {
		GUI.wipePane();
		GUI.postString("Welcome to B-T-C.\n"
				+ "First, use the text bar below to enter the tournament's participants, one at a time.\n"
				+ "Then, pairings will be automatically generated for you, ordered by each participant's results so far.\n"
				+ "Enter numbers to the text bar to report scores for each pairing.\n\n");
		GUI.postString();
		GUI.postString(
				"At any point while polling for game results, you can enter 'adminTools' (case sensitive) to enter Administrator mode. ");
		GUI.postString(
				"You can then enter a further series of commands to alter properties of the current tournament.");
		GUI.postString("Here's the manual for all current Administrator commands:");
		GUI.postString();

		GUI.postString("drop/dropUser/dropPlayer:");
		GUI.postString("Removes the specified player (case sensitive) from the tournament.");
		GUI.postString("This doesn't affect the scores of anyone who beat this player in a previous round.");
		GUI.postString("This command can only be performed on players who have no active battle.");
		GUI.postString();

		GUI.postString("editName:");
		GUI.postString(
				"Takes in the current username (CS) of a player in the tournament, and a new name for that player.");
		GUI.postString("Scores, etc, of the renamed player are preserved.");
		GUI.postString();

		GUI.postString("batchAdd/addBatch:");
		GUI.postString(
				"Takes in a comma-separated list of usernames and adds them to the tournament in one transaction.");
		GUI.postString(
				"This can be used to insert latecomer players to the tournament - the pairing algorithm will pick up the new players at the beginning of each round.");
		GUI.postString("New players start with a score of 0.");
		GUI.postString("An example of this command in use might be 'Jimmy Page, Robert Plant, John Paul Jones'.");
		GUI.postString("Trailing and leading whitespace in a batchAdd player's name is ignored.");
		GUI.postString();

		GUI.postString("batchAdd/addBatch:");
		GUI.postString(
				"Takes in a comma-separated list of usernames and adds them to the tournament in one transaction.");
		GUI.postString(
				"This can be used to insert latecomer players to the tournament - the pairing algorithm will pick up the new players at the beginning of each round.");
		GUI.postString("New players start with a score of 0.");
		GUI.postString("An example of this command in use might be 'Jimmy Page, Robert Plant, John Paul Jones'.");
		GUI.postString("Trailing and leading whitespace in a batchAdd player's name is ignored.");
		GUI.postString();

		GUI.postString("reopenGame:");
		GUI.postString(
				"Takes in two parameters; the case-sensitive usernames of the two players whose game you'd like to reopen.");
		GUI.postString(
				"Any scores from a reopened game are reset, and the game is re-added to the Open Games list to report anew.");
		GUI.postString();
	}

	private void print(String string) {
		GUI.postString(string);
	}

	private void waitForUserInput() {
		while (userSelection == null) {
			System.out.println(userSelection);
		}
		if (userSelection.length() <= 0) {
			userSelection = null;
			waitForUserInput();
		}
	}

	private Battle fetchBattle(int reportUpon, ArrayList<Battle> cB) {
		for (Battle b : cB) {
			if (b.getTableNumber() == reportUpon) {
				return b;
			}
		}
		return null;
	}

	private void assignTableNumbers(ArrayList<Battle> bIP) {
		int index = 1;
		for (Battle b : bIP) {
			b.setTableNumber(index);
			index++;
		}
	}

	int logBase2(int x) {
		return (int) Math.ceil(Math.log(x) / Math.log(2));
	}

	public void sortRankings() {
		sortRankings(players);
	}

	public static String rpad(String inStr, int finalLength) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, finalLength);
	}

	public void setGUI(GUI gui) {
		this.gui = gui;
	}

	public String getUserSelection() {
		return userSelection;
	}

	public void setUserSelection(String userSelection) {
		this.userSelection = userSelection;
	}

	public boolean extraRound() {
		GUI.postString("Do you want to add one more round than necessary, for results certainty? (y/n)");
		waitForUserInput();
		if (userSelection.equals("Y") || userSelection.equals("y")) {
			userSelection = null;
			return true;
		} else if (userSelection.equals("N") || userSelection.equals("n")) {
			userSelection = null;
			return false;
		} else {
			userSelection = null;
			return extraRound();
		}
	}

	void adminTools() {
		userSelection = null;
		GUI.postString("Admin functions enabled.");
		waitForUserInput();
		switch (userSelection.toLowerCase()) {

		case "matches":
			print(getResultsOfAllMatchesSoFar());
			break;
		case "setrounds":
			print("Enter the new number of desired rounds for the tournament.\n");
			userSelection = null;
			waitForUserInput();
			int newNoOfRounds = Integer.parseInt(userSelection);
			if (newNoOfRounds <= players.size() - 1 && newNoOfRounds >= logBase2(players.size())) {
				setNumberOfRounds(Integer.parseInt(userSelection));
				print("Number of rounds updated to " + getNumberOfRounds() + ".");
			} else {
				print("Invalid number of rounds for a Swiss tournament.");
				print("We need to have less rounds than the number of players, and at least logBase2(number of players).");
			}
			userSelection = null;
			break;
		case "addround":
			print("Enter the new number of desired rounds for the tournament.\n");
			userSelection = null;
			waitForUserInput();
			int newNumOfRounds = Integer.parseInt(userSelection);
			if (newNumOfRounds <= players.size() - 1 && newNumOfRounds >= logBase2(players.size())) {
				setNumberOfRounds(Integer.parseInt(userSelection));
				print("Number of rounds updated to " + getNumberOfRounds() + ".");
			} else {
				print("Invalid number of rounds for a Swiss tournament.");
				print("We need to have less rounds than the number of players, and at least logBase2(number of players).");
			}
			userSelection = null;
			break;
		case "drop":
			print("Enter player name to drop.\n");
			userSelection = null;
			waitForUserInput();
			dropPlayer(userSelection);
			userSelection = null;
			break;
		case "dropplayer":
			print("Enter player name to drop.\n");
			userSelection = null;
			waitForUserInput();
			dropPlayer(userSelection);
			userSelection = null;
			break;
		case "dropuser":
			print("Enter player name to drop.\n");
			userSelection = null;
			waitForUserInput();
			dropPlayer(userSelection);
			userSelection = null;
			break;
		case "editname":
			print("Enter player whose name should be changed.\n");
			userSelection = null;
			waitForUserInput();
			String renameMe = userSelection;
			print("Enter player's new name.\n");
			userSelection = null;
			waitForUserInput();
			String newName = userSelection;
			renamePlayer(renameMe, newName);
			userSelection = null;
			break;
		case "batchadd":
			print("Enter a list of players, separated by commas.\n");
			userSelection = null;
			waitForUserInput();
			String playerList = userSelection;
			userSelection = null;
			addBatch(playerList);
			break;
		case "addbatch":
			print("Enter a list of players, separated by commas.\n");
			userSelection = null;
			waitForUserInput();
			String playersList = userSelection;
			userSelection = null;
			addBatch(playersList);
			break;
		case "reopengame":
			print("To reopen a game, first enter the name of one of the players in the game.\n");
			print("(Case sensitive)\n");
			userSelection = null;
			waitForUserInput();
			Player p1 = fetchPlayer(userSelection);
			userSelection = null;
			print("Enter the name of the other player in that game.\n");
			print("(Case sensitive)\n");
			waitForUserInput();
			Player p2 = fetchPlayer(userSelection);
			userSelection = null;
			if (p1 != null && p2 != null) {
				reopenBattle(p1, p2);
			}
			break;
		case "killall -9":
			currentBattles.clear();
			players.clear();
			break;
		case "elimination":
			print("To convert to X-Elimination, please first eter the number of losses after which a player is eliminated.\n");
			userSelection = null;
			waitForUserInput();
			setX_elimination(Integer.parseInt(userSelection));
			print("Players will be eliminated after " + getX_elimination() + " losses.");
			userSelection = null;
			currentBattles.clear();
			eliminationTournament();
			break;

		default:
			print("Invalid admin command. Returning to tournament...\n");
			break;
		}
		userSelection = null;
	}

	private void eliminationTournament() {
		while (players.size() > 1) {
			GUI.wipePane();
			shufflePlayers();
			sortRankings();
			updateParticipantStats();
			displayInDepthRankings();
			generatePairings();
			pollForResults(99);
			elimination();
		}
	}

	private Player fetchPlayer(String playerName) {
		for (Player p : players) {
			if (p.getName().equals(playerName)) {
				return p;
			}
		}
		return null;
	}

	void addBatch(String playerList) {
		String[] names = playerList.split(",");
		ArrayList<String> newPlayerNames = new ArrayList<>();
		for (String s : names) {
			newPlayerNames.add(s);
		}

		if (containsPlayer("BYE")) {
			renamePlayer("BYE", newPlayerNames.remove(0));
		}

		for (String s : newPlayerNames) {
			addPlayer(trimWhitespace(s));
			if (s.length() > longestPlayerNameLength) {
				longestPlayerNameLength = s.length();
			}
		}
		addBye();
	}

	private String trimWhitespace(String s) {
		if (s.charAt(0) == ' ' || s.charAt(0) == '\t') {
			return trimWhitespace(s.substring(1));
		}
		if (s.charAt(s.length() - 1) == ' ' || s.charAt(s.length() - 1) == '\t') {
			return trimWhitespace(s.substring(0, s.length() - 1));
		}
		return s;
	}

	private void renamePlayer(String renameMe, String newName) {
		if (newName.length() > longestPlayerNameLength) {
			longestPlayerNameLength = newName.length();
		}
		for (Player p : players) {
			if (p.getName().equals(renameMe)) {
				p.setName(newName);
				break;
			}
		}
		for (Battle b : currentBattles) {
			if (b.getP1().equals(renameMe)) {
				b.getP1().setName(newName);
				break;
			} else if (b.getP2().equals(renameMe)) {
				b.getP2().setName(newName);
				break;
			}
		}
	}

	void dropPlayer(String nameToDrop) {

		Boolean foundPlayerToDrop = false;
		for (Battle b : currentBattles) {
			if (b.getP1().getName().equals(nameToDrop) && b.getP2().getName().equals("BYE")) {
				currentBattles.remove(b);
				players.remove(b.getP1());
				players.remove(b.getP2());
				foundPlayerToDrop = true;
				break;
			} else if (b.getP2().getName().equals(nameToDrop) && b.getP1().getName().equals("BYE")) {
				currentBattles.remove(b);
				players.remove(b.getP1());
				players.remove(b.getP2());
				foundPlayerToDrop = true;
				break;
			} else if (b.getP2().getName().equals(nameToDrop) || b.getP1().getName().equals(nameToDrop)) {
				foundPlayerToDrop = true;
				print("You can't drop a player while that player's in a non-Bye battle.");
				break;
			}
		}
		if (!foundPlayerToDrop) {
			Player toDrop = null;
			for (Player p : players) {
				if (p.getName().equals(nameToDrop)) {
					foundPlayerToDrop = true;
					toDrop = p;
					break;
				}
			}
			if (toDrop != null) {
				players.remove(toDrop);
			}
		}
		if (!nameToDrop.equals("BYE")) {
			dropPlayer("BYE");
		}
		if ((players.size() + (currentBattles.size() * 2)) % 2 == 1) {
			addPlayer("BYE");
		}
		while (numberOfRounds > logBase2(players.size())) {
			numberOfRounds--;
		}
	}

	public int size() {
		return players.size();
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public void setNumberOfRounds(int numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
	}

	public int getNumberOfRounds() {
		return numberOfRounds;
	}

	public void reopenBattle(Player p1, Player p2) {
		Boolean reopen = false;
		for (Player p : p1.getOpponentsList()) {
			if (p.equals(p2)) {
				p1.getOpponentsList().remove(p);
				reopen = true;
				break;
			}
		}
		for (Player p : p2.getOpponentsList()) {
			if (p.equals(p1)) {
				p2.getOpponentsList().remove(p);
				reopen = true;
				break;
			}
		}
		for (Player p : p1.getListOfVictories()) {
			if (p.equals(p2)) {
				p1.getListOfVictories().remove(p);
				reopen = true;
				break;
			}
		}
		for (Player p : p2.getListOfVictories()) {
			if (p.equals(p1)) {
				p2.getListOfVictories().remove(p);
				reopen = true;
				break;
			}
		}
		if (reopen) {
			currentBattles.add(new Battle(p1, p2));
		}
		updateParticipantStats();
	}

	public String getResultsOfAllMatchesSoFar() {
		String results = "";
		for (Player p : players) {
			for (Player iBeat : p.getListOfVictories()) {
				results += p.getName() + " vs. " + iBeat.getName() + " (" + p.getName() + " won)\n";
			}
		}
		for (Player p : players) {
			for (Player didWeTie : p.getOpponentsList()) {
				if (!(didWeTie.getListOfVictories().contains(p) || p.getListOfVictories().contains(didWeTie))
						&& p.getOpponentsList().contains(didWeTie) && didWeTie.getOpponentsList().contains(p)) {
					results += p.getName() + " vs. " + didWeTie.getName() + " (Tied)\n";
				}
			}
		}
		return results;
	}

	public void elimination() {
		sortRankings();
		ArrayList<Player> cull = new ArrayList<>();
		for (Player p : players) {
			if (p.getOpponentsList().size() - p.getListOfVictories().size() >= x_elimination) {
				cull.add(p);
			}
		}
		for (Player p : cull) {
			players.remove(p);
		}
		dropPlayer("BYE");
		addBye();
	}
}