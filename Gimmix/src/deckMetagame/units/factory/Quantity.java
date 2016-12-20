package deckMetagame.units.factory;

public class Quantity implements Comparable<Quantity>{
	
	String name;
	int qty;
	
	public Quantity(String myName, int myInt) {
		name = myName;
		qty = myInt;
	}

	public Object getName() {
		return name;
	}

	@Override
	public int compareTo(Quantity o) {
		if (this.qty > o.qty) {
			return -1;
		}
		return 1;
	}
	
	public String get() {
		return name + ": " + qty;
	}

}
