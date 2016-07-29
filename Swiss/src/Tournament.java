import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tournament {
	// Clusterfuck of code that models a tournament, which is really just an
	// ordered list of Players.

	public ArrayList<Player> players = new ArrayList<Player>();
	public ArrayList<Battle> currentBattles = new ArrayList<Battle>();
	public ArrayList<Battle> totallyKosherPairings = new ArrayList<Battle>();
	Scanner sc;

	public int playerCap = 1;

	public void addPlayer(Player p1) {
		if (!p1.getName().equals("") || !p1.getName().equals("Glarren4Life")) {
			players.add(p1);
		}
		playerCap++;
	}

	public int participants() { // Tells us how many players we have.
		return players.size();
	}

	public void newTourney() { // Kills all data. Used in testing.
		players.clear();
	}

	public void sortRankings(ArrayList<Player> ps) {
		Collections.sort(ps);
	}

	public String rankingsToOneBigString() { // Test subprogram. Deprecated.
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
			p.updatePositionInRankings(players);
		}
	}

	public void displayInDepthRankings() {
		for (int i = 1; i <= players.size(); i++) {
			String participantString = "" + i + ") " + players.get(i - 1).getName() + "  Score: "
					+ players.get(i - 1).getScore() + "  TB: " + players.get(i - 1).getTB() + "  Opp WR: "
					+ players.get(i - 1).getOpps() + "  Opp Opp WR: " + players.get(i - 1).getOppsOpps();
			System.out.println(participantString);
		}
	}

	public void generatePairings() {

		Player notionalBye = containsBye(players);

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

	private Player containsBye(ArrayList<Player> players2) {
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
				} else {
					playerIndex++;
				}
			}
		} catch (Exception e) { // If we hit the exception zone, we're in deep
								// shit. We've run out of suitable players.
			System.out.println("We had a spot of bother finding " + p1.getName() + " a partner.");
			disseminateBattles(currentBattles); // We then need to break apart
												// all pairings to re-pair
												// everyone. Balls.
			players.add(p1); // Start by keeping a track of the dick that messed
								// up the last pairings.
			sortRankings(players); // Sort all the players back into points
									// order before we try again.
			// boolean found = false;
			// while (found == false) { //This loop means we'll start off by
			// pairing the unpairable douche from before.
			// if (players.get(0) != p1) {
			// Player p = players.remove(0);
			// players.add(p);
			// found = true;
			// }
			// }
			players.remove(p1); // The unpairable player from before will always
								// have a really low score. (Trust me, they
								// will.)
			if (p1.getLastDocumentedPosition() > players.size() / 2) {
				Collections.reverse(players); // ...So we should reverse the
												// list of players to start off
												// with other low scorers.
			}
			pairThisGuyUp(p1, totallyKosherPairings); // if we find them a buddy
														// this time, keep them
														// aside in a separate
														// collection.
			sortRankings(players); // Put the list back in order to continue
									// pairing the people who aren't retarded.
		}
	}

	private void disseminateBattles(ArrayList<Battle> battles) { // Breaks apart
																	// pairings
																	// we
																	// generated.
																	// Used for
																	// emergency
																	// repairings.
		for (Battle b : battles) {
			Player p1 = b.getP1();
			Player p2 = b.getP2();
			players.add(p1);
			players.add(p2);
			b = null;
		}
		battles.clear();
	}

	private void printCurrentBattles() { // Prints out who's playing who each
											// round.
		int index = 0;
		for (Battle b : currentBattles) {
			index++;
			System.out.println("Table " + index + ") " + b.getP1().getName() + " (" + b.getP1().getPositionInRankings()
					+ ")" + " playing " + b.getP2().getName() + " (" + b.getP2().getPositionInRankings() + ")" + ".");
		}
	}

	public void pollForResults() { // This code presents the pairings for a
									// round, then waits on the players and
									// users to report scores.
		sc = new Scanner(System.in);
		System.out.println("-=-=-=-BATTLES IN PROGRESS-=-=-=-");

		while (currentBattles.size() > 0) {
			try {
				printCurrentBattles();
				int reportUpon = sc.nextInt(); // Choose which Table's results
												// we want to report upon.
				Battle b = currentBattles.remove(reportUpon - 1);
				System.out.println("And who won in " + b.getP1().getName() + " vs. " + b.getP2().getName() + "?");
				System.out.println("1) " + b.getP1().getName());
				System.out.println("2) " + b.getP2().getName());
				System.out.println("3) Tied.");

				int winner = 0;
				winner = sc.nextInt();

				if (winner == 1) { // Enter a 1, 2, or 3 depending on whether
									// Player 1 Won, Lost, or Tied.
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
			} catch (Exception e) {
				System.out.println("Illegal input. Please enter a NUMBER.");
			}
		}
	}

	int logBase2(int x) { // Does mathsy shit to work out how many rounds we
							// need.
		return (int) Math.ceil(Math.log(x) / Math.log(2));
	}

	public int numberOfPlayers() {
		return players.size();
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void closeScanner() { // Solves magic memory problems.
		sc.close();
	}

	public void sortRankings() { // Allows the controller Class to sort the
									// player list from externally.
		sortRankings(players);
	}

}