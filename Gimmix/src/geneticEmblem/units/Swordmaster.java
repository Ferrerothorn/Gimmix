package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Swordmaster extends Unit {

	public Swordmaster() {
		this.setJob("Swordmaster");
		this.setWeapon(new SteelSword());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(15);

		this.setStrBase(7);
		this.setSkillBase(10);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(22);
		this.setResGr(28);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}
}
