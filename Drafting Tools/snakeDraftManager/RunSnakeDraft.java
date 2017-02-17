package snakeDraftManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import snakeDraftManager.Player;

public class RunSnakeDraft {

	public static ArrayList<Player> players = new ArrayList<>();
	public static ArrayList<String> ouPool = new ArrayList<>();
	public static ArrayList<String> blPool = new ArrayList<>();
	public static ArrayList<String> uuPool = new ArrayList<>();
	public static ArrayList<String> bl2Pool = new ArrayList<>();
	public static ArrayList<String> ruPool = new ArrayList<>();

	public static String swappingPool = "Swapping pool:" + '\n';

	public static Scanner inputs = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		fillPools();
		Collections.sort(ouPool);
		Collections.sort(blPool);
		Collections.sort(uuPool);
		capturePlayers();
		draftManager(ouPool, "OU");
		draftManager(blPool, "BL");
		draftManager(uuPool, "UU");
//		draftManager(ruPool, "RU");

		tradingPost();
		saveFile();
		inputs.close();
	}


	private static void fillPools() {

		ouPool.add("Alakazam");
		ouPool.add("Buzzwole");
		ouPool.add("Celesteela");
		ouPool.add("Chansey");
		ouPool.add("Charizard (*)");
		ouPool.add("Dugtrio");
		ouPool.add("Excadrill");
		ouPool.add("Ferrothorn");
		ouPool.add("Garchomp (*)");
		ouPool.add("Greninja (*)");
		ouPool.add("Gyarados (*)");
		ouPool.add("Heatran");
		ouPool.add("Hoopa-U");
		ouPool.add("Jirachi");
		ouPool.add("Kartana");
		ouPool.add("Landorus-T");
		ouPool.add("Latios (*)");
		ouPool.add("Magearna");
		ouPool.add("Magnezone");
		ouPool.add("Mamoswine");
		ouPool.add("Manaphy");
		ouPool.add("Marowak-Alola");
		ouPool.add("Mimikyu");
		ouPool.add("Muk-Alola");
		ouPool.add("Nihilego");
		ouPool.add("Pelipper");
		ouPool.add("Pheromosa");
		ouPool.add("Pinsir (*)");
		ouPool.add("Rotom (*)");
		ouPool.add("Sableye (*)");
		ouPool.add("Salamence");
		ouPool.add("Scizor (*)");
		ouPool.add("Scolipede");
		ouPool.add("Skarmory");
		ouPool.add("Tangrowth");
		ouPool.add("Tapu Bulu");
		ouPool.add("Tapu Fini");
		ouPool.add("Tapu Koko");
		ouPool.add("Tapu Lele");
		ouPool.add("Toxapex");
		ouPool.add("Tyranitar");
		ouPool.add("Venusaur (*)");
		ouPool.add("Volcarona");
		ouPool.add("Xurkitree");
		ouPool.add("Zapdos");
		ouPool.add("Zygarde");
		
		blPool.add("Azumarill");
		blPool.add("Breloom");
		blPool.add("Diggersby");
		blPool.add("Dragonite");
		blPool.add("Kyurem-B");
		blPool.add("Porygon-Z");
		blPool.add("Serperior");
		blPool.add("Slowbro (*)");
		blPool.add("Staraptor");
		blPool.add("Terrakion");
		blPool.add("Thundurus (*)");
		blPool.add("Tornadus (*)");
		blPool.add("Victini");
		blPool.add("Weavile");

		uuPool.add("Absol (*)");
		uuPool.add("Aerodactyl (*)");
		uuPool.add("Amoonguss");
		uuPool.add("Arcanine");
		uuPool.add("Azelf");
		uuPool.add("Bewear");
		uuPool.add("Bisharp");
		uuPool.add("Blastoise (*)");
		uuPool.add("Blissey");
		uuPool.add("Celebi");
		uuPool.add("Chandelure");
		uuPool.add("Clefable");
		uuPool.add("Cobalion");
		uuPool.add("Conkeldurr");
		uuPool.add("Crobat");
		uuPool.add("Decidueye");
		uuPool.add("Dhelmise");
		uuPool.add("Empoleon");
		uuPool.add("Flygon");
		uuPool.add("Forretress");
		uuPool.add("Gengar");
		uuPool.add("Gliscor");
		uuPool.add("Hippowdon");
		uuPool.add("Hydreigon");
		uuPool.add("Infernape");
		uuPool.add("Keldeo");
		uuPool.add("Kingdra");
		uuPool.add("Klefki");
		uuPool.add("Kommo-o");
		uuPool.add("Krookodile");	
		uuPool.add("Latias");
		uuPool.add("Magneton");
		uuPool.add("Mandibuzz");
		uuPool.add("Mantine");
		uuPool.add("Metagross");
		uuPool.add("Mew");
		uuPool.add("Mienshao");
		uuPool.add("Necrozma");
		uuPool.add("Ninetales-Alola");
		uuPool.add("Primarina");
		uuPool.add("Raikou");
		uuPool.add("Sharpedo (*)");
		uuPool.add("Starmie");
		uuPool.add("Swampert (*)");
		uuPool.add("Sylveon");
		uuPool.add("Tentacruel");
		uuPool.add("Togekiss");
		uuPool.add("Tsareena");
		uuPool.add("Volcanion");
		uuPool.add("Zygarde 10%");

	/*	bl2Pool.add("Abomasnow (*)");
		bl2Pool.add("Dragalge");
		bl2Pool.add("Durant");
		bl2Pool.add("Froslass");
		bl2Pool.add("Honchkrow");
		bl2Pool.add("Houndoom (*)");
		bl2Pool.add("Kingdra");
		bl2Pool.add("Kyurem (Base only)");
		bl2Pool.add("Moltres");
		bl2Pool.add("Noivern");
		bl2Pool.add("Pangoro");
		bl2Pool.add("Shaymin");
		bl2Pool.add("Shuckle");
		bl2Pool.add("Slurpuff");
		bl2Pool.add("Steelix (*)");
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
		ruPool.add("Camerupt (*)");
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
		ruPool.add("Exploud");
		ruPool.add("Fletchinder");
		ruPool.add("Flygon");
		ruPool.add("Glalie (*)");
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
		ruPool.add("Quagsire");
		ruPool.add("Qwilfish");
		ruPool.add("Registeel");
		ruPool.add("Rhyperior");
		ruPool.add("Sawk");
		ruPool.add("Scrafty");
		ruPool.add("Seismitoad");
		ruPool.add("Sigilyph");
		ruPool.add("Slowking");
		ruPool.add("Sneasel");
		ruPool.add("Spiritomb");
		ruPool.add("Togetic");
		ruPool.add("Typhlosion");
		ruPool.add("Uxie");
		ruPool.add("Venusaur");
		ruPool.add("Virizion");  */
	}

	private static void capturePlayers() throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of players in this draft!");
			int numberOfPlayers = scanner.nextInt();
			generatePlayers(numberOfPlayers);
		} catch (Exception e) {
			System.out.println("I said *number*, you " + freshInsult() + ".");
			capturePlayers();
		}
	}

	private static void generatePlayers(int numberOfPlayers) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Enter the name of the player in position " + (i + 1) + " of the snake.");
			String pName = scanner.nextLine();
			players.add(new Player(pName));
		}
	}

	private static void draftManager(ArrayList<String> pool, String tierLabel) {
		System.out.println("Time to draft " + tierLabel + ".");
		System.out.println();

		int maxFromTier = Math.floorDiv((pool.size()), players.size());

		int counter = 0;
		while (counter < maxFromTier && pool.size() > 0) {
			for (int i = 0; i < players.size(); i++) {
				wipeScreen();
				printEachPlayersArsenal();
				System.out.println();
				askPlayerToPickOne(players.get(i), pool, (maxFromTier - counter));
			}
			Collections.reverse(players);
			counter++;
		}
		processUnclaimedPokemon(pool, tierLabel);
	}

	private static void wipeScreen() {
		for (int i = 0; i < 100; i++) {
			System.out.print('\n');
		}
	}

	private static String printEachPlayersArsenal() {
		String output = "";
		for (Player p : players) {
			Collections.sort(p.getPool());
			output += p.getName() + ": " + p.getPoolAsString() + '\n' + '\n';
		}
		return output;
	}

	private static void askPlayerToPickOne(Player p, ArrayList<String> tier, int amountFromTier) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(p.getName() + ", your picks are as follows!" + '\n' + "(Already in your arsenal: "
					+ p.getPoolAsString() + ")" + '\n');
			System.out.println("Your have " + amountFromTier + " pick(s) left from this tier." + '\n');
			printPicks(tier);
			System.out.println();
			System.out.println("Which do you want?");
			System.out.println("Alternatively, enter 999 to see the drafted picks.");
			int pick = sc.nextInt();
			if (pick == 999) {
				System.out.println(printSnekAndPools());
				askPlayerToPickOne(p, tier, amountFromTier);
			} else {
				p.claimsPick(tier.remove(pick - 1));
			}
			saveFile();
		} catch (Exception e) {
			System.out.println("Well that's just wrong, you " + freshInsult() + ".");
			System.out.println("I wanted a number, not " + listPhrase());
			askPlayerToPickOne(p, tier, amountFromTier);
		}
	}

	private static void tradingPost() throws Exception {
		boolean allSatisfiedWithTrades = false;

		while (!allSatisfiedWithTrades) {

			int playerIndex = 0;
			System.out.println(printSnekAndPools());
			System.out.println();
			System.out.println("Anyone looking to instigate a trade?");
			for (Player p : players) {
				System.out.println("" + (playerIndex + 1) + ") " + p.getName());
				playerIndex++;
			}
			System.out.println("0) No thanks.");

			Scanner inputs1 = new Scanner(System.in);
			int buyerIndex = inputs1.nextInt();

			switch (buyerIndex) {
			case 0:
				allSatisfiedWithTrades = true;
				break;
			default:
				if (buyerIndex <= players.size()) {
					Player buyer = players.get(buyerIndex - 1);
					System.out.println();
					System.out.println("And, you're wanting to trade with whom?");

					for (int i = 0; i < players.size(); i++) {
						if (players.get(i) != buyer) {
							System.out.println("" + (i + 1) + ") " + players.get(i).getName());
						}
					}
					int sellerIndex = inputs1.nextInt();
					sellerIndex--;
					Player seller = null;
					if (sellerIndex <= players.size()) {
						seller = players.get(sellerIndex);
					}

					if (buyer != null && seller != null && buyer != seller) {
						try {
							transaction(buyer, seller);
						} catch (Exception e) {
						}
					}
				}
			}
		}
	}

	private static void saveFile() {

		String output = printEachPlayersArsenal();
		output += swappingPool;

		File file = new File("FinalDraftPools.txt");
		try {
			PrintWriter writer = new PrintWriter(file, "UTF-8");
			writer.print(output);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	private static void transaction(Player p1, Player p2) throws Exception {

		System.out.println(p1.getName() + "'s pool:");
		int index = 1;
		for (String s : p1.getPool()) {
			System.out.println("" + index + ") " + s);
			index++;
		}
		System.out.println("999) Cancel transaction" + '\n');

		int input = inputs.nextInt();
		if (input == 999) {
			wipeScreen();
			System.out.println("Trade cancelled.");
			return;
		}
		String trading = p1.getPool().get(input - 1);

		System.out.println("Trade " + trading + " for what?");
		index = 1;
		for (String s : p2.getPool()) {
			System.out.println("" + index + ") " + s);
			index++;
		}
		System.out.println("999) Cancel transaction" + '\n');

		input = inputs.nextInt();
		if (input == 999) {
			wipeScreen();
			System.out.println("Trade cancelled.");
			return;
		}
		String tradeBack = p2.getPool().get(input - 1);

		p1.getPool().add(tradeBack);
		p1.getPool().remove(trading);
		p2.getPool().add(trading);
		p2.getPool().remove(tradeBack);

		wipeScreen();
		System.out.println("Trade completed. (" + trading + " -> " + tradeBack + ")." + '\n');
		saveFile();
	}

	private static String freshInsult() {
		ArrayList<String> firsts = new ArrayList<>();
		ArrayList<String> seconds = new ArrayList<>();
		firsts.add("dismal");
		firsts.add("empty");
		firsts.add("ham-fisted");
		firsts.add("puny");
		firsts.add("spindly");
		firsts.add("ceaseless");
		firsts.add("vile");
		firsts.add("fleshy");
		firsts.add("window-licking");
		firsts.add("ruinous");
		firsts.add("devoid");
		firsts.add("crumbling");
		firsts.add("toxic");
		firsts.add("hopeless");
		firsts.add("dopey");
		firsts.add("hideous");
		firsts.add("weak-minded");
		firsts.add("fallacious");
		firsts.add("cancerous");
		firsts.add("pestilent");
		firsts.add("diseased");
		firsts.add("malnourished");
		firsts.add("slagbound");
		firsts.add("skeletal");
		firsts.add("worn-out");
		firsts.add("regrettable");

		seconds.add("wreckage");
		seconds.add("vessel");
		seconds.add("waste of oxygen");
		seconds.add("error");
		seconds.add("aberration");
		seconds.add("mistake");
		seconds.add("husk");
		seconds.add("pebble");
		seconds.add("surplus");
		seconds.add("Sunkern");
		seconds.add("piglet");
		seconds.add("refuse");
		seconds.add("accident");
		seconds.add("excuse");
		seconds.add("mushroom");
		seconds.add("vermin");
		seconds.add("kernel");
		seconds.add("cad");
		seconds.add("ragamuffin");
		seconds.add("cauldron");
		seconds.add("wafer");
		seconds.add("scrapmound");

		Random r = new Random();
		int fi = r.nextInt(firsts.size());
		String f = firsts.get(fi);
		int si = r.nextInt(seconds.size());
		String s = seconds.get(si);

		return f + " " + s;

	}

	private static String listPhrase() {
		ArrayList<String> lists = new ArrayList<>();
		Random r = new Random();

		lists.add("your Tesco shopping list");
		lists.add("your murder confessions");
		lists.add("your passing thoughts on communism");
		lists.add("a detailed log of your affections for " + players.get(r.nextInt(players.size())).getName());
		lists.add("your diary's back pages");
		lists.add("the daily tabloids as dictated by Stevie Wonder");
		lists.add("a badly written Twilight fanfiction");
		lists.add("your face rubbed across the keyboard");
		lists.add("your letter to Santa");

		int index = r.nextInt(lists.size());
		String f = lists.get(index);

		return f + "." + '\n';

	}

	private static void processUnclaimedPokemon(ArrayList<String> pool, String tierLabel) {
		Collections.sort(pool);
		String tierBin = tierLabel + ": " + pool.toString();
		swappingPool += tierBin + '\n';
	}

	private static void printPicks(ArrayList<String> tier) {
		String line = "";
		if (tier.size() % 3 == 0) {
			for (int i = 0; i < tier.size(); i++) {
				line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
				i++;
				line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
				i++;
				line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
				System.out.println(line);
				line = "";
			}
		} else {
			if (tier.size() % 3 == 1) {
				for (int i = 0; i < tier.size() - 1; i++) {
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					System.out.println(line);
					line = "";
				}
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				System.out.println(line);
			} else {
				for (int i = 0; i < tier.size() - 2; i++) {
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					System.out.println(line);
					line = "";
				}
				line += rpad("" + (tier.size() - 1) + ") " + tier.get(tier.size() - 2), 40);
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				System.out.println(line);
			}
		}
	}

	private static String printSnekAndPools() {
		String padding = "                ";
		String snek = rpad(padding, 12) + "_Y_" + '\n';
		snek += rpad(padding, 11) + "/' '\\" + '\n';
		snek += rpad(padding, 10) + "|     |" + '\n';
		snek += rpad(padding, 11) + "\\   /" + '\n';
		snek += rpad(padding, 11) + "|  |" + '\n';

		for (Player p : players) {
			snek += rpad(p.getName() + padding, 11) + "|  |  " + p.getPoolAsString() + '\n';
			snek += rpad(padding, 11) + "|  |" + '\n';
		}

		snek += rpad(padding, 11) + "\\__/" + '\n';

		return snek;

	}

	public static String rpad(String inStr, int finalLength) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, finalLength);
	}
}
