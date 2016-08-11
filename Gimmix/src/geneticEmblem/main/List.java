package geneticEmblem.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import geneticEmblem.units.*;


public class List {

	static ArrayList<Unit> arena = new ArrayList<Unit>();
	static Boolean on = true;
	static Scanner input = new Scanner(System.in);

	static HashMap<String, Integer> matchupsSeen = new HashMap<String, Integer>();

	public static void main(String[] args) {

		while (on) {
			System.out.println();
			System.out.println("===Choose a command===");
			System.out.println("0: The usual (25k each, 1024 remain, report).");
			System.out.println("1: Add a number of each class to the arena.");
			System.out.println("11: Add 3333 of each class to the arena.");
			System.out.println("2: View a single match.");
			System.out.println("22: Run until 2048 number remain.");
			System.out.println("222: Run until specified number remain.");
			System.out.println("3: See the top 8 in the arena.");
			System.out.println("5: Report on the surviving units.");
			System.out.println("69: Clear the arena.");
			System.out.println("999: Quit.");
			System.out.println();
			int choice = input.nextInt();
			// int choice = 0;

			switch (choice) {

			case 0:
				addEachClass(50000);
				levelTheDudesTo(10, arena);
				deathmatch(2048);
				System.out.println();
				showSurvivors();
				on = false;
				break;

			case 1:
				System.out.println("How many of each class should be added?");
				int number = input.nextInt();
				addEachClass(number);
				System.out.println("What level should everyone start at?");
				number = input.nextInt();
				levelTheDudesTo(number, arena);
				break;

			case 11:
				addEachClass(3333);
				break;

			case 2:
				deathmatch(arena.size() - 1);
				break;

			case 22:
				deathmatch(2048);
				break;

			case 222:
				System.out.println("How many units should remain standing?");
				int number1 = input.nextInt();
				deathmatch(number1);
				break;

			case 3:
				scry(8);
				break;

			case 5:
				showSurvivors();
				break;

			case 69:
				arena.clear();
				break;

			case 999:
				on = false;
				input.close();
				break;
			}
		}
	}

	private static void showSurvivors() {
		HashMap<String, Integer> survivors = reportOnSurvivors();
		printMap(survivors);
	}

	private static HashMap<String, Integer> reportOnSurvivors() {
		HashMap<String, Integer> survivors = new HashMap<String, Integer>();
		for (Unit u : arena) {
			if (!survivors.containsKey(u.getJob())) {
				survivors.put(u.getJob(), 1);
			} else {
				survivors.put(u.getJob(), survivors.get(u.getJob()) + 1);
			}
		}
		return survivors;
	}

	private static void printMap(HashMap<String, Integer> survivors) {
		@SuppressWarnings("rawtypes")
		Iterator it = survivors.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "s: " + pair.getValue());
		}
	}

	private static void deathmatch(int i) {
		while (arena.size() > i && i > 0) {
			Unit unit1 = arena.remove(0);
			Unit unit2 = arena.remove(0);
			Unit victor = fight(unit1, unit2);

			victor.levelUp();
			arena.add(victor);
			System.out.println("We have our winner! " + victor.getName() + " the Lv" + victor.getLv() + " "
					+ victor.getJob() + "!");
		}
	}

	private static Unit fight(Unit unit1, Unit unit2) {

		System.out.println("Behold, " + unit1.getName() + " the Lv" + unit1.getLv() + " " + unit1.getJob() + "!");
		System.out.println("Versus " + unit2.getName() + " the Lv" + unit2.getLv() + " " + unit2.getJob() + "!");
		Unit victor = null;

		if (unit1.getJob().equals(unit2.getJob())) {
			int unit1total = unit1.getHpBase() + unit1.getStrBase() + unit1.getSkillBase() + unit1.getLuckBase()
					+ unit1.getSpeedBase() + unit1.getDefBase() + unit1.getResBase();
			int unit2total = unit2.getHpBase() + unit2.getStrBase() + unit2.getSkillBase() + unit2.getLuckBase()
					+ unit2.getSpeedBase() + unit2.getDefBase() + unit2.getResBase();
			if (unit2total > unit1total) {
				victor = unit2;
			} else {
				victor = unit1;
			}
		} else {
			int turnCounter = 1;
			while (isAlive(unit1) && isAlive(unit2) && turnCounter < 51) {
				if (isAlive(unit1) && isAlive(unit2)) {
					System.out.println(unit1.getName() + " swings at " + unit2.getName() + "!");
					unit1.swingAt(unit2);
				}
				if (isAlive(unit1) && isAlive(unit2)) {
					System.out.println(unit2.getName() + " swings at " + unit1.getName() + "!");
					unit2.swingAt(unit1);
				}
				if (isAlive(unit1) && isAlive(unit2) && unit1.greatlyOutspeeds(unit2)
						&& !unit2.greatlyOutspeeds(unit1)) {
					System.out.println(unit1.getName() + " swings at " + unit2.getName() + "!");
					unit1.swingAt(unit2);
				} else if (isAlive(unit1) && isAlive(unit2) && !unit1.greatlyOutspeeds(unit2)
						&& unit2.greatlyOutspeeds(unit1)) {
					System.out.println(unit2.getName() + " swings at " + unit1.getName() + "!");
					unit2.swingAt(unit1);
				}
				turnCounter++;
			}

			if (isAlive(unit1) && !isAlive(unit2)) {
				victor = unit1;
			} else if (!isAlive(unit1) && isAlive(unit2)) {
				victor = unit2;
			} else {
				int unit1total = unit1.getHpBase() + unit1.getStrBase() + unit1.getSkillBase() + unit1.getLuckBase()
						+ unit1.getSpeedBase() + unit1.getDefBase() + unit1.getResBase();
				int unit2total = unit2.getHpBase() + unit2.getStrBase() + unit2.getSkillBase() + unit2.getLuckBase()
						+ unit2.getSpeedBase() + unit2.getDefBase() + unit2.getResBase();
				if (unit2total > unit1total) {
					victor = unit2;
				} else {
					victor = unit1;
				}
			}
		}
		System.out.println();
		return victor;
	}

	private static boolean isAlive(Unit unit) {
		if (unit.getCurrentHp() > 0) {
			return true;
		}
		return false;
	}

	private static void scry(int i) {
		for (int x = 0; x < i && x < arena.size(); x++) {
			printDetailedUnitDescription(arena.get(x), x + 1);
		}
	}

	private static void printDetailedUnitDescription(Unit unit, int i) {
		System.out.println("" + i + ": " + unit.getName() + " the " + unit.getJob() + ".  " + "Lv: " + unit.getLv()
				+ ",  HP: " + unit.getHpBase() + ",  Str: " + unit.getStrBase() + ",  Skill: " + unit.getSkillBase()
				+ ",  Speed: " + unit.getSpeedBase() + ",  Luck: " + unit.getLuckBase() + ",  Def: " + unit.getDefBase()
				+ ",  Res: " + unit.getResBase() + ".");
	}

	private static void addEachClass(int i) {
		for (int x = 0; x < i; x++) {
			arena.add(new Soldier());
			arena.add(new Hero());
			arena.add(new Valkyrie());
			arena.add(new Warrior());
			arena.add(new Berserker());
			arena.add(new Sniper());
			arena.add(new Falcoknight());
			arena.add(new WyvernLord());
			arena.add(new Druid());
			arena.add(new AxeLord());
			arena.add(new LanceLord());
			arena.add(new General());
			arena.add(new Tarmogoyf());
			arena.add(new GrimRider());
			arena.add(new Bishop());
			arena.add(new Swordmaster());
			arena.add(new MageKnight());
			arena.add(new Sage());
			arena.add(new Necromancer());
			arena.add(new Crusader());
			arena.add(new Paladin());
			arena.add(new Mogall());
			arena.add(new ReflectorMage());
			arena.add(new Cleric());
			arena.add(new NomadTrooper());
			arena.add(new Assassin());

		}
		Collections.shuffle(arena);
	}

	public static void levelTheDudesTo(int lv, ArrayList<Unit> dudes) {
		for (Unit u : dudes) {
			for (int i = 0; i < lv - 1; i++) {
				u.levelUp();
			}
		}
	}
}
