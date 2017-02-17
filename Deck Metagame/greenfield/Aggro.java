package greenfield;

import factory.Deck;

public class Aggro extends Deck {

	public Aggro() {
		super.setArchetype("Aggro");
		super.setStats(100, 0, 0, 0);
	}

}
