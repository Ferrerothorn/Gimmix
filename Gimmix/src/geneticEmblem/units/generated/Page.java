package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Page extends Unit {

	public Page() {

		this.setJob("Page");

		this.setWeapon(new IronSword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(8);
		this.setResBase(4);

		this.setHpGr(75);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(22);
	}
}