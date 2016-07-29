package geneticEmblem.units;

import Weapons.IronBow;

public class Sniper extends Unit {

	public Sniper() {
		this.setJob("Sniper");
		this.setWeapon(new IronBow());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(15);

		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(3);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(35);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(24);
	}

}
