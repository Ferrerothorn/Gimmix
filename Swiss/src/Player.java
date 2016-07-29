import java.util.ArrayList;

public class Player implements Comparable<Player> { // Code that models the
													// actions and behavious of
													// a Player in a tourney.
	// Implementing "Comparable" means that we can compare and sort Players by
	// their scores.

	/*
	 * The stuff listed below is the kind of stuff that every player needs. A
	 * name, a way of tracking their score, and a list of who they've already
	 * played so you don't ever replay someone.
	 */

	String name;
	int score = 0;
	int tb = 0; // How many people we've beaten who now share a score with us.
	double opps = 0; // How our previous opponents are doing. Useful for
						// tiebreakers.
	double oppsOpps = 0; //// How all our opponents' opponents are doing. Useful
							//// for tiebreakers.
	int lastDocumentedPosition = 0; // Where we last were in the rankings.
	ArrayList<Player> previousRounds = new ArrayList<Player>(); // This stores
																// the names of
																// everyone we
																// played so
																// far.
	ArrayList<Player> victories = new ArrayList<Player>(); //// This stores the
															//// names of
															//// everyone we
															//// beat so far.

	public Player(String string) { // When we make a new player, usually we just
									// need a name. Every stat/score defaults to
									// 0.
		name = string;
	}

	public Player(String myName, int myScore, int myTb, double myOpps) { // We
																			// can
																			// create
																			// a
																			// player
																			// with
																			// a
																			// starting
																			// score
																			// if
																			// we
																			// want.
																			// Useful
																			// for
																			// testing.
		name = myName;
		score = myScore;
		tb = myTb;
		opps = myOpps;
	}

	public void updatePositionInRankings(ArrayList<Player> players) { // Utility
																		// subprogram.
																		// Checks
																		// where
																		// this
																		// player
																		// is in
																		// the
																		// rankings.
		for (int i = 0; i < players.size(); i++) {
			if (this == players.get(i)) {
				lastDocumentedPosition = i + 1;
			}
		}
	}

	public void recalculateOpps() { // Utility subprogram. Recalculates how well
									// all our previous opponents have done.
		opps = 0;
		for (Player p : previousRounds) {
			opps += (double) p.victories.size() / p.previousRounds.size();
		}
		opps = opps / previousRounds.size();
		opps *= 100;
	}

	public void recalculateOppsOpps() { // Utility subprogram. Recalculates how
										// well our opponents' opponents are
										// doing.
		oppsOpps = 0;
		int people = 0;
		for (Player p : previousRounds) {
			for (Player q : p.previousRounds) {
				if (this != q) {
					oppsOpps += (double) q.victories.size() / q.previousRounds.size();
					people++;
				}
			}
		}
		if (people != 0) {
			oppsOpps = oppsOpps / people;
			oppsOpps *= 100;
		}
	}

	@Override
	public int compareTo(Player p) { // How to compare one player to another to
										// check who's score is better.
		if (this.score > p.getScore()) {
			return -1;
		} else if (this.score < p.getScore()) {
			return 1;
		} else if (this.tb > p.getTB()) {
			return -1;
		} else if (this.tb < p.getTB()) {
			return 1;
		} else if (this.opps > p.getOpps()) {
			return -1;
		} else if (this.opps < p.getOpps()) {
			return 1;
		} else if (this.oppsOpps > p.getOppsOpps()) {
			return -1;
		} else if (this.oppsOpps < p.getOppsOpps()) {
			return 1;
		}
		return 0;
	}

	public int getTB() {
		return tb;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return score;
	}

	public void beats(Player p2) { // Code that symbolises one player beating
									// another. Give the winner three points,
									// and remind both players that they played
									// each other.
		this.score = this.score + 3;
		this.logOpponent(p2);
		p2.logOpponent(this);
		this.victories.add(p2);
	}

	public void tied(Player opponent) { // Log ties. Both players get one point.
										// Otherwise similar to logging a win.
		this.score = this.score + 1;
		this.logOpponent(opponent);
		opponent.logOpponent(this);
	}

	private void logOpponent(Player foe) {
		this.previousRounds.add(foe);
	}

	public ArrayList<Player> getOpponentsList() {
		return previousRounds;
	}

	public ArrayList<Player> getListOfVictories() {
		return victories;
	}

	public void recalculateTB() {
		tb = 0;
		for (Player p : victories) {
			if (p.getScore() == this.score) {
				tb++;
			}
		}
	}

	public double getOpps() {
		return opps;
	}

	public double getOppsOpps() {
		return oppsOpps;
	}

	public int getPositionInRankings() {
		return lastDocumentedPosition;
	}

	public int getLastDocumentedPosition() {
		return lastDocumentedPosition;
	}

}