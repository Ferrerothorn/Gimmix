package swissTournamentRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Tournament {

	public ArrayList<Player> players = new ArrayList<>();
	public ArrayList<Battle> currentBattles = new ArrayList<>();
	public ArrayList<Battle> totallyKosherPairings = new ArrayList<>();
	boolean allParticipantsIn = false;
	public int topCutThreshold = 0;
	public int numberOfRounds;
	public int roundNumber = 1;
	public GUI gui;
	int x_elimination = 99;
	Boolean isElimination = false;
	public String activeMetadataFile = "TournamentInProgress.tnt";

	public int getX_elimination() {
		return x_elimination;
	}

	public void setX_elimination(int x_elimination) {
		this.x_elimination = x_elimination;
		isElimination = true;
	}

	public void signUpPlayers() {
		if (activeMetadataFile.equals("TournamentInProgress.tnt")) {
			print("Enter the name of this tournament.");

			while (!allParticipantsIn) {

			}
			activeMetadataFile = GUI.textField.getText();
			if (!activeMetadataFile.contains(".tnt")) {
				activeMetadataFile += ".tnt";
			}
		}

		File file = new File(activeMetadataFile);
		if (file.exists()) {
			try {
				TntFileManager.loadTournament(this, activeMetadataFile);
				refreshScreen();
			} catch (IOException e) {
				GUI.postString("Error reading supplied file, starting at line: \"" + "\"");
			}
		} else {
			PlayerCreator playerCreator = new PlayerCreator(this);
			playerCreator.capturePlayers();
		}
	}

	public void addPlayer(String p1) {
		if (containsPlayer("BYE")) {
			renamePlayer("BYE", p1);
		}

		if (!containsPlayer(p1)) {
			if (p1.length() > 0) {
				players.add(new Player(p1));
			}
		}
		while (numberOfRounds < logBase2(players.size())) {
			numberOfRounds++;
		}
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
			p.recalculateOppOppWr();
		}
		for (Player p : players) {
			p.recalculateOppositionTBSum();
		}
		sortRankings();
		for (Player p : players) {
			p.updatePositionInRankings(players);
		}
	}

	public void generatePairings(int attempts) {

		if (currentBattles.size() == 0) {

			while (players.size() > 0 && attempts <= 100) {
				Player p1 = players.remove(0);
				pairThisGuyUp(p1, currentBattles, attempts);
			}
			currentBattles.addAll(totallyKosherPairings);
			totallyKosherPairings.clear();

			if (attempts > 100) {
				abort();
				Utils.print(GUI.generateInDepthRankings(players));
			} else {
				for (Battle b : currentBattles) {
					players.add(b.getP1());
					players.add(b.getP2());
				}
			}
		}
		GUI.refresh();
	}

	public void pairThisGuyUp(Player p1, ArrayList<Battle> targetBattleList, int attempts) {
		try {
			boolean opponentFound = false;
			int playerIndex = 0;

			while (!opponentFound) {
				Player temp = players.get(playerIndex);
				if (isElimination || (!p1.getOpponentsList().contains(temp) && !temp.getOpponentsList().contains(p1))) {
					temp = players.remove(playerIndex);
					Battle b = new Battle(p1, temp);
					targetBattleList.add(b);
					break;
				}
				playerIndex++;
			}
		} catch (Exception e) {
			if (attempts >= 100) {
				players.add(p1);
				abort();
			} else {
				disseminateBattles(currentBattles);
				players.add(p1);
				sortRankings(players);
				players.remove(p1);
				if (p1.getPositionInRankings() > players.size() / 2) {
					Collections.reverse(players);
				}
				pairThisGuyUp(p1, totallyKosherPairings, attempts + 1);
				sortRankings(players);
			}
		}
	}

	void abort() {
		disseminateBattles(currentBattles);
		disseminateBattles(totallyKosherPairings);
		sortRankings();
		allParticipantsIn = false;
	}

	public void disseminateBattles(ArrayList<Battle> battles) {
		for (Battle b : battles) {
			Player p1 = b.getP1();
			Player p2 = b.getP2();
			players.add(p1);
			players.add(p2);
			b = null;
		}
		battles.clear();
	}

	public void pollForResults() {
		assignTableNumbers(currentBattles);

		while (currentBattles.size() > 0 && allParticipantsIn) {
			String roundString = ("-=-=-=-ROUND " + roundNumber + "/" + numberOfRounds + "-=-=-=-");

			print("Click a button above to report that player as the game winner.");

			try {
				GUI.resultsBox.setCaretPosition(0);

			} catch (Exception e) {
				print("Illegal input.");
				pollForResults();
			}
		}
	}

	public void refreshScreen() {
		GUI.wipePane();
		GUI.paintButtons();
		GUI.refresh();
		updateParticipantStats();
		printRankings(GUI.generateInDepthRankings(players));
		print();
		print();
	}

	private void printRankings(String generateInDepthRankings) {
		GUI.printRankings(generateInDepthRankings);
	}

	public void print() {
		GUI.postString("");
	}

	public void print(String string) {
		GUI.postString(string);
	}

	public void assignTableNumbers(ArrayList<Battle> bIP) {
		int index = 1;
		for (Battle b : bIP) {
			b.setTableNumber(index);
			index++;
		}
	}

	int logBase2(int x) {
		int base = (int) Math.ceil(Math.log(x) / Math.log(2));
		if (base > 0) {
			return (int) Math.ceil(Math.log(x) / Math.log(2));
		}
		return 0;
	}

	public void sortRankings() {
		sortRankings(players);
	}

	public void setGUI(GUI gui) {
		this.gui = gui;
	}

	public void adminTools(String[] command) {
		print("Admin functions enabled.");
		switch (command[1].toLowerCase()) {

		case "topcut":
			int tC = Integer.parseInt(command[2]);
			if (tC < players.size()) {
				setTopCut(tC);
			} else {
				print("Invalid - Top Cut size is too large.");
			}
			break;
		case "matchesof":
			String showHistory = command[2];
			printHistory(showHistory);
			break;
		case "roundrobin":
			generateRRpairings();
			break;
		case "load":
			String fileName = command[2];
			if (!fileName.contains(".tnt")) {
				fileName += ".tnt";
			}
			File loadFrom = new File(fileName);
			if (loadFrom.exists()) {
				try {
					TntFileManager.loadTournament(this, fileName);
					refreshScreen();
				} catch (IOException e) {
					print("Error loading file.");
				}
			} else {
				print("That file doesn't exist - check again.");
			}
			break;
		case "matches":
			print(getResultsOfAllMatchesSoFar());
			break;
		case "addround":
			int newNoOfRounds = Integer.parseInt(command[2]);
			if (newNoOfRounds < players.size() && newNoOfRounds >= logBase2(players.size())) {
				setNumberOfRounds(newNoOfRounds);
				print("Number of rounds updated to " + getNumberOfRounds() + ".");
			} else {
				print("Invalid number of rounds for a Swiss tournament.");
				print("We need to have less rounds than the number of players, and at least logBase2(number of players).");
			}
			break;
		case "drop":
			String dropMe = command[2];
			dropPlayer(dropMe);
			break;
		case "editname":
			String renameMe = command[2];
			String newName = command[3];
			renamePlayer(renameMe, newName);
			break;
		case "add":
			String playersList = command[2];
			addBatch(playersList);
			break;
		case "reopengame":
			String p1name = command[2];
			String p2name = command[3];
			Player p1 = findPlayerByName(p1name);
			Player p2 = findPlayerByName(p2name);
			if (p1 != null && p2 != null) {
				reopenBattle(p1, p2);
			}
			break;
		case "killall -9":
			currentBattles.clear();
			players.clear();
			break;
		case "elimination":
			setX_elimination(Integer.parseInt(command[2]));
			print("Players will be eliminated after " + getX_elimination() + " losses.");
			currentBattles.clear();
			break;
		default:
			print("Invalid admin command. Returning to tournament...\n");
			break;
		}
	}

	private void printHistory(String showHistory) {
		Player p = findPlayerByName(showHistory);
		if (p.getOpponentsList().size() > 0) {
			for (String s : p.getListOfNamesPlayed()) {
				String output = showHistory + " vs. " + s + " (";
				if (p.getListOfNamesBeaten().contains(s)) {
					output += p.getName();
				} else {
					output += s;
				}
				output += " won)";
				print(output);
			}
		}
	}

	private void generateRRpairings() {
		currentBattles.clear();
		for (Player p : players) {
			p.getOpponentsList().clear();
			p.getListOfVictories().clear();
		}
		this.setNumberOfRounds(1);
		this.roundNumber = 1;

		for (Player p : players) {
			for (Player q : players) {
				if (p != q && noSuchPairing(currentBattles, p, q)) {
					currentBattles.add(new Battle(p, q));
				}
			}
		}
		assignTableNumbers(currentBattles);
	}

	private boolean noSuchPairing(ArrayList<Battle> battles, Player p, Player q) {
		boolean doesntExist = true;
		for (Battle b : battles) {
			if ((b.getP1().equals(p) || b.getP2().equals(p)) && (b.getP1().equals(q) || b.getP2().equals(q))) {
				doesntExist = false;
			}
		}
		return doesntExist;
	}

	public void parseProperties(String line) {
		try {
			String[] propertyPair = line.split(":");
			switch (propertyPair[0]) {

			case "On Round":
				roundNumber = Integer.parseInt(propertyPair[1]);
				break;
			case "numberOfRounds":
				numberOfRounds = Integer.parseInt(propertyPair[1]);
				break;
			case "elimination":
				setX_elimination(Integer.parseInt(propertyPair[1]));
				elimination();
				break;
			case "topCut":
				int tC = Integer.parseInt(propertyPair[1]);
				if (tC < players.size()) {
					setTopCut(tC);
				}
				break;
			default:
				break;
			}
		} catch (Exception e) {
			GUI.postString("Error reading supplied file, starting at line: \"" + line + "\".");
		}
	}

	private void setTopCut(int parseInt) {
		topCutThreshold = parseInt;
	}

	Battle parseLineToBattle(String line) {
		String[] currentCombatants = line.split(",");
		Player p1 = findPlayerByName(currentCombatants[0]);
		Player p2 = findPlayerByName(currentCombatants[1]);
		Battle b = new Battle(p1, p2);
		return b;
	}

	public void addGamesToPlayerHistory(String line) {
		try {
			String[] information = line.split("_");
			Player p = findPlayerByName(information[0]);

			String hasBeaten = information[1];
			hasBeaten = hasBeaten.replaceAll("\\[", "");
			hasBeaten = hasBeaten.replaceAll("\\]", "");
			String[] playersBeaten = hasBeaten.split(",");
			for (String s : playersBeaten) {
				if (s.length() > 0) {
					p.addToListOfVictories(findPlayerByName(trimWhitespace(s)));
				}
			}

			String hasPlayed = information[2];
			hasPlayed = hasPlayed.replaceAll("\\[", "");
			hasPlayed = hasPlayed.replaceAll("\\]", "");
			String[] playersPlayed = hasPlayed.split(",");
			for (String s : playersPlayed) {
				if (s.length() > 0) {
					p.addToListOfPlayed(findPlayerByName(trimWhitespace(s)));
				}
			}
		} catch (Exception e) {
			GUI.postString("Error reading supplied file, starting at line: \"" + line + "\".");
		}
	}

	public Player findPlayerByName(String s) {
		for (Player p : players) {
			if (p.getName().equals(s)) {
				return p;
			}
		}
		return new Player(s);
	}

	public void addBatch(String playerList) {
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
		}
		if (allParticipantsIn) {
			addBye();
		}
	}

	private String trimWhitespace(String s) {
		if (s.length() == 0) {
			return s;
		}
		if (s.charAt(0) == ' ' || s.charAt(0) == '\t') {
			return trimWhitespace(s.substring(1));
		}
		if (s.charAt(s.length() - 1) == ' ' || s.charAt(s.length() - 1) == '\t') {
			return trimWhitespace(s.substring(0, s.length() - 1));
		}
		return s;
	}

	public void renamePlayer(String renameMe, String newName) {
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

	public void dropPlayer(String nameToDrop) {

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

		if (topCutThreshold >= players.size()) {
			topCutThreshold = 0;
		}

		if (!nameToDrop.equals("BYE") && (players.size() % 2 == 1) && !containsPlayer("BYE")) {
			addPlayer("BYE");
		} else if (!nameToDrop.equals("BYE")) {
			dropPlayer("BYE");
		}

		if ((players.size() % 2 == 1) && containsPlayer("BYE")) {
			Battle byeMatch = null;
			for (Battle b : currentBattles) {
				if (b.getP1().getName().equals("BYE")) {
					byeMatch = b;
					b.getP2().beats(b.getP1());
					b = null;
				} else if (b.getP2().getName().equals("BYE")) {
					byeMatch = b;
					b.getP1().beats(b.getP2());
					b = null;
				}
			}
			if (byeMatch != null) {
				currentBattles.remove(byeMatch);
			}
			dropPlayer("BYE");
		}

		if (!isElimination) {
			while (numberOfRounds > players.size()) {
				numberOfRounds--;
			}
		}
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public void setNumberOfRounds(int newNumberOfRounds) {
		numberOfRounds = newNumberOfRounds;
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
		Eliminator elim = new Eliminator(players, this);
		elim.eliminate();
	}

	public void setAllParticipantsIn(boolean b) {
		allParticipantsIn = b;
	}

	public void reportBattleWinner(String text) {
		Player winner = findPlayerByName(text);
		for (Battle b : currentBattles) {
			if (b.contains(winner)) {
				if (b.getP1() == winner) {
					Utils.handleBattleWinner(b, "1");
				} else {
					Utils.handleBattleWinner(b, "2");
				}
				currentBattles.remove(b);
				break;
			}
		}
	}

	public void parseLine(String text) {
		String[] command = text.split(" ");

		for (String s : command) {
			s = trimWhitespace(s);
		}

		if (allParticipantsIn) {
			switch (command[0].toLowerCase()) {
			case "admintools":
				adminTools(command);
				break;
			case "help":
				Utils.showHelp();
				break;
			}
		} else {
			if(text.toLowerCase().equals("no")){
				allParticipantsIn = true;
			}
			else if(text.contains(",")) {
				addBatch(text);
			}
			else {
				addPlayer(text);
			}
		}
	}
}