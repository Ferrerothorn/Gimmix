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

	ArrayList<Weapon> armory = new ArrayList<>();

	ArrayList<Weapon> weaponList = new ArrayList<>();

	Weapon weapon;

	private void fillWeaponLists() {
		armory.add(new IronLance());
		armory.add(new Rapier());
		armory.add(new IronAxe());
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

	public CustomUnitGenerator() {
		fillWeaponLists();
		populateArmory();
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
		// int sumBases = strBase + skillBase + speedBase + luckBase + defBase +
		// resBase;

		// if (sumBases != 37) {
		// generateBases(r);
		// }
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

		if (sumCaps < 123 || sumCaps > 135) {
			generateCaps(r);
		}

	}

	private void generateGRs(Random r) {

		hpGr = r.nextInt(10);
		hpGr += 9;
		hpGr *= 5;
		strGr = r.nextInt(9);
		strGr += 5;
		strGr *= 5;
		skillGr = r.nextInt(8);
		skillGr += 5;
		skillGr *= 5;
		speedGr = r.nextInt(10);
		speedGr += 4;
		speedGr *= 5;
		luckGr = r.nextInt(11);
		luckGr += 3;
		luckGr *= 5;
		defGr = r.nextInt(10);
		defGr += 2;
		defGr *= 5;
		resGr = r.nextInt(9);
		resGr += 3;
		resGr *= 5;
		int sumGRs = hpGr + strGr + skillGr + speedGr + luckGr + defGr + resGr;

		if (sumGRs < 250 || sumGRs > 375) {
			generateGRs(r);
		}
	}

	public String generateCode(double stDev) {
		return ("package geneticEmblem.units.generated;" + '\n' + '\n' + "import geneticEmblem.units.factory.Unit;"
				+ '\n' + "import geneticEmblem.weapons.*;" + '\n' + '\n' + "public class " + stDev + " extends Unit { "
				+ '\n' + '\n' + "public " + stDev + "() {" + '\n' + '\n' + "    this.setJob(\"" + stDev + "\");" + '\n'
				+ "    this.setWeapon(new " + weapon.getName() + "());" + '\n' + "    this.setHpBase(" + baseHP + ");"
				+ '\n' + "    this.setCurrentHp(this.getHpBase());" + '\n' + "    this.setStrBase(" + strBase + ");"
				+ '\n' + "    this.setSkillBase(" + skillBase + ");" + '\n' + "    this.setSpeedBase(" + speedBase
				+ ");" + '\n' + "    this.setLuckBase(" + luckBase + ");" + '\n' + "    this.setDefBase(" + defBase
				+ ");" + '\n' + "    this.setResBase(" + resBase + ");" + '\n' + '\n' + "    this.setHpGr(" + hpGr
				+ ");" + '\n' + "    this.setStrGr(" + strGr + ");" + '\n' + "    this.setSkillGr(" + skillGr + ");"
				+ '\n' + "    this.setSpeedGr(" + speedGr + ");" + '\n' + "    this.setLuckGr(" + luckGr + ");" + '\n'
				+ "    this.setDefGr(" + defGr + ");" + '\n' + "    this.setResGr(" + resGr + ");" + '\n' + '\n'
				+ "    this.setStrCap(" + strCap + ");" + '\n' + "    this.setSkillCap(" + skillCap + ");" + '\n'
				+ "    this.setSpeedCap(" + speedCap + ");" + '\n' + "    this.setDefCap(" + defCap + ");" + '\n'
				+ "    this.setResCap(" + resCap + ");" + '\n' + "    }" + '\n' + "}" + '\n');
	}

	public void populateArmory() {
		armory.addAll(weaponList);
	}
}