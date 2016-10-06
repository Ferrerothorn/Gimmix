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
		// Dredge
		// addThisCard("Balustrade Spy", 4);
		// addThisCard("Bridge From Below", 4);
		// addThisCard("Cabal Therapy", 4);
		// addThisCard("Dread Return", 4);
		// addThisCard("Flame-Kin Zealot", 1);
		// addThisCard("Flayer of the Hatebound", 1);
		// addThisCard("Gitaxian Probe", 4);
		// addThisCard("Golgari Grave Troll", 4);
		// addThisCard("Golgari Thug", 3);
		// addThisCard("Ichorid", 4);
		// addThisCard("Narcomoeba", 4);
		// addThisCard("Nether Shadow", 4);
		// addThisCard("Phantasmagorian", 4);
		// addThisCard("Prized Amalgam", 4);
		// addThisCard("Shambling Shell", 3);
		// addThisCard("Stinkweed Imp", 4);
		// addThisCard("Street Wraith", 4);

		// Burn
		// addThisCard("Mountain", 18);
		// addThisCard("Geier Reach", 2);
		// addThisCard("Lightning Bolt", 4);
		// addThisCard("Rift Bolt", 4);
		// addThisCard("Lava Spike", 4);
		// addThisCard("Magma Jet", 4);
		// addThisCard("Browbeat", 4);
		// addThisCard("Keldon Marauders", 4);
		// addThisCard("Abbot of Keral Keep", 4);
		// addThisCard("Needle Drop", 3);
		// addThisCard("Chain Lightning", 3);
		// addThisCard("Bedlam Reveler", 2);
		// addThisCard("Searing Blaze", 2);
		// addThisCard("Collective Defiance", 1);
		// addThisCard("Exquisite Firecraft", 1);

		// Goblin Land destruction
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

		// N-RG
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

		// Lupine Vehicles
		// addThisCard("Cinder Glade", 4);
		// addThisCard("Game Trail", 4);
		// addThisCard("Westvale Abbey", 1);
		// addThisCard("Forest", 7);
		// addThisCard("Mountain", 7);
		// addThisCard("Elvish Mystic", 4);
		// addThisCard("Lupine Prototype", 4);
		// addThisCard("Noose Constrictor", 4);
		// addThisCard("Bomat Courier", 4);
		// addThisCard("Inventor's Apprentice", 4);
		// addThisCard("Fiery Temper", 4);
		// addThisCard("Demolition Stomper", 1);
		// addThisCard("Bomat Bazaar Barge", 1);
		// addThisCard("Aradara Express", 1);
		// addThisCard("Fleetwheel Cruiser", 1);
		// addThisCard("Nahiri's Wrath", 3);
		// addThisCard("Ghirapur Orrery", 4);
		// addThisCard("Lightning Axe", 2);

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

		// Shardless BUG
		addThisCard("Shardless Agent", 4);
		addThisCard("Ancestral Vision", 4);
		addThisCard("Evolving Wilds", 4);
		addThisCard("Tarmogoyf", 4);
		addThisCard("Brainstorm", 4);
		addThisCard("Opulent Palace", 4);
		addThisCard("Deathrite Shaman", 4);
		addThisCard("Abrupt Decay", 4);
		addThisCard("Island", 2);
		addThisCard("Baleful Strix", 3);
		addThisCard("Force of Will", 3);
		addThisCard("Swamp", 2);
		addThisCard("Leovold-Emissary of Trest", 2);
		addThisCard("Hymn to Tourach", 2);
		addThisCard("Forest", 2);
		addThisCard("Toxic Deluge", 1);
		addThisCard("Underground River", 2);
		addThisCard("Disfigure", 1);
		addThisCard("Yavimaya Coast", 2);
		addThisCard("Sylvan Library", 1);
		addThisCard("Llanowar Wastes", 2);
		addThisCard("Golgari Charm", 1);
		addThisCard("Wasteland", 1);
		addThisCard("Ponder", 1);

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
