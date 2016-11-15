package geneticEmblem.units.factory;

import java.util.ArrayList;
import java.util.Iterator;
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

	Weapon weapon;

	private void addEachWeapon() {
		armory.add(new IronSword());
		armory.add(new LightBrand());
		armory.add(new ShadowBlade());
		armory.add(new Greatsword());
		armory.add(new FireSword());
		armory.add(new IronLance());
		armory.add(new IronRake());
		armory.add(new PumpkinLance());
		armory.add(new IronAxe());
		armory.add(new PoleAxe());
		armory.add(new Saw());
		armory.add(new Fire());
		armory.add(new WindBow());		
		armory.add(new Flux());
		armory.add(new DarkClaw());
		armory.add(new Lightning());
		armory.add(new HolyArrow());
		armory.add(new HuntersGear());
		armory.add(new IronBow());
		armory.add(new SteelBow());
		armory.add(new WindBow());
		armory.add(new IronShield());
		armory.add(new IronGun());
		armory.add(new DualBowgun());
		armory.add(new Knuckleduster());
		armory.add(new IronDagger());
		armory.add(new IronClaw());
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

		if (sumCaps != 130) {
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

	public String generateCode(double stDev) {
		return ("" + '\n' + "import geneticEmblem.units.factory.Unit;" + '\n' + "import geneticEmblem.weapons.*;" + '\n'
				+ '\n' + "public class " + stDev + " extends Unit { " + '\n' + '\n' + "public " + stDev + "() {" + '\n'
				+ '\n' + "    this.setJob(\"" + stDev + "\");" + '\n' + "    this.setWeapon(new " + weapon.getName()
				+ "());" + '\n' + "    this.setHpBase(" + baseHP + ");" + '\n'
				+ "    this.setCurrentHp(this.getHpBase());" + '\n' + "    this.setStrBase(" + strBase + ");" + '\n'
				+ "    this.setSkillBase(" + skillBase + ");" + '\n' + "    this.setSpeedBase(" + speedBase + ");"
				+ '\n' + "    this.setLuckBase(" + luckBase + ");" + '\n' + "    this.setDefBase(" + defBase + ");"
				+ '\n' + "    this.setResBase(" + resBase + ");" + '\n' + '\n' + "    this.setHpGr(" + hpGr + ");"
				+ '\n' + "    this.setStrGr(" + strGr + ");" + '\n' + "    this.setSkillGr(" + skillGr + ");" + '\n'
				+ "    this.setSpeedGr(" + speedGr + ");" + '\n' + "    this.setLuckGr(" + luckGr + ");" + '\n'
				+ "    this.setDefGr(" + defGr + ");" + '\n' + "    this.setResGr(" + resGr + ");" + '\n' + '\n'
				+ "    this.setStrCap(" + strCap + ");" + '\n' + "    this.setSkillCap(" + skillCap + ");" + '\n'
				+ "    this.setSpeedCap(" + speedCap + ");" + '\n' + "    this.setDefCap(" + defCap + ");" + '\n'
				+ "    this.setResCap(" + resCap + ");" + '\n' + "    }" + '\n' + "}" + '\n');
	}

	public void populateArmory(String mostCommonWeapon) {
		addEachWeapon();
		if (mostCommonWeapon.equals("Melee")) {
			purge(armory, "Melee");
		} else if (mostCommonWeapon.equals("Bow")) {
			purge(armory, "Bow");
		} else if (mostCommonWeapon.equals("Magic")) {
			purge(armory, "Magic");
		} else if (mostCommonWeapon.equals("Stealth")) {
			purge(armory, "Stealth");
		} else if (mostCommonWeapon.equals("Seafare")) {
			purge(armory, "Seafare");
		} 
	}

	private void purge(ArrayList<Weapon> armory2, String string) {
		Iterator<Weapon> iter = armory2.iterator();
		
		while (iter.hasNext()) {
			Weapon w = iter.next();
			
			if (w.getTrinity().equals(string)) {
				iter.remove();
			}
		}
		
	}
}
