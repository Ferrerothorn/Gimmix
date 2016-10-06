package landMaths;

import java.util.ArrayList;
import java.util.Collections;

public class landMathsMain {
	
	static int startWithThisManyLands = 9;
	static int testUpToThisManyLands = 35;
	
	public static void main (String[] args) {
		
		for (int i = startWithThisManyLands; i <= testUpToThisManyLands; i++) {
			System.out.println(calculateTheOddsOfHavingThreeOrFourBasicsInYourOpeningHandWithIInTheDeck(i));	
		}
	}

	private static String calculateTheOddsOfHavingThreeOrFourBasicsInYourOpeningHandWithIInTheDeck(int i) {
		
		double decentHands = 0;
		
		for (int count = 0; count < 400000; count++) {
			ArrayList<Card> deck = new ArrayList<Card>();
			ArrayList<Card> hand = new ArrayList<Card>();
			populateDeck(deck, i);
			draw(deck, hand, 8);
			if (processHand(hand)) {
				decentHands++;
			}
		}
		decentHands /= 4000;
		

		return "" + i + " of a kind in the deck gives you a " + decentHands + "% chance of having your scenario on turn 1.";
	}

	private static void draw(ArrayList<Card> deck, ArrayList<Card> hand, int i) {
		for (int h = 0; h < i; h++) {
			hand.add(deck.remove(0));
		}
	}

	private static void populateDeck(ArrayList<Card> deck, int i) {
		for (int land = 0; land < i; land++) {
			deck.add(new Card(true));
		}
		while (deck.size() < 60) {
			deck.add(new Card(false));
		}
		Collections.shuffle(deck);
	}

	private static boolean processHand(ArrayList<Card> hand) {
		int lands = 0;
		for (Card c : hand) {
			if (c.isLand()) {
				lands++;
			}
		}
		return (lands == 3 || lands == 4);
	}
}
