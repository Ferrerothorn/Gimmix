package geneticMaple.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import geneticMaple.units.factory.*;

public class List {

	static ArrayList<Unit> arena = new ArrayList<>();
	static boolean on = true;
	static Scanner input = new Scanner(System.in);
	static CustomUnitGenerator customUnitGenerator;
	static ClassList classList;
	static int defaultLevelForExperiments = 25;

	public static void main(String[] args) {

		while (on) {
			System.out.println();
			System.out.println("===Choose a command===");
			System.out.println("0: The usual (Add 25k each, 2048 remain, report).");
			System.out.println("1: Add a number of each class to the arena.");
			System.out.println("2: View a single match.");
			System.out.println("222: Run until specified number remain.");
			System.out.println("3: See the top 8 in the arena.");
			System.out.println("5: Report on the surviving units.");
			System.out.println("55: Report statistics on surviving race.");
			System.out.println("69: Genetically modify a new unit.");
			System.out.println("88: Determine which class is healthiest to cull.");
			System.out.println("999: Quit.");
			System.out.println();
			int choice = input.nextInt();
			// int choice = 0;

			switch (choice) {

			case 0:
				addEachClass(25000, arena);
				levelTheDudesTo(defaultLevelForExperiments, arena);
				deathmatch(2048, arena);
				System.out.println();
				showSurvivors(arena);
				System.out.println();
				on = false;
				break;

			case 1:
				System.out.println("How many of each class should be added?");
				int number = input.nextInt();
				addEachClass(number, arena);
				System.out.println("What level should everyone start at?");
				number = input.nextInt();
				levelTheDudesTo(number, arena);
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

			case 3:
				scry(8);
				break;

			case 5:
				showSurvivors(arena);
				break;

			case 55:
				System.out.println(metagameBalanceMetrics(arena));
				break;

			case 69:
				addEachClass(15000, arena);
				levelTheDudesTo(defaultLevelForExperiments, arena);
				deathmatch(2048, arena);
				System.out.println();
				double initialStDev = metagameBalanceMetrics(arena);

				String mostCommonWeapon = getWeaponMetagame();
				System.out.println("The metagame is overpopulated by " + mostCommonWeapon + ".");
				System.out.println("Generating units endlessly...");

				customUnitGenerator = new CustomUnitGenerator(mostCommonWeapon);
				customUnitGenerator.populateArmory(mostCommonWeapon);

				while (true) {
					arena.clear();
					addEachClass(15000, arena);
					Custom custom = customUnitGenerator.buildUnit();

					for (int i = 0; i < 15000; i++) {
						arena.add(custom);
					}
					customUnitGenerator.generateNewUnitStats();

					Collections.shuffle(arena);
					levelTheDudesTo(defaultLevelForExperiments, arena);
					deathmatch(2048, arena);

					double newStDev = metagameBalanceMetrics(arena);
					ArrayList<Quantity> metagamePairs = new ArrayList<>();
					HashMap<String, Integer> toBeSorted = reportOnSurvivors(arena);
					sortByValues(toBeSorted);
					populate(metagamePairs, toBeSorted);

					if (newStDev <= initialStDev) {

						String fileName = "" + newStDev;
						String filePath = "C:\\Users\\sdolman\\Desktop\\Gimmix\\Gimmix\\Genetic Maple\\geneticMaple\\units\\newfags\\";
						String output = customUnitGenerator.generateCode(newStDev);

						File file = new File(filePath + fileName + ".java");
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
				}

			case 88:
				ArrayList<Unit> counter = new ArrayList<>();
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

	private static void analyseDisposableClasses(ArrayList<Unit> counter, boolean firstIteration) {

		ArrayList<Unit> tempArena = null;
		HashMap<String, Double> metagameHealth = new HashMap<>();

		System.out.println("Adding 12500 of each class to arena.");
		addEachClass(12500, arena);
		System.out.println("Leveled them all to " + defaultLevelForExperiments + ".");
		levelTheDudesTo(defaultLevelForExperiments, arena);
		System.out.println("Running deathmatch to 2048.");
		System.out.println();
		deathmatch(2048, arena);
		double defaultMetagameHealth = metagameBalanceMetrics(arena);
		arena.clear();

		System.out.println("Default metagame health determined @ " + defaultMetagameHealth + ".");
		metagameHealth.put("Default", defaultMetagameHealth);

		ArrayList<Unit> recheckThese = new ArrayList<>();

		for (Unit placeholder : counter) {
			String withoutThisClass = placeholder.getJob();
			tempArena = new ArrayList<>();
			System.out.println("Testing what life would be like without " + withoutThisClass + ".");

			addEachClass(12500, arena);
			levelTheDudesTo(defaultLevelForExperiments, arena);

			for (Unit u : arena) {
				if (!u.getJob().equals(withoutThisClass)) {
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

	private static void populate(ArrayList<Quantity> metagamePairs, HashMap<String, Integer> toBeSorted) {
		for (Map.Entry<String, Integer> entry : toBeSorted.entrySet()) {
			metagamePairs.add(new Quantity(entry.getKey(), entry.getValue()));
		}
		Collections.sort(metagamePairs);
	}

	private static void printAlternateMetagameHealth(HashMap<String, Double> metagameHealth) {

		metagameHealth = sortByValues(metagameHealth);

		@SuppressWarnings("rawtypes")
		Iterator it = metagameHealth.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "s: " + pair.getValue());
		}
	}

	private static String getWeaponMetagame() {
		int melee = 0;
		int bow = 0;
		int magic = 0;
		int stealth = 0;
		int seafare = 0;

		for (Unit u : arena) {
			ArrayList<String> s = u.getWeapon().getTrinity();
			if (s.contains("Melee")) {
				melee++;
			}
			if (s.contains("Bow")) {
				bow++;
			}
			if (s.contains("Magic")) {
				magic++;
			}
			if (s.contains("Stealth")) {
				stealth++;
			}
			if (s.contains("Seafare")) {
				seafare++;
			}
		}

		System.out.println("Melee: " + melee);
		System.out.println("Magic: " + magic);
		System.out.println("Bow: " + bow);
		System.out.println("Stealth: " + stealth);
		System.out.println("Seafare: " + seafare);
		System.out.println();

		if (melee > magic && melee > bow && melee > stealth && melee > seafare) {
			return "Melee";
		} else if (magic > bow && magic > stealth && magic > seafare) {
			return "Magic";
		} else if (bow > stealth && bow > seafare) {
			return "Bow";
		} else if (stealth > seafare) {
			return "Stealth";
		} else
			return "Seafare";
	}

	private static double metagameBalanceMetrics(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		double total = 0;
		double index = survivors.size();
		Iterator it = survivors.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			total += Integer.parseInt(pair.getValue().toString());
		}
		double mean = total / index;

		ArrayList<Double> meanSubs = new ArrayList<>();
		Iterator it2 = survivors.entrySet().iterator();
		while (it2.hasNext()) {
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

	private static void showSurvivors(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		printMap(survivors);
	}

	private static HashMap<String, Integer> reportOnSurvivors(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = new HashMap<>();
		for (Unit u : anArena) {
			if (!survivors.containsKey(u.getJob())) {
				survivors.put(u.getJob(), 1);
			} else {
				survivors.put(u.getJob(), survivors.get(u.getJob()) + 1);
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
			System.out.println(pair.getKey() + "s: " + pair.getValue());
		}
	}

	private static void deathmatch(int i, ArrayList<Unit> u) {

		if (i > 0) {
			while (u.size() > i) {
				Unit unit1 = u.remove(0);
				Unit unit2 = u.remove(0);
				Unit victor = unit1.fight(unit2);

				victor.levelUp();
				u.add(victor);
			}
		}
	}

	private static void scry(int i) {
		for (int x = 0; x < i && x < arena.size(); x++) {
			arena.get(x).printDetailedUnitDescription(x + 1);
		}
	}

	private static void addEachClass(int i, ArrayList<Unit> theArena) {
		for (int x = 0; x < i; x++) {
			classList = new ClassList();
			addEach(classList.getReleasedUnits(), theArena);
		}
		Collections.shuffle(arena);
	}

	private static void addEach(ArrayList<Unit> released, ArrayList<Unit> theArena) {
		for (Unit u : released) {
			theArena.add(u);
		}
	}

	public static void levelTheDudesTo(int lv, ArrayList<Unit> dudes) {
		for (Unit u : dudes) {
			for (int i = 1; i < lv; i++) {
				u.levelUp();
			}
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