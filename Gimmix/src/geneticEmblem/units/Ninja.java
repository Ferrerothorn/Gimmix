package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Ninja extends Unit {

	public Ninja() {
		this.setJob("Ninja");
		this.setWeapon(new IronShuriken());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(9);
		this.setLuckBase(9);
		this.setDefBase(5);
		this.setResBase(6);

		this.setHpGr(55);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(20);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(39);
		this.setDefCap(21);
		this.setResCap(27);
	}

}
