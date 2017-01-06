package sevenWondersManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import packDraftManager.Player;

public class Table {

	public static ArrayList<Player> players = new ArrayList<>();

	public static ArrayList<String> firstAge = new ArrayList<>();
	public static ArrayList<String> secondAge = new ArrayList<>();
	public static ArrayList<String> thirdAge = new ArrayList<>();

	static ArrayList<ArrayList<String>> packs = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);
	static int numberOfPlayers;

	public static void main(String[] args) {

		generatePacks();
		System.out.println("How many players in this Seven Wonders?");
		numberOfPlayers = sc.nextInt();

		createPlayers(numberOfPlayers);
		Collections.shuffle(players);

		packs = generatePacks(firstAge);
		distributePacks();

		while (aPackContainsSomething()) {
			for (Player p : players) {
				askPlayerToPickOne(p);
			}
			rotatePacks();
		}
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
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= playerNo; i++) {
			System.out.println("Gimme the name of player " + i + ".");
			String name = scanner.nextLine();
			players.add(new Player(name));
		}
	}

	private static void generatePacks() {

		firstAge.add("Altar");
		firstAge.add("Guard Tower");
		firstAge.add("Clay Pool");
		firstAge.add("Workshop");
		firstAge.add("Apothecary");
		firstAge.add("Scriptorium");
		firstAge.add("Glassworks");
		firstAge.add("Clay Pit");
		firstAge.add("Baths");
		firstAge.add("Ore Vein");
		firstAge.add("Stone Pit");
		firstAge.add("Marketplace");
		firstAge.add("Barracks");
		firstAge.add("East Trading Post");
		firstAge.add("West Trading Post");
		firstAge.add("Loom");
		firstAge.add("Timber Yard");
		firstAge.add("Theater");
		firstAge.add("Lumber Yard");
		firstAge.add("Stockade");
		firstAge.add("Press");

		if (players.size() > 3) {
			firstAge.add("Ore Vein");
			firstAge.add("Lumber Yard");
			firstAge.add("Tavern");
			firstAge.add("Guard Tower");
			firstAge.add("Pawn Shop");
			firstAge.add("Scriptorium");
			firstAge.add("Excavation");
		}

		if (players.size() > 4) {
			firstAge.add("Barracks");
			firstAge.add("Forest Cave");
			firstAge.add("Stone Pit");
			firstAge.add("Clay Pool");
			firstAge.add("Apothecary");
			firstAge.add("Altar");
			firstAge.add("Tavern");
		}

		if (players.size() > 5) {
			firstAge.add("Glassworks");
			firstAge.add("Press");
			firstAge.add("Theater");
			firstAge.add("Tree Farm");
			firstAge.add("Marketplace");
			firstAge.add("Mine");
			firstAge.add("Loom");
		}

		if (players.size() > 6) {
			firstAge.add("Stockade");
			firstAge.add("Pawn Shop");
			firstAge.add("Workshop");
			firstAge.add("West Trading Post");
			firstAge.add("Tavern");
			firstAge.add("East Trading Post");
			firstAge.add("Baths");
		}

		Collections.shuffle(firstAge);

		secondAge.add("Stables");
		secondAge.add("Archery Range");
		secondAge.add("Foundry");
		secondAge.add("School");
		secondAge.add("Loom");
		secondAge.add("Dispensary");
		secondAge.add("Courthouse");
		secondAge.add("Glassworks");
		secondAge.add("Brickyard");
		secondAge.add("Vineyard");
		secondAge.add("Forum");
		secondAge.add("Temple");
		secondAge.add("Quarry");
		secondAge.add("Sawmill");
		secondAge.add("Laboratory");
		secondAge.add("Aqueduct");
		secondAge.add("Press");
		secondAge.add("Walls");
		secondAge.add("Caravansery");
		secondAge.add("Library");
		secondAge.add("Statue");

		if (players.size() > 3) {
			secondAge.add("Bazaar");
			secondAge.add("Dispensary");
			secondAge.add("Training Ground");
			secondAge.add("Sawmill");
			secondAge.add("Brickyard");
			secondAge.add("Foundry");
			secondAge.add("Quarry");
		}

		if (players.size() > 4) {
			secondAge.add("Glassworks");
			secondAge.add("Press");
			secondAge.add("Laboratory");
			secondAge.add("Courthouse");
			secondAge.add("Loom");
			secondAge.add("Stables");
			secondAge.add("Caravansery");
		}

		if (players.size() > 5) {
			secondAge.add("Forum");
			secondAge.add("Caravansery");
			secondAge.add("Library");
			secondAge.add("Temple");
			secondAge.add("Archery Range");
			secondAge.add("Training Ground");
			secondAge.add("Vineyard");
		}

		if (players.size() > 6) {
			secondAge.add("School");
			secondAge.add("Walls");
			secondAge.add("Aqueduct");
			secondAge.add("Bazaar");
			secondAge.add("Training Ground");
			secondAge.add("Statue");
			secondAge.add("Forum");
		}
	}

}
