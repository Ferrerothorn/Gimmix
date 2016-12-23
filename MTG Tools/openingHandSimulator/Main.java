package openingHandSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static ArrayList<String> deck = new ArrayList<String>();
	static ArrayList<String> hand = new ArrayList<String>();
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
			System.out.println("This deck is incomplete. (" + deck.size() + hand.size() + ")");
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

		// SUPERFRIENDS
		// addThisCard("Chandra, Flamecaller", 2);
		// addThisCard("Xenagos, The Reveler", 1);
		// addThisCard("Gideon Jura", 1);
		// addThisCard("Gideon, Champion of Justice", 1);
		// addThisCard("Jace, Unraveler of Secrets", 1);
		// addThisCard("Kiora, Master of the Depths", 2);
		// addThisCard("Ajani Vengeant", 2);
		// addThisCard("Sarkhan Unbroken", 2);
		// addThisCard("Nissa, Voice of Zendikar", 2);
		// addThisCard("Ob Nixilis Reignited", 1);
		// addThisCard("Sorin, Grim Nemesis", 2);
		// addThisCard("Tamiyo, Field Researcher", 2);
		// addThisCard("Nicol Bolas, Planeswalker", 1);
		// addThisCard("Deploy the Gatewatch", 4);
		// addThisCard("Languish", 2);
		// addThisCard("Oath of Nissa", 4);
		// addThisCard("Oath of Gideon", 2);
		// addThisCard("Oath of Jace", 1);
		// addThisCard("Oath of Liliana", 3);
		// addThisCard("Shambling Vent", 2);
		// addThisCard("Needle Spires", 1);
		// addThisCard("Hissing Quagmire", 2);
		// addThisCard("Lumbering Falls", 1);
		// addThisCard("Wandering Fumarole", 1);
		// addThisCard("Canopy Vista", 2);
		// addThisCard("Cinder Glade", 2);
		// addThisCard("Yavimaya Coast", 1);
		// addThisCard("Prairie Stream", 1);
		// addThisCard("Smoldering Marsh", 1);
		// addThisCard("Sunken Hollow", 1);
		// addThisCard("Forest", 3);
		// addThisCard("Island", 1);
		// addThisCard("Mountain", 1);
		// addThisCard("Swamp", 1);
		// addThisCard("Plains", 1);
		// addThisCard("Evolving Wilds", 2);

		//MUD
//		addThisCard("Lodestone Golem", 4);
//		addThisCard("Smokestack", 4);
//		addThisCard("Cloudpost", 4);
//		addThisCard("Metalworker", 4);
//		addThisCard("Tangle Wire", 4);
//		addThisCard("Glimmerpost", 4);
//		addThisCard("Steel Hellkite", 3);
//		addThisCard("Trinisphere", 4);
//		addThisCard("Thespian's Stage", 4);
//		addThisCard("Wurmcoil Engine", 1);
//		addThisCard("Thorn of Amethyst", 4);
//		addThisCard("Crystal Vein", 4);
//		addThisCard("Winter Orb", 2);
//		addThisCard("Inventor's Fair", 4);
//		addThisCard("Expedition Map", 3);
//		addThisCard("Buried Ruin", 4);
//		addThisCard("Ghirapur Orrery", 1);
//		addThisCard("Staff of Nin", 1);
//		addThisCard("Bottled Cloister", 1);

		//Maverick
		// addThisCard("Birds of Paradise", 4);
		// addThisCard("Dryad Arbor", 1);
		// addThisCard("Scavenging Ooze", 2);
		// addThisCard("Scryb Ranger", 1);
		// addThisCard("Tarmogoyf", 1);
		// addThisCard("Qasali Pridemage", 3);
		// addThisCard("Thalia, Guardian of Thraben", 3);
		// addThisCard("Stoneforge Mystic", 4);
		// addThisCard("Scute Mob", 1);
		// addThisCard("Xantid Swarm", 1);
		// addThisCard("Mother of Runes", 4);
		// addThisCard("Swords to Plowshares", 4);
		// addThisCard("Green Sun's Zenith", 4);
		// addThisCard("Life from the Loam", 1);	
		// addThisCard("Sylvan Library", 1);
		// addThisCard("Batterskull", 1);
		// addThisCard("Sword of Feast and Famine", 1);
		// addThisCard("Umezawa's Jitte", 1);
		// addThisCard("Forest", 4);
		// addThisCard("Plains", 4);
		// addThisCard("Nykthos, Shrine to Nyx", 1);	
		// addThisCard("Maze of Ith", 1);		
		// addThisCard("Evolving Wilds", 4);
		// addThisCard("Sunpetal Grove", 4);
		// addThisCard("Canopy Vista", 4);
		
		
		// Shardless BUG
		addThisCard("Shardless Agent", 4);
		addThisCard("Tarmogoyf", 4);
		addThisCard("Deathrite Shaman", 4);
		addThisCard("Baleful Strix", 3);
		addThisCard("Leovold EoTt", 2);
		
		addThisCard("Ancestral Vision", 4);
		addThisCard("Brainstorm", 4);
		addThisCard("Abrupt Decay", 4);
		addThisCard("Force of Will", 3);
		addThisCard("Jace TMS", 2);
		addThisCard("Hymn to Tourach", 2);
		addThisCard("Toxic Deluge", 1);
		addThisCard("Sylvan Library", 1);
		addThisCard("Golgari Charm", 1);

		addThisCard("Opulent Palace", 4);
		addThisCard("Evolving Wilds", 4);
		addThisCard("Island", 2);
		addThisCard("Swamp", 2);
		addThisCard("Forest", 2);
		addThisCard("Underground River", 2);
		addThisCard("Yavimaya Coast", 2);
		addThisCard("Llanowar Wastes", 2);
		addThisCard("Wasteland", 1);

		// Colossus Affinity
		// addThisCard("Sunken Hollow", 3);
		// addThisCard("Island", 13);
		// addThisCard("Sanctum of Ugin", 4);
		// addThisCard("Sequestered Stash", 1);
		// addThisCard("Inventor's Fair", 3);
		// addThisCard("Metalwork Colossus", 4);
		// addThisCard("Glint-Nest Crane", 4);
		// addThisCard("Foundry Inspector", 4);
		// addThisCard("Prophetic Prism", 4);
		// addThisCard("Cultivator's Caravan", 1);
		// addThisCard("Deadlock Trap", 4);
		// addThisCard("Hedron Archive", 3);
		// addThisCard("Skysovereign, Consul Flagship", 2);
		// addThisCard("Engulf the Shore", 2);
		// addThisCard("Glassblower's Puzzleknot", 4);
		// addThisCard("Metalspinner's Puzzleknot", 4);

		Collections.shuffle(deck);
	}

	private static void addThisCard(String cardName, int i) {
		for (int qty = 0; qty < i; qty++) {
			deck.add(cardName);
		}
	}
}
