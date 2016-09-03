package snakeDraftManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import snakeDraftManager.Player;

public class Table {

	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<String> ouPool = new ArrayList<String>();
	public static ArrayList<String> blPool = new ArrayList<String>();
	public static ArrayList<String> uuPool = new ArrayList<String>();
	public static ArrayList<String> bl2Pool = new ArrayList<String>();
	public static ArrayList<String> ruPool = new ArrayList<String>();

	static int ouLimit = 0;
	static int uuLimit = 0;
	static int blLimit = 0;
	static int ruLimit = 0;
	static int bl2Limit = 0;

	public static void main(String[] args) throws Exception {

		fillPools();
		capturePlayers();
	//	draftManager(ouPool, ouLimit, "OU");
		draftManager(blPool, blLimit, "BL");
		draftManager(uuPool, uuLimit, "UU");
		draftManager(bl2Pool, bl2Limit, "BL2");
		draftManager(ruPool, ruLimit, "RU");
		printEachPlayersArsenal();

	}

	private static void capturePlayers() throws Exception {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the number of players in this draft!");
			int numberOfPlayers = input.nextInt();
			generatePlayers(numberOfPlayers);
		} catch (Exception e) {
			System.out.println("I said *number*, idiot.");
			capturePlayers();
		}
	}

	@SuppressWarnings("resource")
	private static void generatePlayers(int numberOfPlayers) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Enter the name of the player in position " + (i + 1) + ".");
			String pName = scanner.nextLine();
			players.add(new Player(pName));
		}
	}

	private static void draftManager(ArrayList<String> pool, int amountFromTier, String string) {
		System.out.println("Time to draft " + string + ".");
		System.out.println();

		int maxFromTier = 1;
		if (string.equals("UU")) {
			maxFromTier = 6;
		}
		if (string.contains("RU")) {
			maxFromTier = 4;
		}

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
			System.out.println(p.getName() + ", your picks are as follows! (Already in your arsenal: "
					+ p.getPoolAsString() + ")");
			printPicks(tier);
			System.out.println("Which do you want?");
			int pick = sc.nextInt();
			p.claimsPick(tier.remove(pick - 1));
		} catch (Exception e) {
			System.out.println("Well that's just wrong, you ham-fisted waste of oxygen.");
			askPlayerToPickOne(p, tier);
		}
	}

	private static void printPicks(ArrayList<String> tier) {
		String line = "";
		if (tier.size() % 2 == 0) {
			for (int i = 0; i < tier.size(); i++) {
				line += rpad("" + (i + 1) + ") " + tier.get(i), 65);
				i++;
				line += "" + (i + 1) + ") " + tier.get(i);
				System.out.println(line);
				line = "";
			}
		} else {
			for (int i = 0; i < tier.size() - 1; i++) {
				line += rpad("" + (i + 1) + ") " + tier.get(i), 65);
				i++;
				line += "" + (i + 1) + ") " + tier.get(i);
				System.out.println(line);
				line = "";
			}
			line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
			System.out.println(line);
		}
	}

	public static String rpad(String inStr, int finalLength) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, finalLength);
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
		blPool.add("Salamence");
		blPool.add("Scolipede");
		blPool.add("Staraptor");
		blPool.add("Terrakion");
		blPool.add("Thundurus-T");
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
		uuPool.add("Gardevoir (No Mega)");
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
		uuPool.add("Porygon-2");
		uuPool.add("Reuniclus");
		uuPool.add("Roserade");
		uuPool.add("Rotoms (minus Wash)");
		uuPool.add("Sableye");
		uuPool.add("Sceptile (*)");
		uuPool.add("Sharpedo");
		uuPool.add("Snorlax");
		uuPool.add("Suicune");
		uuPool.add("Swampert (*)");
		uuPool.add("Sylveon");
		uuPool.add("Tentacruel");
		uuPool.add("Tornadus-I");
		uuPool.add("Toxicroak");
		uuPool.add("Umbreon");
		uuPool.add("Vaporeon");
		uuPool.add("Whimsicott");


		
		bl2Pool.add("Abomasnow");
		bl2Pool.add("Dragalge");
		bl2Pool.add("Durant");
		bl2Pool.add("Froslass");
		bl2Pool.add("Honchkrow");
		bl2Pool.add("Houndoom");
		bl2Pool.add("Kingdra");
		bl2Pool.add("Moltres");
		bl2Pool.add("Noivern");
		bl2Pool.add("Pangoro");
		bl2Pool.add("Shuckle");
		bl2Pool.add("Shaymin");
		bl2Pool.add("Slurpuff");
		bl2Pool.add("Steelix");
		bl2Pool.add("Tyrantrum");
		bl2Pool.add("Venomoth");
		bl2Pool.add("Yanmega");
		bl2Pool.add("Zoroark");

		ruPool.add("Accelgor");
		ruPool.add("Alomomola");
		ruPool.add("Ambipom");
		ruPool.add("Aromatisse");
		ruPool.add("Banette (*)");
		ruPool.add("Braviary");
		ruPool.add("Bronzong");
		ruPool.add("Camerupt");
		ruPool.add("Cinccino");
		ruPool.add("Clawitzer");
		ruPool.add("Cofagrigus");
		ruPool.add("Delphox");
		ruPool.add("Diancie");
		ruPool.add("Drapion");
		ruPool.add("Druddigon");
		ruPool.add("Dugtrio");
		ruPool.add("Eelektross");
		ruPool.add("Emboar");
		ruPool.add("Escavalier");
		ruPool.add("Fletchinder");
		ruPool.add("Flygon");
		ruPool.add("Glalie");
		ruPool.add("Golbat");
		ruPool.add("Granbull");
		ruPool.add("Hitmonlee");
		ruPool.add("Hitmontop");
		ruPool.add("Hoopa");
		ruPool.add("Jellicent");
		ruPool.add("Jolteon");
		ruPool.add("Magneton");
		ruPool.add("Medicham");
		ruPool.add("Meloetta");
		ruPool.add("Qwilfish");
		ruPool.add("Registeel");
		ruPool.add("Rhyperior");
		ruPool.add("Scrafty");
		ruPool.add("Sawk");
		ruPool.add("Seismitoad");
		ruPool.add("Sigilyph");
		ruPool.add("Slowking");
		ruPool.add("Sneasel");
		ruPool.add("Spiritomb");
		ruPool.add("Togetic");
		ruPool.add("Typhlosion");
		ruPool.add("Uxie");
		ruPool.add("Virizion");
	}

}
