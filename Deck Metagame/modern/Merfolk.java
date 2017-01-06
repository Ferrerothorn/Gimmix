package modern;

import factory.Deck;

public class Merfolk extends Deck {

	public Merfolk() {
		super.setArchetype("Merfolk");
		super.setStats(45, 45, 0, 10);
	}
}
