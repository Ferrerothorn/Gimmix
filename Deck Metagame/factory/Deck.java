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

		ArrayList<String> myPlays = this.getPlaystyle();
		ArrayList<String> theirPlays = opponent.getPlaystyle();

		int myScore = 0;

		while (myPlays.size() > 0 && theirPlays.size() > 0) {
			String myCard = myPlays.remove(0);
			String theirCard = theirPlays.remove(0);

			if (myCard.equals("Midrange") && theirCard.equals("Aggro")) {
				myScore++;
			}
			if (myCard.equals("Aggro") && theirCard.equals("Control")) {
				myScore++;
			}
			if (myCard.equals("Combo") && theirCard.equals("Midrange")) {
				myScore++;
			}
			if (myCard.equals("Control") && theirCard.equals("Combo")) {
				myScore++;
			}
			if (theirCard.equals("Midrange") && myCard.equals("Aggro")) {
				myScore--;
			}
			if (theirCard.equals("Aggro") && myCard.equals("Control")) {
				myScore--;
			}
			if (theirCard.equals("Combo") && myCard.equals("Midrange")) {
				myScore--;
			}
			if (theirCard.equals("Control") && myCard.equals("Combo")) {
				myScore--;
			}
		}

		if (myScore > 0) {
			return this;
		}
		if (myScore < 0) {
			return opponent;
		}

		Random r = new Random();
		int rand = r.nextInt(2);
		if (rand == 0) {
			return this;
		}
		return opponent;
	}

	private ArrayList<String> getPlaystyle() {
		ArrayList<String> gamePlan = new ArrayList<>();
		Collections.shuffle(cards);

		for (int i = 0; i < 15; i++) {
			gamePlan.add(cards.get(i));
		}
		return gamePlan;
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
