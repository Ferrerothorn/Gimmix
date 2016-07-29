
public class Battle {

	Player p1;
	Player p2;

	public Battle(Player myP1, Player myP2) {
		p1 = myP1;
		p2 = myP2;
	}

	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}

	public int getPrestige() {
		return p1.getScore() + p2.getScore();
	}

}
