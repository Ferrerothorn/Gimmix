package factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Deck {

	String archetype = "";

	ArrayList<String> cards = new ArrayList<>();

	public String getName() {
		return archetype;
	}

	public void setArchetype(String s) {
		archetype = s;
	}

	public Deck fight(Deck opponent) {

		Collections.shuffle(cards);
		Collections.shuffle(opponent.cards);

		String myPlaystyle = this.getPlaystyle();
		String theirPlaystyle = opponent.getPlaystyle();

		if (this.archetype.equals(opponent.getArchetype())) {
			return this;
		}
		if (myPlaystyle.equals("Midrange") && theirPlaystyle.equals("Aggro")) {
			return this;
		}
		if (myPlaystyle.equals("Aggro") && theirPlaystyle.equals("Control")) {
			return this;
		}
		if (myPlaystyle.equals("Combo") && theirPlaystyle.equals("Midrange")) {
			return this;
		}
		if (myPlaystyle.equals("Control") && theirPlaystyle.equals("Combo")) {
			return this;
		}

		if ((myPlaystyle.equals("Midrange") && theirPlaystyle.equals("Combo"))) {
			return opponent;
		}
		if (myPlaystyle.equals("Aggro") && theirPlaystyle.equals("Midrange")) {
			return opponent;
		}
		if (myPlaystyle.equals("Combo") && theirPlaystyle.equals("Control")) {
			return opponent;
		}
		if (myPlaystyle.equals("Control") && theirPlaystyle.equals("Aggro")) {
			return opponent;
		}

		Random r = new Random();
		int rand = r.nextInt(2);
		if (rand == 0) {
			return this;
		}
		return opponent;
	}

	private String getPlaystyle() {
		Collections.shuffle(cards);
		return cards.get(0);
	}

	public void setStats(int i, int j, int k, int l) {
		for (int w = 0; w < i; w++) {
			cards.add("Aggro");
		}
		for (int x = 0; x < j; x++) {
			cards.add("Control");
		}
		for (int y = 0; y < k; y++) {
			cards.add("Combo");
		}
		for (int z = 0; z < l; z++) {
			cards.add("Midrange");
		}
	}

	public String getArchetype() {
		return archetype;
	}
}
