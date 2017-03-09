package swissTournamentRunner;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament {

	public ArrayList<Player> players = new ArrayList<>();
	public ArrayList<Battle> currentBattles = new ArrayList<>();
	public ArrayList<Battle> totallyKosherPairings = new ArrayList<>();
	public String userSelection = null;
	public GUI gui;

	int longestPlayerNameLength = 0;

	public int playerCap = 1;

	public void signUpPlayers() {
		boolean allParticipantsIn = false;

		while (!allParticipantsIn) {
			GUI.postString("Enter the name of the next participant, or enter 'no' if done.");
			waitForUserInput();
			if (userSelection.toLowerCase().equals("no")) {
				userSelection = null;
				allParticipantsIn = true;
			} else {
				addPlayer(new Player(userSelection));
				userSelection = null;
			}
		}
		addBye();
	}

	public void addPlayer(Player p1) {
		if (p1.getName().length() > 0) {
			players.add(p1);
		}
		if (p1.getName().length() > longestPlayerNameLength) {
			longestPlayerNameLength = p1.getName().length();
		}
		playerCap++;
	}

	public int participants() {
		return players.size();
	}

	public void newTourney() {
		players.clear();
	}

	public void sortRankings(ArrayList<Player> ps) {
		Collections.sort(ps);
	}

	public String rankingsToOneBigString() {
		int i = players.size();
		i--;
		String output = "-=-=-=-Rankings-=-=-=-" + '\n';
		while (i >= 0) {
			output += players.get(i).getName();
			i--;
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
			p.recalculateTB();
			p.recalculateOpps();
			p.recalculateOppsOpps();
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
					+ rpad("Opp WR: " + players.get(i - 1).getOpps() + "                         ", 12) + "    "
					+ rpad("Opp Opp WR: " + players.get(i - 1).getOppsOpps() + "                         ", 16) + '\n';
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
		String roundString = ("-=-=-=-ROUND " + roundNumber + "-=-=-=-");
		assignTableNumbers(currentBattles);

		while (currentBattles.size() > 0) {
			try {
				printCurrentBattles(roundString);
				GUI.postString("Which game's result would you like to report?");
				GUI.postString();

				waitForUserInput();
				if (userSelection.equals("adminTools")) {
					adminTools();
				} else {

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

						if (userSelection.equals("1")) {
							b.getP1().beats(b.getP2());
							b = null;
						} else if (userSelection.equals("2")) {
							b.getP2().beats(b.getP1());
							b = null;
						} else if (userSelection.equals("3")) {
							b.getP1().tied(b.getP2());
							b.getP2().tied(b.getP1());
							b = null;
						} else {
							currentBattles.add(b);
						}
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
					GUI.wipePane();
					updateParticipantStats();
					displayInDepthRankings();
					GUI.postString();
					GUI.postString();
				}
			} catch (Exception e) {
				GUI.postString("No such table.");
				userSelection = null;
				pollForResults(roundNumber);
			}
		}
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

	public int numberOfPlayers() {
		return players.size();
	}

	public ArrayList<Player> getPlayers() {
		return players;
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

		switch (userSelection) {
		case "dropUser":
			System.out.println("Enter player name to drop.");
			print("Enter player name to drop.\n");
			userSelection = null;
			waitForUserInput();
			dropPlayer(userSelection);
			userSelection = null;
			break;
		default:
			print("Invalid admin command. Returning to tournament...\n");
			break;
		}
		userSelection = null;
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
			addPlayer(new Player("BYE"));
		}
	}

	private void huntForAndDeleteBye() {
		Boolean foundPlayerToDrop = false;
		for (Battle b : currentBattles) {
			if (b.getP1().getName().equals("BYE")) {
				currentBattles.remove(b);
				b.getP2().beats(b.getP1());
				players.remove(b.getP1());
				foundPlayerToDrop = true;
				break;
			} else if (b.getP2().getName().equals("BYE")) {
				currentBattles.remove(b);
				b.getP1().beats(b.getP2());
				players.remove(b.getP2());
				foundPlayerToDrop = true;
				break;
			}
		}

		if (!foundPlayerToDrop) {
			for (Player p : players) {
				if (p.getName().equals("BYE")) {
					players.remove(p);
				}
			}
		}
		if ((players.size() + (currentBattles.size() * 2) % 2) == 1) {
			addPlayer(new Player("BYE"));
		}
	}
}