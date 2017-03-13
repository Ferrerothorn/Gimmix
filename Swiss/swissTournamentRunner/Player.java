package swissTournamentRunner;

import java.util.ArrayList;
import java.util.Collections;

public class Player implements Comparable<Player> {

	String name;
	int score = 0;
	int tb = 0;
	double oppWr = 0;
	int buchholz = 0;
	double oppOppWr = 0;
	int lastDocumentedPosition = 0;
	ArrayList<Player> previousRounds = new ArrayList<>();
	ArrayList<Player> victories = new ArrayList<>();

	public Player(String string) {
		name = string;
	}

	public Player(String myName, int myScore, int myTb, double myOppWr, int myBuchholz, int myOppOppWr) {
		name = myName;
		score = myScore;
		tb = myTb;
		oppWr = myOppWr;
		buchholz = myBuchholz;
		oppOppWr = myOppOppWr;
	}

	public void updatePositionInRankings(ArrayList<Player> players) {

		for (int i = 0; i < players.size(); i++) {
			if (this == players.get(i)) {
				lastDocumentedPosition = i + 1;
			}
		}
	}

	public void recalculateOppWr() {
		oppWr = 0;
		for (Player p : previousRounds) {
			oppWr += (double) p.victories.size() / p.previousRounds.size();
		}
		oppWr = oppWr / previousRounds.size();
		oppWr *= 100;
	}

	public void recalculateOppOppWr() {
		oppOppWr = 0;
		int people = 0;
		for (Player p : previousRounds) {
			for (Player q : p.previousRounds) {
				if (this != q) {
					oppOppWr += (double) q.victories.size() / q.previousRounds.size();
					people++;
				}
			}
		}
		if (people != 0) {
			oppOppWr = oppOppWr / people;
			oppOppWr *= 100;
		}
	}

	@Override
	public int compareTo(Player p) {
		if (this.name.equals("BYE")) {
			return 1;
		} else if (p.getName().equals("BYE")) {
			return -1;
		} else if (this.score > p.getScore()) {
			return -1;
		} else if (this.score < p.getScore()) {
			return 1;
		} else if (this.tb > p.getTB()) {
			return -1;
		} else if (this.tb < p.getTB()) {
			return 1;
		} else if (this.oppWr > p.getOppWr()) {
			return -1;
		} else if (this.oppWr < p.getOppWr()) {
			return 1;
		} else if (this.oppOppWr > p.getOppOppWr()) {
			return -1;
		} else if (this.oppOppWr < p.getOppOppWr()) {
			return 1;
		} else if (this.buchholz > p.getBuchholz()) {
			return -1;
		} else if (this.buchholz < p.getBuchholz()) {
			return 1;
		}
		return 0;
	}

	int getBuchholz() {
		return buchholz;
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
		this.logOpponent(p2);
		p2.logOpponent(this);
		this.victories.add(p2);
		this.recalculateScore();
		p2.recalculateScore();
	}

	public void tied(Player p2) {
		this.logOpponent(p2);
		p2.logOpponent(this);
		this.recalculateScore();
		p2.recalculateScore();

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

	public double getOppWr() {
		return oppWr;
	}

	public double getOppOppWr() {
		return oppOppWr;
	}

	public int getPositionInRankings() {
		return lastDocumentedPosition;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void recalculateScore() {
		score = (3 * victories.size());
		for (Player p : previousRounds) {
			if (!victories.contains(p) && !p.victories.contains(this)) {
				score++;
			}
		}
	}

	public void recalculateBuchholz() {
		this.buchholz = 0;
		ArrayList<Integer> scoresOfMyFoes = new ArrayList<>();
		for (Player p : this.getOpponentsList()) {
			scoresOfMyFoes.add(p.getScore());
		}
		if (scoresOfMyFoes.size() >= 3) {
			Collections.sort(scoresOfMyFoes);
			scoresOfMyFoes.remove(0);
			scoresOfMyFoes.remove(scoresOfMyFoes.size() - 1);
			for (int i : scoresOfMyFoes) {
				this.buchholz += i;
			}
		}
	}

}