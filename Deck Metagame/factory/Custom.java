package factory;

public class Custom extends Deck {

	public Custom(int aggro, int control, int combo, int midrange) {
		this.setArchetype("Custom");
		this.setStats(aggro, control, combo, midrange);
	}
}