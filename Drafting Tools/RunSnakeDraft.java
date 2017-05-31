
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RunSnakeDraft {

	public static ArrayList<Player> players = new ArrayList<>();
	public static ArrayList<ArrayList<String>> tiers = new ArrayList<ArrayList<String>>();
	public static String tierLeftovers = "Swapping pools:" + '\n';
	public static String input;

	public static void main(String[] args) throws Exception {

		Interface Interface = new Interface();
		Interface.createAndShowGUI(true);
		
		fillPools();
		for (ArrayList a : tiers) {
			Collections.sort(a);
		}
		capturePlayers();
		handleDraft(tiers);
		offerTrades();
		saveFile();
	}

	private static void handleDraft(ArrayList<ArrayList<String>> pools2) {
		for (ArrayList<String> tier : pools2) {

			int maxFromTier = Math.floorDiv((tier.size()), players.size());

			int counter = 0;
			while (counter < maxFromTier && tier.size() > 0) {
				for (int i = 0; i < players.size(); i++) {
					wipeScreen();
					Interface.postString(printSnekAndPools());
					System.out.println();
					askPlayerToPickOne(players.get(i), tier, (maxFromTier - counter));
				}
				Collections.reverse(players);
				counter++;
			}
			processUnclaimedPokemon(tier);
		}
	}

	private static void fillPools() throws IOException {
		File file = new File("Tiers.txt");
		if (file.exists()) {
			loadPools(file);
		} else {
			Interface.postString("Couldn't find the file to load tiers from.");
			Interface.postString(
					"Please ensure that the file is called 'Tiers.txt', and is in the same folder or location as this application.");
			Interface.postString("Each tier should be on a separate line, separated by commas.");
			
			
			
			waitForUserInput();
		}
	}

	private static void loadPools(File file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
			String line = br.readLine();
			while (line != null) {
				tiers.add(parseLine(line));
				line = br.readLine();
			}
		} catch (IOException e) {
			Interface.postString("Error reading supplied file.");
		}

		finally {
			br.close();
		}
	}

	private static ArrayList<String> parseLine(String line) {
		ArrayList<String> tier = new ArrayList<String>();

		String[] pokemonInTier = line.split(",");
		for (String s : pokemonInTier) {
			s = trimWhitespace(s);
			tier.add(s);
		}
		return tier;
	}

	private static String trimWhitespace(String s) {
		if (s.length() == 0) {
			return s;
		}
		if (s.charAt(0) == ' ' || s.charAt(0) == '\t') {
			return trimWhitespace(s.substring(1));
		}
		if (s.charAt(s.length() - 1) == ' ' || s.charAt(s.length() - 1) == '\t') {
			return trimWhitespace(s.substring(0, s.length() - 1));
		}
		return s;
	}

	private static void capturePlayers() throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			Interface.postString("Enter the number of players in this draft!");
			waitForUserInput();
			int numberOfPlayers = Integer.parseInt(input);
			input = null;
			generatePlayers(numberOfPlayers);
		} catch (Exception e) {
			input = null;
			Interface.postString("I said *number*, you " + freshInsult() + ".");
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
			Interface.postString("Enter the name of the player in position " + (i + 1) + " of the snake.");
			waitForUserInput();
			String pName = input;
			input = null;
			players.add(new Player(pName));
		}
	}

	private static void draftManager(ArrayList<String> pool, String tierLabel) {
		Interface.postString("Time to draft " + tierLabel + ".");
		Interface.postString("");

		int maxFromTier = Math.floorDiv((pool.size()), players.size());

		int counter = 0;
		while (counter < maxFromTier && pool.size() > 0) {
			for (int i = 0; i < players.size(); i++) {
				wipeScreen();
				printEachPlayersArsenal();
				Interface.postString("");
				askPlayerToPickOne(players.get(i), pool, (maxFromTier - counter));
			}
			Collections.reverse(players);
			counter++;
		}
		processUnclaimedPokemon(pool);
	}

	private static void wipeScreen() {
		Interface.wipePane();
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
			Interface.postString(p.getName() + ", your picks are as follows!" + '\n' + "(Already in your arsenal: "
					+ p.getPoolAsString() + ")" + '\n');
			Interface.postString("Your have " + amountFromTier + " pick(s) left from this tier." + '\n');
			printPicks(tier);
			Interface.postString("");
			Interface.postString("Which do you want?");
			Interface.postString("Alternatively, enter 999 to see the drafted picks.");
			waitForUserInput();
			int pick = Integer.parseInt(input);
			input = null;
			if (pick == 999) {
				Interface.postString(printSnekAndPools());
				askPlayerToPickOne(p, tier, amountFromTier);
			} else {
				p.claimsPick(tier.remove(pick - 1));
			}
			saveFile();
		} catch (Exception e) {
			input = null;
			Interface.postString("Well that's just wrong, you " + freshInsult() + ".");
			Interface.postString("I wanted a number, not " + listPhrase());
			askPlayerToPickOne(p, tier, amountFromTier);
		}
	}

	private static void offerTrades() throws Exception {
		boolean allSatisfiedWithTrades = false;

		while (!allSatisfiedWithTrades) {

			int playerIndex = 0;
			Interface.postString(printSnekAndPools());
			Interface.postString("");
			Interface.postString("Anyone looking to instigate a trade?");
			for (Player p : players) {
				Interface.postString("" + (playerIndex + 1) + ") " + p.getName());
				playerIndex++;
			}
			Interface.postString("0) No thanks.");

			waitForUserInput();
			int buyerIndex = Integer.parseInt(input);
			input = null;

			switch (buyerIndex) {
			case 0:
				allSatisfiedWithTrades = true;
				break;
			default:
				if (buyerIndex <= players.size()) {
					Player buyer = players.get(buyerIndex - 1);
					Interface.postString("");
					Interface.postString("And, you're wanting to trade with whom?");

					for (int i = 0; i < players.size(); i++) {
						if (players.get(i) != buyer) {
							Interface.postString("" + (i + 1) + ") " + players.get(i).getName());
						}
					}
					waitForUserInput();
					int sellerIndex = Integer.parseInt(input);
					input = null;
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
		output += tierLeftovers;

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

		Interface.postString(p1.getName() + "'s pool:");
		int index = 1;
		for (String s : p1.getPool()) {
			Interface.postString("" + index + ") " + s);
			index++;
		}
		Interface.postString("999) Cancel transaction" + '\n');

		waitForUserInput();
		int decision = Integer.parseInt(input);
		input = null;
		if (decision == 999) {
			wipeScreen();
			Interface.postString("Trade cancelled.");
			return;
		}
		String trading = p1.getPool().get(decision - 1);

		Interface.postString("Trade " + trading + " for what?");
		index = 1;
		for (String s : p2.getPool()) {
			Interface.postString("" + index + ") " + s);
			index++;
		}
		Interface.postString("999) Cancel transaction" + '\n');

		waitForUserInput();
		decision = Integer.parseInt(input);
		input = null;
		if (decision == 999) {
			wipeScreen();
			Interface.postString("Trade cancelled.");
			return;
		}
		String tradeBack = p2.getPool().get(decision - 1);

		p1.getPool().add(tradeBack);
		p1.getPool().remove(trading);
		p2.getPool().add(trading);
		p2.getPool().remove(tradeBack);

		wipeScreen();
		Interface.postString("Trade completed. (" + trading + " -> " + tradeBack + ")." + '\n');
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
		firsts.add("questionable");
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
		seconds.add("mongrel");
		seconds.add("subhuman");
		seconds.add("decoy");
		seconds.add("refuse");
		seconds.add("accident");
		seconds.add("caveman");
		seconds.add("excuse");
		seconds.add("mushroom");
		seconds.add("landfill");
		seconds.add("plaguespitter");
		seconds.add("vermin");
		seconds.add("kernel");
		seconds.add("cad");
		seconds.add("ragamuffin");
		seconds.add("flawbasket");
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
		lists.add("your repeat prescription from a dyslexic chemist");
		lists.add("your passing thoughts on communism");
		lists.add("a detailed log of your affections for " + players.get(r.nextInt(players.size())).getName());
		lists.add("your diary's back pages");
		lists.add("the daily tabloids as dictated by Stevie Wonder");
		lists.add("a badly written Twilight fanfiction");
		lists.add("your face rubbed across the keyboard");
		lists.add("the lyrics to Ting Tang Walla Walla Bing Bang in Urdu");
		lists.add("your letter to Santa");

		int index = r.nextInt(lists.size());
		String f = lists.get(index);

		return f + "." + '\n';

	}

	private static void processUnclaimedPokemon(ArrayList<String> pool) {
		Collections.sort(pool);
		if (pool.size() > 0) {
			String tierBin = pool.toString();
			tierLeftovers += tierBin + '\n';
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
				Interface.postString(line);
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
					Interface.postString(line);
					line = "";
				}
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				Interface.postString(line);
			} else {
				for (int i = 0; i < tier.size() - 2; i++) {
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					i++;
					line += rpad("" + (i + 1) + ") " + tier.get(i), 40);
					Interface.postString(line);
					line = "";
				}
				line += rpad("" + (tier.size() - 1) + ") " + tier.get(tier.size() - 2), 40);
				line += "" + (tier.size()) + ") " + tier.get(tier.size() - 1);
				Interface.postString(line);
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
