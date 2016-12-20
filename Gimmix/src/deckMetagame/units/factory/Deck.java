package deckMetagame.units.factory;

public abstract class Deck {

	String name = "";
	String job = "";
	
	int aggroRatio = 0;
	int controlRatio = 0;
	int comboRatio = 0;
	int midrangeRatio = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setArchetype(String s) {
		job = s;
	}

	public Deck fight(Deck opponent) {

		Deck victor = null;

		if (this.getJob().equals(opponent.getJob())) {

		} else {
		}
		return victor;
	}

	public void setStats(int i, int j, int k, int l) {
		aggroRatio = i;
		controlRatio = j;
		comboRatio = k;
		midrangeRatio = l;
	}
}
