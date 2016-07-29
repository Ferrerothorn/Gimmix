package geneticEmblem.units;

import Weapons.Divine;

public class Bishop extends Unit {

	public Bishop() {
		this.setJob("Bishop");
		this.setWeapon(new Divine());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(60);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}
}
