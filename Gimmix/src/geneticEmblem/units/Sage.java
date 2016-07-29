package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Sage extends Unit {

	public Sage() {
		this.setJob("Sage");
		this.setWeapon(new Thunder());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(2);
		this.setResBase(6);

		this.setHpGr(45);
		this.setStrGr(66);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(47);
		this.setDefGr(22);
		this.setResGr(45);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}
