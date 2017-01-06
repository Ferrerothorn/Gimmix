package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import factory.*;

public class List {

	static ArrayList<Deck> arena = new ArrayList<>();
	static Boolean on = true;
	static Scanner input = new Scanner(System.in);
	static ListOfDecks deckList;
	static int numberForExperiments = 500;

	public static void main(String[] args) {

		while (on) {
			System.out.println();
			System.out.println("===Choose a command===");
			System.out.println("0: The usual (Add 25k each, 2048 remain, report).");
			System.out.println("1: Add a number of each deck to the arena.");
			System.out.println("2: Run a single match.");
			System.out.println("222: Run until specified number remain.");
			System.out.println("3: See the next 8 in the arena.");
			System.out.println("5: Report on the surviving decks.");
			System.out.println("55: Show Standard Deviation.");
			System.out.println("88: Determine which deck is healthiest to cull.");
			System.out.println("999: Quit.");
			System.out.println();
			int choice = input.nextInt();
			// int choice = 0;

			switch (choice) {

			case 0:
				addEachClass(numberForExperiments, arena);
				Collections.shuffle(arena);
				deathmatch(128, arena);
				System.out.println();
				showSurvivors(arena);
				System.out.println();
				on = false;
				break;

			case 1:
				System.out.println("How many of each class should be added?");
				int number = input.nextInt();
				addEachClass(number, arena);
				break;

			case 2:
				deathmatch(arena.size() - 1, arena);
				break;

			case 22:
				deathmatch(2048, arena);
				break;

			case 222:
				System.out.println("How many units should remain standing?");
				int number1 = input.nextInt();
				deathmatch(number1, arena);
				break;

			case 5:
				showSurvivors(arena);
				break;

			case 55:
				System.out.println(metagameBalanceMetrics(arena));
				break;

			case 88:
				ArrayList<Deck> counter = new ArrayList<>();
				addEachClass(1, counter);
				Collections.shuffle(counter);
				analyseDisposableClasses(counter, true);
				break;

			case 999:
				on = false;
				input.close();
				break;
			default:
				break;
			}
		}
	}

	private static void analyseDisposableClasses(ArrayList<Deck> counter, boolean firstIteration) {

		ArrayList<Deck> tempArena = null;
		HashMap<String, Double> metagameHealth = new HashMap<>();

		System.out.println("Adding 12500 of each class to arena.");
		addEachClass(12500, arena);
		System.out.println("Running deathmatch to 2048.");
		System.out.println();
		deathmatch(2048, arena);
		double defaultMetagameHealth = metagameBalanceMetrics(arena);
		arena.clear();

		System.out.println("Default metagame health determined @ " + defaultMetagameHealth + ".");
		metagameHealth.put("Default", defaultMetagameHealth);

		ArrayList<Deck> recheckThese = new ArrayList<>();

		for (Deck placeholder : counter) {
			String withoutThisClass = placeholder.getArchetype();
			tempArena = new ArrayList<>();
			System.out.println("Testing what life would be like without " + withoutThisClass + ".");

			addEachClass(12500, arena);

			for (Deck u : arena) {
				if (!u.getArchetype().equals(withoutThisClass)) {
					tempArena.add(u);
				}
			}
			arena.clear();
			deathmatch(2048, tempArena);
			double withoutHealth = metagameBalanceMetrics(tempArena);

			if (withoutHealth < defaultMetagameHealth) {
				recheckThese.add(placeholder);
			}
			metagameHealth.put(withoutThisClass, withoutHealth);
			System.out.println("[" + withoutHealth + "]");
		}

		if (recheckThese.size() > 0 && firstIteration == true) {
			System.out.println();
			System.out.println("Some classes appear to be polluting the metagame.");
			System.out.println("Initiating recheck.");
			tempArena = null;
			metagameHealth.clear();
			analyseDisposableClasses(recheckThese, false);
		}

		sortByValues(metagameHealth);
		printAlternateMetagameHealth(metagameHealth);
	}

	public static void populate(ArrayList<Quantity> metagamePairs, HashMap<String, Integer> toBeSorted) {
		for (Map.Entry<String, Integer> entry : toBeSorted.entrySet()) {
			metagamePairs.add(new Quantity(entry.getKey(), entry.getValue()));
		}
		Collections.sort(metagamePairs);
	}

	@SuppressWarnings("unchecked")
	private static void printAlternateMetagameHealth(HashMap<String, Double> metagameHealth) {

		metagameHealth = sortByValues(metagameHealth);

		@SuppressWarnings("rawtypes")
		Iterator it = metagameHealth.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + ": " + pair.getValue());
		}
	}

	private static double metagameBalanceMetrics(ArrayList<Deck> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		double total = 0;
		double index = survivors.size();
		@SuppressWarnings("rawtypes")
		Iterator it = survivors.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			total += Integer.parseInt(pair.getValue().toString());
		}
		double mean = total / index;

		ArrayList<Double> meanSubs = new ArrayList<>();
		@SuppressWarnings("rawtypes")
		Iterator it2 = survivors.entrySet().iterator();
		while (it2.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it2.next();
			double beforeSquaring = Double.parseDouble(pair.getValue().toString());
			meanSubs.add(Math.pow(beforeSquaring - mean, 2));
		}

		double sum = 0;
		for (Double d : meanSubs) {
			sum += d;
		}
		sum /= meanSubs.size();
		sum = Math.sqrt(sum);

		return sum / survivors.size();
	}

	private static void showSurvivors(ArrayList<Deck> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		printMap(survivors);
	}

	private static HashMap<String, Integer> reportOnSurvivors(ArrayList<Deck> anArena) {
		HashMap<String, Integer> survivors = new HashMap<>();
		for (Deck u : anArena) {
			if (!survivors.containsKey(u.getArchetype())) {
				survivors.put(u.getArchetype(), 1);
			} else {
				survivors.put(u.getArchetype(), survivors.get(u.getArchetype()) + 1);
			}
		}
		return survivors;
	}

	@SuppressWarnings("unchecked")
	private static void printMap(HashMap<String, Integer> survivors) {

		survivors = sortByValues(survivors);

		@SuppressWarnings("rawtypes")
		Iterator it = survivors.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + ": " + pair.getValue());
		}
	}

	private static void deathmatch(int i, ArrayList<Deck> u) {

		if (i > 0) {
			while (u.size() > i) {
				Deck unit1 = u.remove(0);
				Deck unit2 = u.remove(0);
				Deck victor = unit1.fight(unit2);

				u.add(victor);
			}
		}
	}

	private static void addEachClass(int i, ArrayList<Deck> counter) {
		for (int x = 0; x < i; x++) {
			deckList = new ListOfDecks();
			addEach(deckList.getReleasedUnits(), counter);
		}
		Collections.shuffle(counter);
	}

	private static void addEach(ArrayList<Deck> hall, ArrayList<Deck> theArena) {
		for (Deck u : hall) {
			theArena.add(u);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sortByValues(HashMap map) {
		LinkedList list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}