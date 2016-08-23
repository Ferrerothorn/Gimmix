package snakeDraftManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Table {

	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<String> ouPool = new ArrayList<String>();
	public static ArrayList<String> blPool = new ArrayList<String>();
	public static ArrayList<String> uuPool = new ArrayList<String>();
	
	static int ouLimit = 0;
	static int uuLimit = 0;
	static int blLimit = 0;

	public static void main (String[] args) throws Exception {
		
		fillPools();
		capturePlayers();
		draftManager(ouPool, ouLimit, "OU");
		draftManager(uuPool, uuLimit, "UU");
		draftManager(blPool, blLimit, "BL");
		printEachPlayersArsenal();
		
	}
	
	private static void capturePlayers() throws Exception {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the number of players in this draft!");
			int numberOfPlayers = input.nextInt();
			generatePlayers(numberOfPlayers);
		}
		catch(Exception e) {
			System.out.println("I said *number*, idiot.");
			capturePlayers();
		}
	}
	
	@SuppressWarnings("resource")
	private static void generatePlayers(int numberOfPlayers) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numberOfPlayers && i <=8; i++) {
			System.out.println("Enter the name of the player in position " + (i+1) + ".");
			String pName = scanner.nextLine();
			players.add(new Player(pName));
		}
	}

	private static void draftManager(ArrayList<String> pool, int amountFromTier, String string) {
		System.out.println("Time to draft " + string + ".");
		System.out.println();
		
		int maxFromTier = 1;
		if (string.equals("OU")) { maxFromTier = 5; }
		if (string.equals("UU")) { maxFromTier = 7; }
		
		while (amountFromTier < maxFromTier) {
			for (int i = 0; i < players.size(); i++) {
				printEachPlayersArsenal();
				System.out.println();
				askPlayerToPickOne(players.get(i), pool);
			}
			Collections.reverse(players);
			amountFromTier++;
		}
	}

	private static void printEachPlayersArsenal() {
		for (Player p : players) {
			System.out.println(p.getName() + ": " + p.getPoolAsString());
		}
		System.out.println();
	}

	private static void askPlayerToPickOne(Player p, ArrayList<String> tier) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(p.getName() + ", your picks are as follows! (Already in your arsenal: " + p.getPoolAsString() +")");
			printPicks(tier);
			System.out.println("Which do you want?");
			int pick = sc.nextInt();
			p.claimsPick(tier.remove(pick-1));
		}
		catch (Exception e) {
			System.out.println("Well that's just wrong, you ham-fisted waste of oxygen.");
			askPlayerToPickOne(p, tier);
		}
	}

	private static void printPicks(ArrayList<String> tier) {
		String line = "";
		if (tier.size() % 2 == 0) {
			for (int i = 0; i < tier.size(); i++) {
				line += rpad("" + (i+1) + ") " + tier.get(i), 65);
				i++;
				line += "" + (i+1) + ") " + tier.get(i);
				System.out.println(line);
				line = "";
			}
		}
		else {
			for (int i = 0; i < tier.size()-1; i++) {
				line += rpad("" + (i+1) + ") " + tier.get(i), 65);
				i++;
				line += "" + (i+1) + ") " + tier.get(i);
				System.out.println(line);
				line = "";
			}
			line += "" + (tier.size()) + ") " + tier.get(tier.size()-1);
			System.out.println(line);
		}
	} 
	
	public static String rpad(String inStr, int finalLength)
	{
	    return (inStr + "                                                                                                                          "
	        ).substring(0, finalLength);
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

		blPool.add("Alakazam (*)");
		blPool.add("Altaria (*)");
		blPool.add("Diggersby");
		blPool.add("Gallade (*)");
		blPool.add("Gyarados (*)");
		blPool.add("Hawlucha");
		blPool.add("Heracross (*)");
		blPool.add("Pidgeot (*)");
		blPool.add("Scolipede");
		blPool.add("Staraptor");
		blPool.add("Terrakion");
		blPool.add("Togekiss");
		blPool.add("Victini");
		blPool.add("Volcarona");
		blPool.add("Zygarde");
		
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
		uuPool.add("Houndoom");
		uuPool.add("Kingdra");
		uuPool.add("Moltres");
		uuPool.add("Noivern");
		uuPool.add("Pangoro");
		uuPool.add("Sharpedo");
		uuPool.add("Shuckle");
		uuPool.add("Steelix");
		uuPool.add("Tyrantrum");
		uuPool.add("Venomoth");
		uuPool.add("Yanmega");
		uuPool.add("Zoroark");
		}
	
}
