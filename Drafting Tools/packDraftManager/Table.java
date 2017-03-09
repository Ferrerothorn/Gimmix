package packDraftManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import packDraftManager.Player;

public class Table {

	public static ArrayList<Player> players = new ArrayList<>();
	public static ArrayList<String> ouPool = new ArrayList<>();
	public static ArrayList<String> uuPool = new ArrayList<>();
	public static ArrayList<String> ruPool = new ArrayList<>();
	static ArrayList<ArrayList<String>> packs = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);
	static int numberOfPlayers;

	public static void main(String[] args) {

		fillPools();
		System.out.println("How many players in this draft?");
		numberOfPlayers = sc.nextInt();

		createPlayers(numberOfPlayers);
		Collections.shuffle(players);

		trimPoolsToFitPlayers();

		packs = generatePacks(ouPool);
		distributePacks();

		while (aPackContainsSomething()) {
			for (Player p : players) {
				askPlayerToPickOne(p);
			}
			rotatePacks();
		}

		// System.out.println("Now, on to UU.");
		//
		// packs = generatePacks(uuPool);
		// distributePacks(packs);
		//
		// while (aPackContainsSomething()) {
		// for (Player p : players) {
		// askPlayerToPickOne(p);
		// }
		// rotatePacks();
		// }
		//
		// System.out.println("Now, on to RU.");
		//
		// packs = generatePacks(ruPool);
		// distributePacks(packs);
		//
		// while (aPackContainsSomething()) {
		// for (Player p : players) {
		// askPlayerToPickOne(p);
		// }
		// rotatePacks();
		// }
	}

	private static void rotatePacks() {
		ArrayList<String> firstGuyPack = players.get(0).getHand();
		for (int i = 1; i < players.size(); i++) {
			players.get(i - 1).giveHand(players.get(i).getHand());
		}
		players.get(players.size() - 1).setPack(firstGuyPack);
	}

	private static void distributePacks() {

		for (int i = 0; i < players.size() && i < packs.size(); i++) {
			Player p = players.get(i);
			ArrayList<String> theirPack = packs.get(i);
			p.giveHand(theirPack);
		}
		printEachPlayersArsenal();
	}

	private static boolean aPackContainsSomething() {
		int totalUnpickedCards = 0;
		for (Player p : players) {
			totalUnpickedCards += p.getHand().size();
		}
		return totalUnpickedCards != 0;
	}

	private static void printEachPlayersArsenal() {
		for (Player p : players) {
			System.out.println(p.getName() + ": " + p.getHandAsString());
		}
		System.out.println();
	}

	private static void askPlayerToPickOne(Player p) {
		System.out.println(p.getName() + ", your picks are as follows!" + '\n' + "(Already in your arsenal: "
				+ p.getDeckAsString() + ")");
		p.printPicks();
		System.out.println("Which do you want?");
		int pick = sc.nextInt();
		p.claimPick(pick);
	}

	private static ArrayList<ArrayList<String>> generatePacks(ArrayList<String> pool) {
		ArrayList<ArrayList<String>> everyonesPacks = new ArrayList<>();

		ArrayList<String> p1pix = new ArrayList<>();
		everyonesPacks.add(p1pix);
		if (numberOfPlayers > 1) {
			ArrayList<String> p2pix = new ArrayList<>();
			everyonesPacks.add(p2pix);
		}
		if (numberOfPlayers > 2) {
			ArrayList<String> p3pix = new ArrayList<>();
			everyonesPacks.add(p3pix);
		}
		if (numberOfPlayers > 3) {
			ArrayList<String> p4pix = new ArrayList<>();
			everyonesPacks.add(p4pix);
		}
		if (numberOfPlayers > 4) {
			ArrayList<String> p5pix = new ArrayList<>();
			everyonesPacks.add(p5pix);
		}
		if (numberOfPlayers > 5) {
			ArrayList<String> p6pix = new ArrayList<>();
			everyonesPacks.add(p6pix);
		}
		if (numberOfPlayers > 6) {
			ArrayList<String> p7pix = new ArrayList<>();
			everyonesPacks.add(p7pix);
		}
		if (numberOfPlayers > 7) {
			ArrayList<String> p8pix = new ArrayList<>();
			everyonesPacks.add(p8pix);
		}
		if (numberOfPlayers > 8) {
			ArrayList<String> p9pix = new ArrayList<>();
			everyonesPacks.add(p9pix);
		}
		if (numberOfPlayers > 9) {
			ArrayList<String> p10pix = new ArrayList<>();
			everyonesPacks.add(p10pix);
		}

		Collections.shuffle(pool);
		while (pool.size() > 0) {
			for (ArrayList<String> pack : everyonesPacks) {
				pack.add(pool.remove(0));
			}
		}

		return everyonesPacks;
	}

	private static void createPlayers(int playerNo) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= playerNo; i++) {
			System.out.println("Gimme the name of player " + i + ".");
			String name = scanner.nextLine();
			players.add(new Player(name));
		}
	}

	private static void trimPoolsToFitPlayers() {
		Collections.shuffle(ouPool);
		Collections.shuffle(uuPool);
		Collections.shuffle(ruPool);

		boolean fits = false;
		while (!fits) {

			if (ouPool.size() % numberOfPlayers == 0) {
				fits = true;
			} else {
				ouPool.remove(0);
			}
		}

//		fits = false;
//		while (!fits) {
//
//			if (uuPool.size() % numberOfPlayers == 0) {
//				fits = true;
//			} else {
//				uuPool.remove(0);
//			}
//		}
//
//		fits = false;
//		while (!fits) {
//
//			if (ruPool.size() % numberOfPlayers == 0) {
//				fits = true;
//			} else {
//				ruPool.remove(0);
//			}
//		}
	}

	private static void fillPools() {
//		ouPool.add("Amoonguss");
//		ouPool.add("Azumarill");
//		ouPool.add("Bisharp");
//		ouPool.add("Breloom");
//		ouPool.add("Chansey");
//		ouPool.add("Charizard (*)");
//		ouPool.add("Clefable");
//		ouPool.add("Diancie (*)");
//		ouPool.add("Dragonite");
//		ouPool.add("Excadrill");
//		ouPool.add("Ferrothorn");
//		ouPool.add("Garchomp (*)");
//		ouPool.add("Gardevoir (*)");
//		ouPool.add("Gengar");
//		ouPool.add("Gliscor");
//		ouPool.add("Heatran");
//		ouPool.add("Heracross (*)");
//		ouPool.add("Hippowdon");
//		ouPool.add("Jirachi");
//		ouPool.add("Keldeo");
//		ouPool.add("Klefki");
//		ouPool.add("Kyurem-B+R");
//		ouPool.add("Landorus-T");
//		ouPool.add("Latias (*)");
//		ouPool.add("Latios (*)");
//		ouPool.add("Lopunny (*)");
//		ouPool.add("Magnezone");
//		ouPool.add("Manaphy");
//		ouPool.add("Manectric (*)");
//		ouPool.add("Medicham (*)");
//		uuPool.add("Metagross");
//		ouPool.add("Mew");
//		ouPool.add("Pinsir (*)");
//		//ouPool.add("Quagsire");
//		ouPool.add("Raikou");
//		ouPool.add("Rotom (*)");
//		ouPool.add("Sableye (*)");
//		ouPool.add("Scizor (*)");
//		ouPool.add("Serperior");
//		ouPool.add("Skarmory");
//		ouPool.add("Slowbro (*)");
//		ouPool.add("Starmie");
//		ouPool.add("Talonflame");
//		ouPool.add("Tangrowth");
//		ouPool.add("Thundurus (*)");
//		ouPool.add("Tornadus (*)");
//		ouPool.add("Tyranitar (*)");
//		ouPool.add("Venusaur (*)");
//		ouPool.add("Volcanion");
//		ouPool.add("Weavile");
//		ouPool.add("Zapdos");
//
//		ouPool.add("Alakazam (*)");
//		ouPool.add("Altaria (*)");
//		ouPool.add("Diggersby");
//		ouPool.add("Gallade (*)");
//		ouPool.add("Gyarados (*)");
//		ouPool.add("Hawlucha");
//		ouPool.add("Pidgeot (*)");
//		ouPool.add("Salamence");
//		ouPool.add("Scolipede");
//		ouPool.add("Staraptor");
//		ouPool.add("Terrakion");
//		ouPool.add("Togekiss");
//		ouPool.add("Victini");
//		ouPool.add("Volcarona");
//		ouPool.add("Zygarde");
//
//		uuPool.add("Absol (*)");
//		uuPool.add("Aerodactyl (*)");
//		uuPool.add("Aggron (*)");
//		uuPool.add("Ampharos (*)");
//		uuPool.add("Arcanine");
//		uuPool.add("Azelf");
//		uuPool.add("Beedrill (*)");
//		uuPool.add("Blastoise (*)");
//		uuPool.add("Blissey");
//		uuPool.add("Celebi");
//		uuPool.add("Chandelure");
//		uuPool.add("Chesnaught");
//		uuPool.add("Cloyster");
//		uuPool.add("Cobalion");
//		uuPool.add("Conkeldurr");
//		uuPool.add("Crawdaunt");
//		uuPool.add("Cresselia");
//		uuPool.add("Crobat");
//		uuPool.add("Darmanitan");
//		uuPool.add("Donphan");
//		uuPool.add("Doublade");
//		uuPool.add("Empoleon");
//		uuPool.add("Entei");
//		uuPool.add("Espeon");
//		uuPool.add("Feraligatr");
//		uuPool.add("Florges");
//		uuPool.add("Forretress");
//		uuPool.add("Galvantula");
//		uuPool.add("Gligar");
//		uuPool.add("Goodra");
//		uuPool.add("Haxorus");
//		uuPool.add("Heliolisk");
//		uuPool.add("Hydreigon");
//		uuPool.add("Infernape");
//		uuPool.add("Krookodile");
//		uuPool.add("Lucario");
//		uuPool.add("Machamp");
//		uuPool.add("Mamoswine");
//		uuPool.add("Mandibuzz");
//		uuPool.add("Mienshao");
//		uuPool.add("Milotic");
//		uuPool.add("Nidoking");
//		uuPool.add("Nidoqueen");
//		uuPool.add("Porygon-Z");
//		uuPool.add("Porygon2");
//		uuPool.add("Reuniclus");
//		uuPool.add("Roserade");
//		uuPool.add("Salamence");
//		uuPool.add("Sceptile (*)");
//		uuPool.add("Shaymin");
//		uuPool.add("Slurpuff");
//		uuPool.add("Snorlax");
//		uuPool.add("Suicune");
//		uuPool.add("Swampert (*)");
//		uuPool.add("Sylveon");
//		uuPool.add("Tentacruel");
//		uuPool.add("Toxicroak");
//		uuPool.add("Umbreon");
//		uuPool.add("Vaporeon");
//		uuPool.add("Whimsicott");
//		uuPool.add("Abomasnow");
//		uuPool.add("Dragalge");
//		uuPool.add("Durant");
//		uuPool.add("Froslass");
//		uuPool.add("Honchkrow");
//		uuPool.add("Houndoom (*)");
//		uuPool.add("Kingdra");
//		uuPool.add("Moltres");
//		uuPool.add("Noivern");
//		uuPool.add("Pangoro");
//		uuPool.add("Sharpedo (*)");
//		uuPool.add("Shuckle");
//		uuPool.add("Steelix (*)");
//		uuPool.add("Tyrantrum");
//		uuPool.add("Venomoth");
//		uuPool.add("Yanmega");
//		uuPool.add("Zoroark");
//
//		ruPool.add("Accelgor");
//		ruPool.add("Alomomola");
//		ruPool.add("Ambipom");
//		ruPool.add("Aromatisse");
//		ruPool.add("Banette (*)");
//		ruPool.add("Braviary");
//		ruPool.add("Bronzong");
//		ruPool.add("Camerupt (*)");
//		ruPool.add("Cinccino");
//		ruPool.add("Clawitzer");
//		ruPool.add("Cofagrigus");
//		ruPool.add("Delphox");
//		ruPool.add("Diancie");
//		ruPool.add("Drapion");
//		ruPool.add("Druddigon");
//		ruPool.add("Dugtrio");
//		ruPool.add("Eelektross");
//		ruPool.add("Emboar");
//		ruPool.add("Escavalier");
//		ruPool.add("Exploud");
//		ruPool.add("Fletchinder");
//		ruPool.add("Flygon");
//		ruPool.add("Glalie (*)");
//		ruPool.add("Golbat");
//		ruPool.add("Granbull");
//		ruPool.add("Hitmonlee");
//		ruPool.add("Hitmontop");
//		ruPool.add("Hoopa");
//		ruPool.add("Jellicent");
//		ruPool.add("Jolteon");
//		ruPool.add("Magneton");
//		ruPool.add("Medicham");
//		ruPool.add("Meloetta");
//		ruPool.add("Qwilfish");
//		ruPool.add("Registeel");
//		ruPool.add("Rhyperior");
//		ruPool.add("Sawk");
//		ruPool.add("Scrafty");
//		ruPool.add("Seismitoad");
//		ruPool.add("Sigilyph");
//		ruPool.add("Slowking");
//		ruPool.add("Sneasel");
//		ruPool.add("Spiritomb");
//		ruPool.add("Togetic");
//		ruPool.add("Typhlosion");
//		ruPool.add("Uxie");
//		ruPool.add("Venusaur");
//		ruPool.add("Virizion");
		
		ouPool.add("Mienfoo");
		ouPool.add("Pawniard");
		ouPool.add("Chinchou");
		ouPool.add("Fletchling");
		ouPool.add("Abra");
		ouPool.add("Vullaby");
		ouPool.add("Magnemite");
		ouPool.add("Staryu");
		ouPool.add("Foongus");
		ouPool.add("Porygon");
		ouPool.add("Croagunk");
		ouPool.add("Timburr");
		ouPool.add("Gastly");
		ouPool.add("Drilbur");
		ouPool.add("Zigzagoon");
		ouPool.add("Omanyte");
		ouPool.add("Diglett");
		ouPool.add("Honedge");
		ouPool.add("Gothita");
		ouPool.add("Dwebble");
		ouPool.add("Archen");
		ouPool.add("Snivy");
		ouPool.add("Aipom");
		ouPool.add("Onix");
		ouPool.add("Koffing");
		ouPool.add("Clamperl");
		ouPool.add("Tirtouga");
		ouPool.add("Ferroseed");
		ouPool.add("Snubbull");
		ouPool.add("Vulpix");
		ouPool.add("Houndour");
		ouPool.add("Spritzee");
		ouPool.add("Machop");
		ouPool.add("Pineco");
		ouPool.add("Cottonee");
		ouPool.add("Carvanha");
		ouPool.add("Tyrunt");
		ouPool.add("Amaura");
		ouPool.add("Ponyta");
		ouPool.add("Bellsprout");
		ouPool.add("Pumpkaboo");
		ouPool.add("Lileep");
		ouPool.add("Trubbish");
		ouPool.add("Lickitung");
		ouPool.add("Sandile");
		ouPool.add("Anorith");
		ouPool.add("Treecko");
		ouPool.add("Skrelp");
		ouPool.add("Stunky");
		ouPool.add("Scraggy");
		ouPool.add("Torchic");
		ouPool.add("Natu");
		ouPool.add("Riolu");
		ouPool.add("Bulbasaur");
		ouPool.add("Doduo");
		ouPool.add("Corphish");
		ouPool.add("Slowpoke");
		ouPool.add("Surskit");
		ouPool.add("Larvesta");
		ouPool.add("Gible");
		ouPool.add("Bronzor");
		ouPool.add("Trapinch");
		ouPool.add("Voltorb");
		ouPool.add("Tentacool");
		ouPool.add("Purrloin");
		ouPool.add("Zorua");
		ouPool.add("Shellder");
		ouPool.add("Munchlax");
		ouPool.add("Meowth");
		ouPool.add("Inkay");
		ouPool.add("Snover");
		ouPool.add("Frillish");
		ouPool.add("Cyndaquil");
		ouPool.add("Baltoy");
		ouPool.add("Elekid");
		ouPool.add("Growlith");
		ouPool.add("Kabuto");
		ouPool.add("Larvitar");
		ouPool.add("Cacnea");
		ouPool.add("Venipede");
		ouPool.add("Piplup");
		ouPool.add("Finneon");
		ouPool.add("Froakie");
		ouPool.add("Shieldon");
		ouPool.add("Binacle");
		ouPool.add("Magby");
		ouPool.add("Totodile");
		ouPool.add("Pancham");
		ouPool.add("Rhyhorn");
		ouPool.add("Noibat");
		ouPool.add("Aron");
		ouPool.add("Poliwag");
		ouPool.add("Minccino");
		ouPool.add("Axew");
		ouPool.add("Bunnelby");
		ouPool.add("Golett");
		ouPool.add("Hippopots");
		ouPool.add("Dratini");
		ouPool.add("Sewaddle");
		ouPool.add("Ekans");
		
	}

}
