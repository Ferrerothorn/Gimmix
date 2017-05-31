

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RunSnakeDraft {

	public static ArrayList<Player> players = new ArrayList<>();
	public static ArrayList<String> ouPool = new ArrayList<>();
	public static ArrayList<String> blPool = new ArrayList<>();
	public static ArrayList<String> uuPool = new ArrayList<>();
	public static ArrayList<String> bl2Pool = new ArrayList<>();
	public static ArrayList<String> ruPool = new ArrayList<>();

	public static String swappingPool = "Swapping pool:" + '\n';

	public static Scanner inputs = new Scanner(System.in);
	public static String input;

	public static void main(String[] args) throws Exception {

		GUI gui = new GUI();
		gui.createAndShowGUI(true);
		
		fillPools();
		Collections.sort(ouPool);
		Collections.sort(blPool);
		Collections.sort(uuPool);
		capturePlayers();
		draftManager(ouPool, "OU");
		draftManager(blPool, "BL");
		draftManager(uuPool, "UU");

		tradingPost();
		saveFile();
		inputs.close();
	}

	private static void fillPools() {

		ouPool.add("Alakazam (*)");
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
	}

	private static void capturePlayers() throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			GUI.postString("Enter the number of players in this draft!");
			waitForUserInput();
			int numberOfPlayers = Integer.parseInt(input);
			input = null;
			generatePlayers(numberOfPlayers);
		} catch (Exception e) {
			GUI.postString("I said *number*, you " + freshInsult() + ".");
			capturePlayers();
		}
	}

	public static void waitForUserInput() {
		while (input == null) {
			System.out.println();
		}
		if (input.length() <= 0) {
			input = null;
			waitForUserInput();
		}
	}

	private static void generatePlayers(int numberOfPlayers) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numberOfPlayers; i++) {
			GUI.postString("Enter the name of the player in position " + (i + 1) + " of the snake.");
			waitForUserInput();
			String pName = input;
			input = null;
			players.add(new Player(pName));
		}
	}

	private static void draftManager(ArrayList<String> pool, String tierLabel) {
		GUI.postString("Time to draft " + tierLabel + ".");
		GUI.postString();

		int maxFromTier = Math.floorDiv((pool.size()), players.size());

		int counter = 0;
		while (counter < maxFromTier && pool.size() > 0) {
			for (int i = 0; i < players.size(); i++) {
				wipeScreen();
				printEachPlayersArsenal();
				GUI.postString();
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
			GUI.postString(p.getName() + ", your picks are as follows!" + '\n' + "(Already in your arsenal: "
					+ p.getPoolAsString() + ")" + '\n');
			GUI.postString("Your have " + amountFromTier + " pick(s) left from this tier." + '\n');
			printPicks(tier);
			GUI.postString();
			GUI.postString("Which do you want?");
			GUI.postString("Alternatively, enter 999 to see the drafted picks.");
			waitForUserInput();
			int pick = Integer.parseInt(input);
			input = null;
			if (pick == 999) {
				GUI.postString(printSnekAndPools());
				askPlayerToPickOne(p, tier, amountFromTier);
			} else {
				p.claimsPick(tier.remove(pick - 1));
			}
			saveFile();
		} catch (Exception e) {
			GUI.postString("Well that's just wrong, you " + freshInsult() + ".");
			GUI.postString("I wanted a number, not " + listPhrase());
			askPlayerToPickOne(p, tier, amountFromTier);
		}
	}

	private static void tradingPost() throws Exception {
		boolean allSatisfiedWithTrades = false;

		while (!allSatisfiedWithTrades) {

			int playerIndex = 0;
			GUI.postString(printSnekAndPools());
			GUI.postString();
			GUI.postString("Anyone looking to instigate a trade?");
			for (Player p : players) {
				GUI.postString("" + (playerIndex + 1) + ") " + p.getName());
				playerIndex++;
			}
			GUI.postString("0) No thanks.");

			Scanner inputs1 = new Scanner(System.in);
			int buyerIndex = inputs1.nextInt();

			switch (buyerIndex) {
			case 0:
				allSatisfiedWithTrades = true;
				break;
			default:
				if (buyerIndex <= players.size()) {
					Player buyer = players.get(buyerIndex - 1);
					GUI.postString();
					GUI.postString("And, you're wanting to trade with whom?");

					for (int i = 0; i < players.size(); i++) {
						if (players.get(i) != buyer) {
							GUI.postString("" + (i + 1) + ") " + players.get(i).getName());
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

		GUI.postString(p1.getName() + "'s pool:");
		int index = 1;
		for (String s : p1.getPool()) {
			GUI.postString("" + index + ") " + s);
			index++;
		}
		GUI.postString("999) Cancel transaction" + '\n');

		int input = inputs.nextInt();
		if (input == 999) {
			wipeScreen();
			GUI.postString("Trade cancelled.");
			return;
		}
		String trading = p1.getPool().get(input - 1);

		GUI.postString("Trade " + trading + " for what?");
		index = 1;
		for (String s : p2.getPool()) {
			GUI.postString("" + index + ") " + s);
			index++;
		}
		GUI.postString("999) Cancel transaction" + '\n');

		input = inputs.nextInt();
		if (input == 999) {
			wipeScreen();
			GUI.postString("Trade cancelled.");
			return;
		}
		String tradeBack = p2.getPool().get(input - 1);

		p1.getPool().add(tradeBack);
		p1.getPool().remove(trading);
		p2.getPool().add(trading);
		p2.getPool().remove(tradeBack);

		wipeScreen();
		GUI.postString("Trade completed. (" + trading + " -> " + tradeBack + ")." + '\n');
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
		if (pool.size() > 0) {
			String tierBin = tierLabel + ": " + pool.toString();
			swappingPool += tierBin + '\n';
		}
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
				GUI.postString(line);
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
					GUI.postString(line);
					line = "";
				}
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				GUI.postString(line);
			} else {
				for (int i = 0; i < tier.size() - 2; i++) {
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					GUI.postString(line);
					line = "";
				}
				line += rpad("" + (tier.size() - 1) + ") " + tier.get(tier.size() - 2), 40);
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				GUI.postString(line);
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

	public static  void process(String text) {
		// TODO Auto-generated method stub
		
	}
}
