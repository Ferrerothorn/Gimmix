package geneticEmblem.units.factory;

import java.util.ArrayList;
import java.util.Random;

import geneticEmblem.weapons.*;

public class CustomUnitGenerator {

	int baseHP = 0;
	int strBase = 0;
	int skillBase = 0;
	int speedBase = 0;
	int luckBase = 0;
	int defBase = 0;
	int resBase = 0;

	int hpGr = 0;
	int strGr = 0;
	int skillGr = 0;
	int speedGr = 0;
	int luckGr = 0;
	int defGr = 0;
	int resGr = 0;

	int strCap = 0;
	int speedCap = 0;
	int skillCap = 0;
	int defCap = 0;
	int resCap = 0;

	ArrayList<Weapon> armory = new ArrayList<Weapon>();

	ArrayList<Weapon> swordList = new ArrayList<Weapon>();
	ArrayList<Weapon> lanceList = new ArrayList<Weapon>();
	ArrayList<Weapon> axeList = new ArrayList<Weapon>();
	ArrayList<Weapon> animaList = new ArrayList<Weapon>();
	ArrayList<Weapon> darkList = new ArrayList<Weapon>();
	ArrayList<Weapon> lightList = new ArrayList<Weapon>();
	ArrayList<Weapon> clawList = new ArrayList<Weapon>();
	ArrayList<Weapon> bowList = new ArrayList<Weapon>();
	ArrayList<Weapon> shieldList = new ArrayList<Weapon>();
	ArrayList<Weapon> gunList = new ArrayList<Weapon>();

	Weapon weapon;

	private void fillWeaponLists() {
		swordList.add(new IronSword());
		swordList.add(new AquaSaber());
		swordList.add(new Bayonet());
		swordList.add(new IronGear());
		swordList.add(new IronSword());
		swordList.add(new Knuckleduster());
		swordList.add(new WallOfSwords());
		swordList.add(new LightBrand());
		swordList.add(new Rapier());
		swordList.add(new Machete());
		swordList.add(new ShadowBlade());
		swordList.add(new SteelSword());

		lanceList.add(new ArcaneLance());
		lanceList.add(new IronLance());
		lanceList.add(new IronRake());
		lanceList.add(new Sunlance());
		lanceList.add(new PoleAxe());
		lanceList.add(new Rapier());

		axeList.add(new BoltAxe());
		axeList.add(new DevilAxe());
		axeList.add(new HuntersGear());
		axeList.add(new Machete());
		axeList.add(new IronAxe());
		axeList.add(new PoleAxe());

		animaList.add(new AquaSaber());
		animaList.add(new ArcaneLance());
		animaList.add(new BoltAxe());
		animaList.add(new Channel());
		animaList.add(new Fire());
		animaList.add(new FireClaw());
		animaList.add(new Flamethrower());
		animaList.add(new Forblaze());
		animaList.add(new WindBow());
		animaList.add(new Thunder());

		darkList.add(new Channel());
		darkList.add(new DarkClaw());
		darkList.add(new DevilAxe());
		darkList.add(new Oathbow());
		darkList.add(new Flux());
		darkList.add(new ShadowBlade());
		darkList.add(new Portal());
		darkList.add(new SunDial());

		lightList.add(new DivineShield());
		lightList.add(new Sunlance());
		lightList.add(new HolyClaw());
		lightList.add(new LightBrand());
		lightList.add(new Shine());
		lightList.add(new SunDial());

		bowList.add(new DualBowgun());
		bowList.add(new HuntersGear());
		bowList.add(new IronBow());
		bowList.add(new IronGear());
		bowList.add(new Oathbow());
		bowList.add(new SteelBow());
		bowList.add(new WindBow());

		shieldList.add(new DivineShield());
		shieldList.add(new Forblaze());
		shieldList.add(new SpikedShield());
		shieldList.add(new IronShield());
		shieldList.add(new Portal());
		shieldList.add(new WallOfSwords());

		clawList.add(new DarkClaw());
		clawList.add(new FireClaw());
		clawList.add(new HolyClaw());
		clawList.add(new Knuckleduster());
		clawList.add(new SpikedShield());
		clawList.add(new IronRake());
		clawList.add(new SharpClaw());

		gunList.add(new Bayonet());
		gunList.add(new DualBowgun());
		gunList.add(new Flamethrower());
		gunList.add(new IronGun());

	}

	public void generateNewUnitStats() {
		blatStats();
		Random r = new Random();
		generateBases(r);
		generateGRs(r);
		generateCaps(r);
		chooseWeapon(r);

		if (strGr <= 30 && strCap > 21) {
			generateNewUnitStats();
		}
		if (skillCap > speedCap && skillGr < speedGr) {
			generateNewUnitStats();
		}
		if ((defGr > 45 || resGr > 45) && hpGr < 40) {
			generateNewUnitStats();
		}
		if (resGr < speedGr && speedCap < resCap) {
			generateNewUnitStats();
		}
		if (defGr < speedGr && speedCap < defCap) {
			generateNewUnitStats();
		}
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

	public CustomUnitGenerator(String leastCommonWeapon) {
		fillWeaponLists();
		populateArmory(leastCommonWeapon);
		generateNewUnitStats();
	}

	public Custom buildUnit() {
		Custom custom = new Custom(weapon, baseHP, strBase, skillBase, speedBase, luckBase, defBase, resBase, hpGr,
				strGr, skillGr, speedGr, luckGr, defGr, resGr, strCap, speedCap, skillCap, defCap, resCap);
		return custom;
	}

	private void blatStats() {
		baseHP = 0;
		strBase = 0;
		skillBase = 0;
		speedBase = 0;
		luckBase = 0;
		defBase = 0;
		resBase = 0;
		strCap = 0;
		skillCap = 0;
		speedCap = 0;
		defCap = 0;
		resCap = 0;
		hpGr = 0;
		strGr = 0;
		skillGr = 0;
		speedGr = 0;
		luckGr = 0;
		defGr = 0;
		resGr = 0;
	}

	public void generateBases(Random r) {

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

	public void chooseWeapon(Random r) {
		int weaponIndex = r.nextInt(armory.size());
		weapon = armory.get(weaponIndex);
	}

	private void generateCaps(Random r) {

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

	private void generateGRs(Random r) {

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

		if (sumGRs != 320) {
			generateGRs(r);
		}
	}

	public void printNewClass() {
		System.out.println();
		System.out.println("import geneticEmblem.units.factory.Unit;" + '\n');
		System.out.println("import geneticEmblem.weapons.*;" + '\n');
		System.out.println("public class XXX extends Unit { " + '\n');
		System.out.println("public XXX() {" + '\n');
		System.out.println("    this.setJob();" + '\n');
		System.out.println("    this.setWeapon(new " + weapon.getName() + "());");
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
	}

	public void populateArmory(String mostCommonWeapon) {
		if (mostCommonWeapon.equals("Axe")) {
			armory.addAll(swordList);
			armory.addAll(gunList);
		} else if (mostCommonWeapon.equals("Sword")) {
			armory.addAll(lanceList);
		} else if (mostCommonWeapon.equals("Lance")) {
			armory.addAll(axeList);
			armory.addAll(gunList);
		} else if (mostCommonWeapon.equals("Dark")) {
			armory.addAll(lightList);
			armory.addAll(gunList);
		} else if (mostCommonWeapon.equals("Light")) {
			armory.addAll(animaList);
		} else if (mostCommonWeapon.equals("Anima")) {
			armory.addAll(darkList);
		} else if (mostCommonWeapon.equals("Claw")) {
			armory.addAll(bowList);
		} else if (mostCommonWeapon.equals("Shield")) {
			armory.addAll(clawList);
		} else if (mostCommonWeapon.equals("Bow")) {
			armory.addAll(shieldList);
		} else if (mostCommonWeapon.equals("Gun")) {
			armory.addAll(animaList);
			armory.addAll(lightList);
			armory.addAll(shieldList);
		}
	}
}
