package swissTournamentRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tournament {

	public ArrayList<Player> players = new ArrayList<>();
	public ArrayList<Battle> currentBattles = new ArrayList<>();
	public ArrayList<Battle> totallyKosherPairings = new ArrayList<>();
	Scanner sc;

	public int playerCap = 1;

	public void addPlayer(Player p1) {
		if (!p1.getName().equals("") || !p1.getName().equals("Glarren4Life")) {
			players.add(p1);
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
		String output = "";
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
		String participantString = "";
		for (int i = 1; i <= players.size(); i++) {
			participantString += rpad("" + i + ") " + players.get(i - 1).getName() + "                         ", 20)+ "   "
					+ rpad("Score: " + players.get(i - 1).getScore() + "                         ", 15)+ "   "
					+ rpad("TB: " + players.get(i - 1).getTB() + "                         ", 8)+ "   "
					+ rpad("Opp WR: " + players.get(i - 1).getOpps() + "                         ", 12)+ "    "
					+ rpad("Opp Opp WR: " + players.get(i - 1).getOppsOpps() + "                         ", 16) + '\n';
		}
		System.out.println(participantString);
	}

	public void generatePairings() {

		Player notionalBye = containsBye();

		if (notionalBye != null) {
			Collections.reverse(players);
			pairThisGuyUp(notionalBye, totallyKosherPairings);
			Collections.sort(players);
		}

		while (players.size() > 0) {
			Player p1 = players.remove(0);
			pairThisGuyUp(p1, currentBattles);
		}
		currentBattles.addAll(totallyKosherPairings);
		totallyKosherPairings.clear();
	}

	private Player containsBye() {
		Player p = null;
		for (Player player : players) {
			if (player.getName().equals("BYE")) {
				p = player;
				players.remove(player);
				break;
			}
		}
		return p;
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
			System.out.println("We had a spot of bother finding " + p1.getName() + " a partner.");
			disseminateBattles(currentBattles);
			players.add(p1);
			sortRankings(players);
			players.remove(p1);
			if (p1.getLastDocumentedPosition() > players.size() / 2) {
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

	private void printCurrentBattles() {
		for (Battle b : currentBattles) {
			System.out.println("Table " + b.getTableNumber() + ") " + b.getP1().getName() + " ("
					+ b.getP1().getPositionInRankings() + ")" + " playing " + b.getP2().getName() + " ("
					+ b.getP2().getPositionInRankings() + ")" + ".");
		}
	}

	public void pollForResults() {
		sc = new Scanner(System.in);
		System.out.println("-=-=-=-BATTLES IN PROGRESS-=-=-=-");
		assignTableNumbers(currentBattles);

		while (currentBattles.size() > 0) {
			try {
				printCurrentBattles();
				int reportUpon = sc.nextInt();
				Battle b = fetchBattle(reportUpon, currentBattles);
				currentBattles.remove(b);

				System.out.println("And who won in " + b.getP1().getName() + " vs. " + b.getP2().getName() + "?");
				System.out.println("1) " + b.getP1().getName());
				System.out.println("2) " + b.getP2().getName());
				System.out.println("3) Tied.");

				int winner = 0;
				winner = sc.nextInt();

				if (winner == 1) {
					b.getP1().beats(b.getP2());
				} else if (winner == 2) {
					b.getP2().beats(b.getP1());
				} else {
					b.getP1().tied(b.getP2());
					b.getP2().tied(b.getP1());
				}
				players.add(b.getP1());
				players.add(b.getP2());
				b = null;
				updateParticipantStats();
				displayInDepthRankings();
			} catch (Exception e) {
				System.out.println("No such table.");
			}
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

	public void closeScanner() {
		sc.close();
	}

	public void sortRankings() {
		sortRankings(players);
	}

	public static String rpad(String inStr, int finalLength) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, finalLength);

	}
}