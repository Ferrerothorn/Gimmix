package deckMetagame.units.factory;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Deck {

	String name = "";
	String job = "";

	int aggroRatio = 0;
	int controlRatio = 0;
	int comboRatio = 0;
	int midrangeRatio = 0;

	ArrayList<String> playstyles = new ArrayList<String>();

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

		Collections.shuffle(playstyles);
		Collections.shuffle(opponent.playstyles);

		String myPlaystyle = this.getPlaystyle();
		String theirPlaystyle = opponent.getPlaystyle();

		if (myPlaystyle.equals(theirPlaystyle)) {
			if (this.playstyles.toString().equals(this.playstyles.toString())) {
				return this;
			} else {
				this.fight(opponent);
			}
		} else {
			if ((myPlaystyle.equals("Midrange") && theirPlaystyle.equals("Aggro"))
					|| (myPlaystyle.equals("Aggro") && theirPlaystyle.equals("Control"))
					|| (myPlaystyle.equals("Combo") && theirPlaystyle.equals("Midrange"))
					|| (myPlaystyle.equals("Control") && theirPlaystyle.equals("Combo"))) {
				return this;
			}
			if ((myPlaystyle.equals("Aggro") && theirPlaystyle.equals("Midrange"))
					|| (myPlaystyle.equals("Control") && theirPlaystyle.equals("Aggro"))
					|| (myPlaystyle.equals("Midrange") && theirPlaystyle.equals("Combo"))
					|| (myPlaystyle.equals("Combo") && theirPlaystyle.equals("Control"))) {
				return this;
			}
		}
		return this;
	}

	private String getPlaystyle() {
		Collections.shuffle(playstyles);
		return playstyles.get(0);
	}

	public void setStats(int i, int j, int k, int l) {
		aggroRatio = i;
		controlRatio = j;
		comboRatio = k;
		midrangeRatio = l;
		populatePlaystyles();
	}

	private void populatePlaystyles() {
		for (int i = 0; i < aggroRatio; i++) {
			playstyles.add("Aggro");
		}
		for (int i = 0; i < controlRatio; i++) {
			playstyles.add("Control");
		}
		for (int i = 0; i < comboRatio; i++) {
			playstyles.add("Aggro");
		}
		for (int i = 0; i < midrangeRatio; i++) {
			playstyles.add("Midrange");
		}
	}

	public void printDetailedDescription(int i) {
		// TODO Auto-generated method stub

	}
}
