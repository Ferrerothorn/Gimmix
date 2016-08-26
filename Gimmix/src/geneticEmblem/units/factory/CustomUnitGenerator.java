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
	Weapon weapon;
	
	public void generateNewUnitStats() {
		blatStats();
		Random r = new Random();
		generateBases(r);
		generateGRs(r);
		generateCaps(r);
		chooseWeapon(r);

		if (strGr <= 30 && strCap > 21 ) {
			generateNewUnitStats();
		}
		if ( skillCap > speedCap && skillGr < speedGr ){
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
		System.out.println("import geneticEmblem.units.ootb.Unit;" + '\n');
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

	public void populateArmory(String leastCommonWeapon) {
		if (leastCommonWeapon.equals("Axe")) {
			armory.add(new IronAxe());
			armory.add(new PoleAxe());
			armory.add(new BoltAxe());
		} else if (leastCommonWeapon.equals("Sword")) {
			armory.add(new IronSword());
			armory.add(new IronGear());
			armory.add(new SteelSword());
			armory.add(new WallOfSwords());
			armory.add(new LightBrand());
			armory.add(new Bayonet());
			armory.add(new ShadowBlade());
		} else if (leastCommonWeapon.equals("Lance")) {
			armory.add(new IronLance());
			armory.add(new IronRake());
			armory.add(new Sunlance());
			armory.add(new PoleAxe());
		} else if (leastCommonWeapon.equals("Dark")) {
			armory.add(new Flux());
			armory.add(new Portal());
			armory.add(new ShadowBlade());
			armory.add(new Oathbow());
		} else if (leastCommonWeapon.equals("Light")) {
			armory.add(new LightBrand());
			armory.add(new Shine());
			armory.add(new Sunlance());
		} else if (leastCommonWeapon.equals("Anima")) {
			armory.add(new Fire());
			armory.add(new Thunder());
			armory.add(new BoltAxe());
			armory.add(new FireClaw());
			armory.add(new Flamethrower());
		} else if (leastCommonWeapon.equals("Claw")) {
			armory.add(new SharpClaw());
			armory.add(new FireClaw());
			armory.add(new IronRake());
		} else if (leastCommonWeapon.equals("Shield")) {
			armory.add(new DivineShield());
			armory.add(new IronShield());
			armory.add(new WindBow());
			armory.add(new Portal());
			armory.add(new WallOfSwords());
		} else if (leastCommonWeapon.equals("Bow")) {
			armory.add(new SteelBow());
			armory.add(new IronBow());
			armory.add(new WindBow());
			armory.add(new IronGear());
			armory.add(new Oathbow());
		} else {
			armory.add(new IronGun());
			armory.add(new Bayonet());
			armory.add(new Flamethrower());
		}
	}

}
