package penguin;

public class Main {

	public static void main(String[] args) {
		
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		p1.setOpponent(p2);
		p2.setOpponent(p1);
		
		while (p1.isAlive() && p2.isAlive()) {
			p1.takeTurn();
			p2.takeTurn();
		}
		
		if (p1.isAlive() && !p2.isAlive()) {
			System.out.println("P1 wins!");
		}
		else {
			System.out.println("P2 wins!");
		}
		
		
	}

}
