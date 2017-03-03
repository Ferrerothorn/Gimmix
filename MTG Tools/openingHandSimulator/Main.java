package openingHandSimulator;

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
		// Dark Dwellers
		// addThisCard("Arbor Elf", 4);
		// addThisCard("Birds of Paradise", 2);
		// addThisCard("Avalanche Riders", 1);
		// addThisCard("Acidic Slime", 2);
		// addThisCard("Goblin Dark-Dwellers", 4);
		// addThisCard("Thragtusk", 3);
		// addThisCard("Inferno Titan", 4);
		// addThisCard("Utopia Sprawl", 4);
		// addThisCard("Beast Within", 3);
		// addThisCard("Dismember", 1);
		// addThisCard("Molten Rain", 4);
		// addThisCard("Stone Rain", 4);
		// addThisCard("Mwonvuli Acid-Moss", 2);
		// addThisCard("Evolving Wilds", 4);
		// addThisCard("Forest", 11);
		// addThisCard("Mountain", 7);

		// NRG
		// addThisCard("Aether Hub", 4);
		// addThisCard("Cinder Glade", 3);
		// addThisCard("Game Trail", 4);
		// addThisCard("Forest", 6);
		// addThisCard("Mountain", 6);
		// addThisCard("Kessig Prowler", 4);
		// addThisCard("Voltaic Brawler", 4);
		// addThisCard("Longtusk Cub", 4);
		// addThisCard("Servant of the Conduit", 3);
		// addThisCard("Lathnu Hellion", 4);
		// addThisCard("Brazen Scourge", 3);
		// addThisCard("Bristling Hydra", 3);
		// addThisCard("Multiform Wonder", 2);
		// addThisCard("Fleetwheel Cruiser", 2);
		// addThisCard("Harnessed Lightning", 4);
		// addThisCard("Collective Defiance", 3);
		// addThisCard("Renegade Tactics", 2);
		// addThisCard("Attune with Aether", 2);

		// Belcher
//		addThisCard("Taiga", 1);
//		addThisCard("Elvish Spirit Guide", 4);
//		addThisCard("Simian Spirit Guide", 4);
//		addThisCard("Street Wraith", 4);
//		addThisCard("Tinder Wall", 4);
//		addThisCard("Desperate Ritual (CMC2, G3)", 4);
//		addThisCard("Empty the Warrens", 4);
//		addThisCard("Gitaxian Probe", 4);
//		addThisCard("Land Grant", 4);
//		addThisCard("Manamorphose", 4);
//		addThisCard("Pyretic Ritual (CMC2, G3)", 4);
//		addThisCard("Rite of Flame (CMC1, G2+gy)", 4);
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
		
		addThisCard("Mother of Runes", 4); 
		addThisCard("Phyrexian Revoker", 3); 
		addThisCard("Serra Avenger", 1); 
		addThisCard("Stoneforge Mystic", 4); 
		addThisCard("Thalia, Guardian of Thraben", 4); 
		addThisCard("Flickerwisp", 4); 
		addThisCard("Mirran Crusader", 3); 
		addThisCard("Recruiter of the Guard", 2); 
		addThisCard("Sanctum Prelate", 1); 
	//	addThisCard("Thalia", 2); 
		addThisCard("Swords to Plowshares", 4); 
		addThisCard("Aether Vial", 4); 
		addThisCard("Umezawa's Jitte", 1); 
		addThisCard("Sword of Fire and Ice", 1); 
		addThisCard("Batterskull", 1); 
		addThisCard("Cavern of Souls", 2); 
		addThisCard("Karakas", 3); 
		addThisCard("Plains", 10); 
		addThisCard("Wasteland", 4); 
		addThisCard("Rishadan Port", 4); 
		
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
