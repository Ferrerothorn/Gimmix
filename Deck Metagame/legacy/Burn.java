package legacy;

import factory.Deck;

public class Burn extends Deck {

	public Burn() {
		super.setArchetype("Burn");
		super.setStats(40, 0, 60, 0);
	}
}
