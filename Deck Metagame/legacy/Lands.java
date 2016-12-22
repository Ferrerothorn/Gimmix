package legacy;

import factory.Deck;

public class Lands extends Deck {

	public Lands() {
		super.setArchetype("Lands");
		super.setStats(0, 80, 20, 0);
	}
}
