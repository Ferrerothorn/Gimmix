import java.util.ArrayList;
import java.util.Collections;

public class BelcherOpeningHand {

	static int keepableOpeningHands = 0;
	static ArrayList<String> deck;

	public static void main(String[] args) {
		deck = new ArrayList<String>();
		keepableOpeningHands = 0;
		for (int i = 0; i < 100000; i++) {
			init();
			ArrayList<String> hand = drawHand(7);
			if (keepableHand(hand, 7)) {
				keepableOpeningHands++;
			}
		}
		double actualKOH = ((double) (100 * keepableOpeningHands) / 100000);

		System.out.println("" + actualKOH + "% of hands are keepable from the off.");

		keepableOpeningHands = 0;
		for (int i = 0; i < 100000; i++) {
			init();
			ArrayList<String> hand = drawHand(7);
			if (keepableHand(hand, 6)) {
				keepableOpeningHands++;
			}
		}
		actualKOH = ((double) (100 * keepableOpeningHands) / 100000);

		System.out.println("" + actualKOH + "% of hands are keepable on a mulligan to 6.");

		keepableOpeningHands = 0;
		for (int i = 0; i < 100000; i++) {
			init();
			ArrayList<String> hand = drawHand(7);
			if (keepableHand(hand, 5)) {
				keepableOpeningHands++;
			}
		}
		actualKOH = ((double) (100 * keepableOpeningHands) / 100000);

		System.out.println("" + actualKOH + "% of hands are keepable on a mulligan to 5.");

	}

	private static ArrayList<String> drawHand(int size) {
		ArrayList<String> hand = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			hand.add(deck.remove(0));
		}
		return hand;
	}

	private static boolean keepableHand(ArrayList<String> hand, int i) {
		if ((hand.contains("Burning Wish") || hand.contains("Empty The Warrens") || hand.contains("Goblin Charbelcher"))
				&& (hand.contains("Land Grant") || hand.contains("Taiga") || hand.contains("Bayou")
						|| hand.contains("Lotus Petal") || hand.contains("Chrome Mox")
						|| hand.contains("Elvish Spirit Guide")
						|| hand.contains("Simian Spirit Guide")
								&& (hand.contains("Rite of Flame") || hand.contains("Tinder Wall")
										|| hand.contains("Dark Ritual") || hand.contains("Seething Song") || hand
												.contains("Desperate Ritual")
										|| hand.contains("Pyretic Ritual")

								))

		) {
			return true;
		} else {
			if (hand.size() > i) {
				init();
				ArrayList<String> newHand = drawHand(hand.size() - 1);
				return keepableHand(newHand, i);
			}
		}
		return false;
	}

	private static void init() {
		deck.clear();
		 addThisCard("Space", 3);
		 addThisCard("Goblin Charbelcher", 4);
		 addThisCard("Empty The Warrens", 4);
//
//		addThisCard("Burning Wish", 4);
//		addThisCard("Goblin Charbelcher", 4);
//		addThisCard("Empty The Warrens", 3);

		addThisCard("Land Grant", 4);
		addThisCard("Taiga", 1);
		addThisCard("Bayou", 1);
		addThisCard("Lotus Petal", 4);
		addThisCard("Chrome Mox", 4);
		addThisCard("Elvish Spirit Guide", 4);
		addThisCard("Simian Spirit Guide", 4);

		addThisCard("Rite of Flame", 4);
		addThisCard("Tinder Wall", 3);
		addThisCard("Dark Ritual", 4);

		addThisCard("Seething Song", 4);
		addThisCard("Desperate Ritual", 4);
		addThisCard("Pyretic Ritual", 4);
		addThisCard("Lion's Eye Diamond", 4);

		Collections.shuffle(deck);
	}

	private static void addThisCard(String cardName, int i) {
		for (int qty = 0; qty < i; qty++) {
			deck.add(cardName);
		}
	}

}
