package modern;

import factory.Deck;

public class Merfolk extends Deck {

	public Merfolk() {
		super.setArchetype("Merfolk");
		super.setStats(30, 50, 0, 20);
	}

}
