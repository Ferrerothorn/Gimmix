package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new IronSword());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(5);
		this.setSkillBase(10);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(35);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(23);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(22);
	}

}
