package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class AxeLord extends Unit {

	public AxeLord() {
		this.setJob("Axe Lord");
		this.setWeapon(new IronAxe());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(9);
		this.setResBase(2);

		this.setHpGr(75);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(20);
	}

}
