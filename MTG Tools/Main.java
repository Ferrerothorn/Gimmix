
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static ArrayList<String> deck = new ArrayList<>();
	static ArrayList<String> hand = new ArrayList<>();
	static boolean on = true;
	static int turnNumber = 1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		populateDeck();
		drawAHand(7);
		Collections.sort(hand);
		echoGameState();

		while (on) {
			System.out.println("Turn " + turnNumber + ".");
			breakDownHand();
			System.out.println("777) Mulligan.");
			System.out.println("0) Draw a card.");
			System.out.println();
			int choice = sc.nextInt();
			choice--;
			if (choice == 776) {
				int handSize = hand.size();
				deck.addAll(hand);
				hand.clear();
				Collections.shuffle(deck);
				handSize--;
				drawAHand(handSize);
			} else if (choice == -1) {
				hand.add(deck.remove(0));
				turnNumber++;
			} else if (!(choice > hand.size())) {
				hand.remove(choice);
			}
		}
	}

	private static void breakDownHand() {
		int i = 1;
		for (String s : hand) {
			System.out.println("" + i + ") " + s);
			i++;
		}
	}

	private static void echoGameState() {
		if (deck.size() + hand.size() != 60) {
			System.out.println("This deck is incomplete. (" + (deck.size() + hand.size()) + ")");
			on = false;
		} else {
			System.out.println(hand.toString());
		}
	}

	private static void drawAHand(int handSize) {
		for (int i = 0; i < handSize; i++) {
			hand.add(deck.remove(0));
		}
	}

	private static void populateDeck() {
		// Belcher
//		addThisCard("Taiga", 1);
//		addThisCard("Elvish Spirit Guide", 4);
//		addThisCard("Simian Spirit Guide", 4);
//		addThisCard("Seething Song", 4);
//		addThisCard("Tinder Wall", 4);
//		addThisCard("Desperate Ritual", 4);
//		addThisCard("Empty the Warrens", 4);
//		addThisCard("Gitaxian Probe", 4);
//		addThisCard("Land Grant", 4);
//		addThisCard("Manamorphose", 4);
//		addThisCard("Pyretic Ritual", 4);
//		addThisCard("Rite of Flame", 4);
//		addThisCard("Chrome Mox", 3);
//		addThisCard("Goblin Charbelcher", 4);
//		addThisCard("Lion's Eye Diamond", 4);
//		addThisCard("Lotus Petal", 4);

//		addThisCard("Mountain", 10); 
//		addThisCard("Rishadan port", 4); 
//		addThisCard("Wasteland", 4); 
//		addThisCard("Cavern of Souls", 4); 
//		addThisCard("Aether Vial", 4); 
//		addThisCard("Tarfire", 3); 
//		addThisCard("Goblin Lackey", 4); 
//		addThisCard("Mogg War Marshal", 4); 
//		addThisCard("Goblin Piledriver", 4); 
//		addThisCard("Stingscourger", 1); 
//		addThisCard("Krenko-Mob Boss", 1); 
//		addThisCard("Siege-Gang Commander", 1); 
//		addThisCard("Goblin Warchief", 4); 
//		addThisCard("Gempalm Incinerator", 4); 
//		addThisCard("Goblin Matron", 4); 
//		addThisCard("Goblin Ringleader", 4); 
//		
		
//		addThisCard("Mother of Runes", 4); 
//		addThisCard("Phyrexian Revoker", 3); 
//		addThisCard("Serra Avenger", 1); 
//		addThisCard("Stoneforge Mystic", 4); 
//		addThisCard("Thalia, Guardian of Thraben", 4); 
//		addThisCard("Flickerwisp", 4); 
//		addThisCard("Mirran Crusader", 3); 
//		addThisCard("Recruiter of the Guard", 2); 
//		addThisCard("Sanctum Prelate", 1); 
//	//	addThisCard("Thalia", 2); 
//		addThisCard("Swords to Plowshares", 4); 
//		addThisCard("Aether Vial", 4); 
//		addThisCard("Umezawa's Jitte", 1); 
//		addThisCard("Sword of Fire and Ice", 1); 
//		addThisCard("Batterskull", 1); 
//		addThisCard("Cavern of Souls", 2); 
//		addThisCard("Karakas", 3); 
//		addThisCard("Plains", 10); 
//		addThisCard("Wasteland", 4); 
//		addThisCard("Rishadan Port", 4); 
		
		addThisCard("Burning Wish", 4);
		addThisCard("Goblin Charbelcher", 4);
		addThisCard("Empty The Warrens", 3);
		addThisCard("Land Grant", 4);
		addThisCard("Taiga", 1);
		addThisCard("Bayou", 1);
		addThisCard("Seething Song", 4);
		addThisCard("Desperate Ritual", 4);
		addThisCard("Pyretic Ritual", 4);
		addThisCard("Rite of Flame", 4);
		addThisCard("Lotus Petal", 4);
		addThisCard("Chrome Mox", 4);
		addThisCard("Lion's Eye Diamond", 4);
		addThisCard("Elvish Spirit Guide", 4);
		addThisCard("Simian Spirit Guide", 4);
		addThisCard("Tinder Wall", 3);
		addThisCard("Dark Ritual", 4);


		
//		addThisCard("Emrakul", 4); 
//		addThisCard("Griselbrand", 4); 
//		addThisCard("Brainstorm", 4); 
//		addThisCard("Gitaxian Probe", 2); 
//		addThisCard("Ponder", 4); 
//		addThisCard("Preordain", 4); 
//		addThisCard("Spell Pierce", 3); 
//		addThisCard("Show and Tell", 4); 
//		addThisCard("Force of Will", 4); 
//		addThisCard("Lotus Petal", 4); 
//		addThisCard("Sneak Attack", 4); 
//		addThisCard("Ancient Tomb", 3); 
//		addThisCard("City of Traitors", 2); 
//		addThisCard("Island", 3); 
//		addThisCard("Mountain", 1); 
//		addThisCard("Fetchlands", 7); 
//		addThisCard("Volcanic Island", 3); 

		
		
		
		Collections.shuffle(deck);
	}

	private static void addThisCard(String cardName, int i) {
		for (int qty = 0; qty < i; qty++) {
			deck.add(cardName);
		}
	}
}
