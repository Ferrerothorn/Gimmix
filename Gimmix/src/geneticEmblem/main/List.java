package geneticEmblem.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import geneticEmblem.units.generated.*;
import geneticEmblem.units.ootb.*;
import geneticEmblem.weapons.*;

public class List {

	static ArrayList<Unit> arena = new ArrayList<Unit>();
	static Boolean on = true;
	static Scanner input = new Scanner(System.in);
	static int maxArenaSize;

	static int baseHP;
	static int strBase;
	static int skillBase;
	static int speedBase;
	static int luckBase;
	static int defBase;
	static int resBase;

	static int hpGr;
	static int strGr;
	static int skillGr;
	static int speedGr;
	static int luckGr;
	static int defGr;
	static int resGr;

	static int strCap;
	static int speedCap;
	static int skillCap;
	static int defCap;
	static int resCap;

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
			System.out.println("55: Report statistics on surviving race.");
			System.out.println("69: Genetically modify a new unit.");
			System.out.println("999: Quit.");
			System.out.println();
			int choice = input.nextInt();
			// int choice = 69;

			switch (choice) {

			case 0:
				addEachClass(25000);
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

			case 55:
				System.out.println(calcStDev(arena));
				break;

			case 69:
				System.out.println("Adding initial population to the arena.");
				addEachClass(20000);
				System.out.println("Leveling population up.");
				levelTheDudesTo(10, arena);
				System.out.println("Commencing deathmatch.");
				deathmatch(1024);
				System.out.println();
				double initialStDev = calcStDev(arena);

				String mostCommonWeapon = getWeaponMetagame(arena);
				System.out.println("The metagame is trending towards " + mostCommonWeapon + ".");

				boolean foundNewGuy = false;

				ArrayList<Weapon> armory = new ArrayList<Weapon>();

				populateArmory(mostCommonWeapon, armory);

				while (!foundNewGuy) {
					System.out.println("The target to beat is " + initialStDev + ".");
					arena.clear();
					addEachClass(20000);
					Random random = new Random();
					int weaponIndex = random.nextInt(armory.size());
					Weapon newWeapon = armory.get(weaponIndex);

					generateNewUnitStats();

					for (int i = 0; i < 20000; i++) {
						Custom custom = new Custom(newWeapon, baseHP, 0, strBase, skillBase, speedBase, luckBase,
								defBase, resBase, hpGr, strGr, skillGr, speedGr, luckGr, defGr, resGr, strCap, speedCap,
								skillCap, defCap, resCap);
						arena.add(custom);
					}

					levelTheDudesTo(10, arena);
					deathmatch(1024);
					double newStDev = calcStDev(arena);
					System.out.println("The new balance measure is " + newStDev + ".");

					if (newStDev < initialStDev) {
						System.out.println("import geneticEmblem.units.ootb.Unit;" + '\n');
						System.out.println("import geneticEmblem.weapons.*;" + '\n');
						System.out.println("public class XXX extends Unit { " + '\n');
						System.out.println("public XXX() {" + '\n');
						System.out.println("    this.setJob();" + '\n');
						System.out.println("    this.setWeapon(new " + newWeapon.getName() + "());");
						System.out.println("    this.setHpBase(" + baseHP + ");");
						System.out.println("    this.setCurrentHp(this.getHpBase());");
						System.out.println("    this.setStrBase(" + strBase + ");");
						System.out.println("    this.setSkillBase(" + skillBase + ");");
						System.out.println("    this.setSpeedBase(" + speedBase + ");");
						System.out.println("    this.setLuckBase(" + luckBase + ");");
						System.out.println("    this.setDefBase(" + defBase + ");");
						System.out.println("    this.setResBase(" + resBase + ");");
						System.out.println();
						System.out.println("    this.setHpGr(" + hpGr + ");");
						System.out.println("    this.setStrGr(" + strGr + ");");
						System.out.println("    this.setSkillGr(" + skillGr + ");");
						System.out.println("    this.setSpeedGr(" + speedGr + ");");
						System.out.println("    this.setLuckGr(" + luckGr + ");");
						System.out.println("    this.setDefGr(" + defGr + ");");
						System.out.println("    this.setResGr(" + resGr + ");");
						System.out.println();
						System.out.println("    this.setStrCap(" + strCap + ");");
						System.out.println("    this.setSkillCap(" + skillCap + ");");
						System.out.println("    this.setSpeedCap(" + speedCap + ");");
						System.out.println("    this.setDefCap(" + defCap + ");");
						System.out.println("    this.setResCap(" + resCap + ");");
						System.out.println("    }");
						System.out.println("}");
						System.out.println();
						System.out.println();
						// foundNewGuy = true;
						// on = false;
					}
				}
				break;

			case 999:
				on = false;
				input.close();
				break;
			}
		}
	}

	private static void populateArmory(String weaponPreference, ArrayList<Weapon> armory) {
		if (weaponPreference.equals("Axe")) {
			armory.add(new IronSword());
			armory.add(new SteelSword());
			armory.add(new IronGun());
		} else if (weaponPreference.equals("Sword")) {
			armory.add(new IronLance());
			armory.add(new IronGun());
		} else if (weaponPreference.equals("Lance")) {
			armory.add(new IronAxe());
			armory.add(new IronGun());
		} else if (weaponPreference.equals("Dark")) {
			armory.add(new IronGun());
			armory.add(new Shine());
			armory.add(new Lightning());
		} else if (weaponPreference.equals("Light")) {
			armory.add(new Fire());
			armory.add(new Thunder());
		} else if (weaponPreference.equals("Anima")) {
			armory.add(new Flux());
		} else if (weaponPreference.equals("Claw")) {
			armory.add(new SteelBow());
			armory.add(new IronBow());
		} else if (weaponPreference.equals("Shield")) {
			armory.add(new SharpClaw());
		} else if (weaponPreference.equals("Bow")) {
			armory.add(new DivineShield());
		} else {
			armory.add(new IronGun());
		}
	}

	private static String getWeaponMetagame(ArrayList<Unit> arena2) {
		int axe = 0;
		int lance = 0;
		int sword = 0;
		int light = 0;
		int dark = 0;
		int anima = 0;
		int shield = 0;
		int claw = 0;
		int bow = 0;
		int gun = 0;
		for (Unit u : arena) {
			String s = u.getWeapon().getTrinity();
			switch (s) {
			case "Axe":
				axe++;
				break;
			case "Sword":
				sword++;
				break;
			case "Lance":
				lance++;
				break;
			case "Dark":
				dark++;
				break;
			case "Light":
				light++;
				break;
			case "Anima":
				anima++;
				break;
			case "Bow":
				bow++;
				break;
			case "Claw":
				claw++;
				break;
			case "Shield":
				shield++;
				break;
			case "Gun":
				gun++;
				break;
			}
		}
		if (sword == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Sword";
		}
		if (lance == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Lance";
		}
		if (axe == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Axe";
		}
		if (anima == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Anima";
		}
		if (dark == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Dark";
		}
		if (light == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Light";
		}
		if (shield == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Shield";
		}
		if (claw == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Claw";
		}
		if (gun == isMostPrevalent(sword, axe, lance, anima, dark, light, bow, shield, claw, gun)) {
			return "Sword";
		}
		return "Bow";
	}

	private static int isMostPrevalent(int sword, int axe, int lance, int anima, int dark, int light, int bow,
			int shield, int claw, int gun) {
		if (sword > axe && sword > lance && sword > light && sword > dark && sword > anima && sword > shield
				&& sword > bow && sword > claw && sword > gun) {
			return sword;
		} else if (lance > axe && lance > anima && lance > dark && lance > light && lance > shield && lance > claw
				&& lance > bow && lance > gun) {
			return lance;
		} else if (axe > anima && axe > dark && axe > light && axe > shield && axe > claw && axe > bow && axe > gun) {
			return axe;
		} else if (anima > dark && anima > light && anima > shield && anima > claw && anima > bow && anima > gun) {
			return anima;
		} else if (light > dark && light > shield && light > claw && light > bow && light > gun) {
			return light;
		} else if (dark > shield && dark > claw && dark > bow && dark > gun) {
			return dark;
		} else if (bow > shield && bow > claw && bow > gun) {
			return bow;
		} else if (claw > shield && claw > gun) {
			return claw;
		} else if (gun > shield) {
			return gun;
		}
		return shield;
	}

	private static void generateNewUnitStats() {
		Random r = new Random();
		generateBases(r);
		generateGrowthRates(r);
		generateCaps(r);

		if (skillBase > strBase && skillCap < strCap) {
			generateNewUnitStats();
		}
		if (strBase > skillBase && strCap < skillCap) {
			generateNewUnitStats();
		}
		if ((luckBase >= strBase || luckBase >= skillBase || luckBase >= speedBase || luckBase >= defBase
				|| luckBase >= resBase)
				&& (luckGr < strGr || luckGr < skillGr || luckGr < speedGr || luckGr < defGr || luckGr < resGr)) {
			generateNewUnitStats();
		}
		if (skillGr > speedGr && speedCap > skillCap) {
			generateNewUnitStats();
		}
		if (strGr > defGr && defCap > strCap) {
			generateNewUnitStats();
		}
		if (skillBase > strBase && skillBase > speedBase && (skillGr < strGr || skillGr < speedGr)) {
			generateNewUnitStats();
		}
		if (strBase > speedBase && speedGr > strGr) {
			generateNewUnitStats();
		}
		if (strBase > skillBase && skillGr > strGr) {
			generateNewUnitStats();
		}
		if (speedBase > defBase && defGr > speedGr) {
			generateNewUnitStats();
		}
		if (speedBase > resBase && resGr > speedGr) {
			generateNewUnitStats();
		}
		if ((defBase > resBase && resGr > defGr) || (resBase > defBase && defGr > resGr)) {
			generateNewUnitStats();
		}
		if ((defCap > resCap && resGr > defGr) || (resCap > defCap && defGr > resGr)) {
			generateNewUnitStats();
		}
		if ((defBase > resBase && resCap > defCap) || (resBase > defBase && defCap > resCap)) {
			generateNewUnitStats();
		}

	}

	private static void generateCaps(Random r) {

		strCap = r.nextInt(11);
		strCap += 20;
		speedCap = r.nextInt(11);
		speedCap += 20;
		skillCap = r.nextInt(11);
		skillCap += 20;
		defCap = r.nextInt(11);
		defCap += 20;
		resCap = r.nextInt(11);
		resCap += 20;

		int sumCaps = strCap + speedCap + skillCap + defCap + resCap;

		if (sumCaps < 127 || sumCaps > 131) {
			generateCaps(r);
		}
	}

	private static void generateGrowthRates(Random r) {
		hpGr = r.nextInt(13);
		hpGr += 4;
		hpGr *= 5;
		strGr = r.nextInt(13);
		strGr += 4;
		strGr *= 5;
		skillGr = r.nextInt(13);
		skillGr += 4;
		skillGr *= 5;
		speedGr = r.nextInt(13);
		speedGr += 4;
		speedGr *= 5;
		luckGr = r.nextInt(13);
		luckGr += 4;
		luckGr *= 5;
		defGr = r.nextInt(13);
		defGr += 4;
		defGr *= 5;
		resGr = r.nextInt(13);
		resGr += 4;
		resGr *= 5;
		int sumGRs = hpGr + strGr + skillGr + speedGr + luckGr + defGr + resGr;

		if (sumGRs != 310) {
			generateGrowthRates(r);
		}
	}

	private static void generateBases(Random r) {
		baseHP = r.nextInt(7);
		baseHP += 20;
		strBase = r.nextInt(5);
		strBase += 5;
		skillBase = r.nextInt(5);
		skillBase += 5;
		speedBase = r.nextInt(5);
		speedBase += 5;
		luckBase = r.nextInt(6);
		luckBase += 2;
		defBase = r.nextInt(6);
		defBase += 2;
		resBase = r.nextInt(6);
		resBase += 1;
		int sumBases = strBase + skillBase + speedBase + luckBase + defBase + resBase;

		if (sumBases != 37) {
			generateBases(r);
		}
	}

	private static double calcStDev(ArrayList<Unit> arena2) {
		HashMap<String, Integer> survivors = reportOnSurvivors();
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

		ArrayList<Double> meanSubs = new ArrayList<Double>();
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

		return sum;
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

	private static void deathmatch(int i) {
		maxArenaSize = arena.size();

		while (arena.size() > i && i > 0) {
			Unit unit1 = arena.remove(0);
			Unit unit2 = arena.remove(0);
			Unit victor = unit1.fight(unit2);

			victor.levelUp();
			arena.add(victor);
			// System.out.println("We have our winner! " + victor.getName() + "
			// the Lv" + victor.getLv() + " "
			// + victor.getJob() + "!");
			// System.out.println(maxArenaSize - (maxArenaSize - arena.size()));
		}
	}

	private static void scry(int i) {
		for (int x = 0; x < i && x < arena.size(); x++) {
			arena.get(x).printDetailedUnitDescription(x + 1);
		}
	}

	private static void addEachClass(int i) {
		for (int x = 0; x < i; x++) {
			arena.add(new Soldier());
			arena.add(new Warrior());
			arena.add(new Berserker());
			arena.add(new Sniper());
			arena.add(new Falcoknight());
			arena.add(new Druid());
			arena.add(new General());
			arena.add(new Tarmogoyf());
			arena.add(new Bishop());
			arena.add(new Swordmaster());
			arena.add(new MageKnight());
			arena.add(new Sage());
			arena.add(new Necromancer());
			arena.add(new Crusader());
			arena.add(new Mogall());
			arena.add(new ReflectorMage());
			arena.add(new Cleric());
			arena.add(new NomadTrooper());
			arena.add(new Assassin());

			arena.add(new Entombed());
			arena.add(new FirePoison());
			arena.add(new Noble());
			arena.add(new Brigand());
			arena.add(new Reaper());
			arena.add(new SnapcasterMage());
			arena.add(new Saint());
			arena.add(new Lancemaster());
			arena.add(new Raider());
			arena.add(new Crossbowman());
			arena.add(new Gunslinger());
			arena.add(new Page());

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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sortByValues(HashMap map) {
		LinkedList list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
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