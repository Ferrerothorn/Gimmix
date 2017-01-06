package swissTournamentRunner;

import java.util.ArrayList;

public class Player implements Comparable<Player> {

	String name;
	int score = 0;
	int tb = 0;
	double opps = 0;
	double oppsOpps = 0;
	int lastDocumentedPosition = 0;
	ArrayList<Player> previousRounds = new ArrayList<>();
	ArrayList<Player> victories = new ArrayList<>();

	public Player(String string) {
		name = string;
	}

	public Player(String myName, int myScore, int myTb, double myOpps) {
		name = myName;
		score = myScore;
		tb = myTb;
		opps = myOpps;
	}

	public void updatePositionInRankings(ArrayList<Player> players) {
		for (int i = 0; i < players.size(); i++) {
			if (this == players.get(i)) {
				lastDocumentedPosition = i + 1;
			}
		}
	}

	public void recalculateOpps() {
		opps = 0;
		for (Player p : previousRounds) {
			opps += (double) p.victories.size() / p.previousRounds.size();
		}
		opps = opps / previousRounds.size();
		opps *= 100;
	}

	public void recalculateOppsOpps() {
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

	public void beats(Player p2) {
		this.score = this.score + 3;
		this.logOpponent(p2);
		p2.logOpponent(this);
		this.victories.add(p2);
	}

	public void tied(Player opponent) {
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