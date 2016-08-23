package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Noble extends Unit {

	public Noble() {
		this.setJob("Noble");
		this.setWeapon(new IronSword());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(35);
		this.setStrGr(60);
		this.setSkillGr(30);
		this.setSpeedGr(80);
		this.setLuckGr(35);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(24);
		this.setSkillCap(24);
		this.setSpeedCap(23);
		this.setDefCap(28);
		this.setResCap(28);
	}
}