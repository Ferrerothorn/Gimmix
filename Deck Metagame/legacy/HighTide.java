package legacy;

import factory.Deck;

public class HighTide extends Deck {

	public HighTide() {
		super.setArchetype("High Tide");
		super.setStats(0, 20, 80, 0);
	}
}
