package legacy;

import factory.Deck;

public class FoodChain extends Deck {

	public FoodChain() {
		super.setArchetype("Food Chain");
		super.setStats(0, 0, 60, 40);
	}
}
