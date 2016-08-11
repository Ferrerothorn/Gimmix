package draftHandManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Table {

	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<String> ouPool = new ArrayList<String>();
	public static ArrayList<String> uuPool = new ArrayList<String>();
	static ArrayList<ArrayList<String>> packs = new ArrayList<ArrayList<String>>();
	static Scanner sc = new Scanner(System.in);
	static int numberOfPlayers;
	
	public static void main (String[] args) {
		
		fillPools();
		System.out.println("How many players in this draft?");
		numberOfPlayers = sc.nextInt();
		
		createPlayers(numberOfPlayers);
		//Collections.shuffle(players);
		
		trimPoolsToFitPlayers();
		
		packs = generatePacks(ouPool);
		distributePacks(packs);
		
		while (aPackContainsSomething()) {
			for (Player p : players) {
				askPlayerToPickOne(p);
			}
			rotatePacks();
			printEachPlayersArsenal();
		}
		
		System.out.println("Now, on to UU.");
		
		packs = generatePacks(uuPool);
		distributePacks(packs);
		
		while (aPackContainsSomething()) {
			for (Player p : players) {
				askPlayerToPickOne(p);
			}
			rotatePacks();
			printEachPlayersArsenal();
		}
	}

	private static void rotatePacks() {
		ArrayList<String> firstGuyPack = players.get(0).getHand();
		for (int i = 1; i< players.size(); i++) {
			players.get(i-1).giveHand(players.get(i).getHand());
		}
		players.get(players.size()-1).setPack(firstGuyPack);
	}

	private static void distributePacks(ArrayList<ArrayList<String>> packs2) {

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
			System.out.println(p.getName() + ", your picks are as follows! (Already in your arsenal: " + p.getDeckAsString() +")");
			p.printPicks();
			System.out.println("Which do you want?");
			int pick = sc.nextInt();
			p.claimPick(pick);
	}

	private static ArrayList<ArrayList<String>> generatePacks(ArrayList<String> pool) {
		ArrayList<ArrayList<String>> everyonesPacks = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> p1pix = new ArrayList<String>();
		everyonesPacks.add(p1pix);
		if (numberOfPlayers > 1){
			ArrayList<String> p2pix = new ArrayList<String>();
			everyonesPacks.add(p2pix);
		}
		if (numberOfPlayers > 2){
			ArrayList<String> p3pix = new ArrayList<String>();
			everyonesPacks.add(p3pix);
		}
		if (numberOfPlayers > 3){
			ArrayList<String> p4pix = new ArrayList<String>();
			everyonesPacks.add(p4pix);
		}
		if (numberOfPlayers > 4){
			ArrayList<String> p5pix = new ArrayList<String>();
			everyonesPacks.add(p5pix);
		}
		if (numberOfPlayers > 5){
			ArrayList<String> p6pix = new ArrayList<String>();
			everyonesPacks.add(p6pix);
		}
		if (numberOfPlayers > 6){
			ArrayList<String> p7pix = new ArrayList<String>();
			everyonesPacks.add(p7pix);
		}
		if (numberOfPlayers > 7){
			ArrayList<String> p8pix = new ArrayList<String>();
			everyonesPacks.add(p8pix);
		}
		if (numberOfPlayers > 8){
			ArrayList<String> p9pix = new ArrayList<String>();
			everyonesPacks.add(p9pix);
		}
		if (numberOfPlayers > 9){
			ArrayList<String> p10pix = new ArrayList<String>();
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
		
		boolean fits = false;
		while(!fits) {
			
			if ( ouPool.size() % numberOfPlayers  == 0 ) {
				fits = true;
			}
			else {
				ouPool.remove(0);
			}
		}
		
		fits = false;
		while(!fits) {
			
			if ( uuPool.size() % numberOfPlayers  == 0 ) {
				fits = true;
			}
			else {
				uuPool.remove(0);
			}
		}
	}


	private static void fillPools() {
		ouPool.add("Amoonguss");
		ouPool.add("Azumarill");
		ouPool.add("Bisharp");
		ouPool.add("Breloom");
		ouPool.add("Chansey");
		ouPool.add("Charizard (*)");
		ouPool.add("Clefable");
		ouPool.add("Diancie (*)");
		ouPool.add("Dragonite");
		ouPool.add("Excadrill");
		ouPool.add("Ferrothorn");
		ouPool.add("Garchomp (*)");
		ouPool.add("Gardevoir (*)");
		ouPool.add("Gengar");
		ouPool.add("Gliscor");
		ouPool.add("Heatran");
		ouPool.add("Hippowdon");
		ouPool.add("Jirachi");
		ouPool.add("Keldeo");
		ouPool.add("Klefki");
		ouPool.add("Kyurem (*)");
		ouPool.add("Landorus-T");
		ouPool.add("Latias (*)");
		ouPool.add("Latios (*)");
		ouPool.add("Lopunny (*)");
		ouPool.add("Magnezone");
		ouPool.add("Manaphy");
		ouPool.add("Manectric (*)");
		ouPool.add("Medicham (*)");
		uuPool.add("Metagross");
		ouPool.add("Mew");
		ouPool.add("Pinsir (*)");
		ouPool.add("Quagsire");
		ouPool.add("Raikou");
		ouPool.add("Rotom (*)");
		ouPool.add("Sableye (*)");
		ouPool.add("Scizor (*)");
		ouPool.add("Serperior");
		ouPool.add("Skarmory");
		ouPool.add("Slowbro (*)");
		ouPool.add("Starmie");
		ouPool.add("Thundurus (*)");
		ouPool.add("Tornadus (*)");
		ouPool.add("Tyranitar (*)");
		ouPool.add("Venusaur (*)");
		ouPool.add("Volcanion");
		ouPool.add("Weavile");
		ouPool.add("Zapdos");

//		blPool.add("Alakazam (*)");
//		blPool.add("Altaria (*)");
//		blPool.add("Diggersby");
//		blPool.add("Gallade (*)");
//		blPool.add("Gyarados (*)");
//		blPool.add("Hawlucha");
//		blPool.add("Heracross (*)");
//		blPool.add("Pidgeot (*)");
//		blPool.add("Scolipede");
//		blPool.add("Staraptor");
//		blPool.add("Terrakion");
//		blPool.add("Togekiss");
//		blPool.add("Victini");
//		blPool.add("Volcarona");
//		blPool.add("Zygarde");
		
		ouPool.add("Alakazam (*)");
		ouPool.add("Altaria (*)");
		ouPool.add("Diggersby");
		ouPool.add("Gallade (*)");
		ouPool.add("Gyarados (*)");
		ouPool.add("Hawlucha");
		ouPool.add("Heracross (*)");
		ouPool.add("Pidgeot (*)");
		ouPool.add("Scolipede");
		ouPool.add("Staraptor");
		ouPool.add("Terrakion");
		ouPool.add("Togekiss");
		ouPool.add("Victini");
		ouPool.add("Volcarona");
		ouPool.add("Zygarde");
		
		uuPool.add("Absol (*)");
		uuPool.add("Aerodactyl (*)");
		uuPool.add("Aggron (*)");
		uuPool.add("Ampharos (*)");
		uuPool.add("Arcanine");
		uuPool.add("Azelf");
		uuPool.add("Beedrill (*)");
		uuPool.add("Blastoise (*)");
		uuPool.add("Blissey");
		uuPool.add("Celebi");
		uuPool.add("Chandelure");
		uuPool.add("Chesnaught");
		uuPool.add("Cloyster");
		uuPool.add("Cobalion");
		uuPool.add("Conkeldurr");
		uuPool.add("Crawdaunt");
		uuPool.add("Cresselia");
		uuPool.add("Crobat");
		uuPool.add("Darmanitan");
		uuPool.add("Donphan");
		uuPool.add("Doublade");
		uuPool.add("Empoleon");
		uuPool.add("Entei");
		uuPool.add("Espeon");
		uuPool.add("Feraligatr");
		uuPool.add("Florges");
		uuPool.add("Forretress");
		uuPool.add("Galvantula");
		uuPool.add("Gligar");
		uuPool.add("Goodra");
		uuPool.add("Haxorus");
		uuPool.add("Heliolisk");
		uuPool.add("Hydreigon");
		uuPool.add("Infernape");
		uuPool.add("Krookodile");
		uuPool.add("Lucario");
		uuPool.add("Machamp");
		uuPool.add("Mamoswine");
		uuPool.add("Mandibuzz");
		uuPool.add("Mienshao");
		uuPool.add("Milotic");
		uuPool.add("Nidoking");
		uuPool.add("Nidoqueen");
		uuPool.add("Porygon-Z");
		uuPool.add("Porygon2");
		uuPool.add("Reuniclus");
		uuPool.add("Roserade");
		uuPool.add("Salamence");
		uuPool.add("Sceptile (*)");
		uuPool.add("Shaymin");
		uuPool.add("Slurpuff");
		uuPool.add("Snorlax");
		uuPool.add("Suicune");
		uuPool.add("Swampert (*)");
		uuPool.add("Sylveon");
		uuPool.add("Tentacruel");
		uuPool.add("Toxicroak");
		uuPool.add("Umbreon");
		uuPool.add("Vaporeon");
		uuPool.add("Whimsicott");
		
		uuPool.add("Abomasnow");
		uuPool.add("Dragalge");
		uuPool.add("Durant");
		uuPool.add("Froslass");
		uuPool.add("Honchkrow");
		uuPool.add("Houndoom (*)");
		uuPool.add("Kingdra");
		uuPool.add("Moltres");
		uuPool.add("Noivern");
		uuPool.add("Pangoro");
		uuPool.add("Sharpedo (*)");
		uuPool.add("Shuckle");
		uuPool.add("Steelix (*)");
		uuPool.add("Tyrantrum");
		uuPool.add("Venomoth");
		uuPool.add("Yanmega");
		uuPool.add("Zoroark");
		}
	
}
