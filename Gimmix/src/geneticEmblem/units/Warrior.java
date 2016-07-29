package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Warrior extends Unit {

	public Warrior() {
		this.setJob("Warrior");
		this.setWeapon(new IronAxe());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(82);
		this.setStrGr(55);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(22);
	}
}
