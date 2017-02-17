package greenfield;

import factory.Deck;

public class Control extends Deck {

	public Control() {
		super.setArchetype("Control");
		super.setStats(0, 100, 0, 0);
	}
}
