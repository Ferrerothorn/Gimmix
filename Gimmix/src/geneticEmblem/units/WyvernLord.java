package geneticEmblem.units;

import Weapons.IronLance;

public class WyvernLord extends Unit {

	public WyvernLord() {
		this.setJob("Wyvern Lord");
		this.addTrait("Flying");
		this.setWeapon(new IronLance());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(10);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(3);
		this.setDefBase(9);
		this.setResBase(1);

		this.setHpGr(70);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(33);
		this.setDefGr(50);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(28);
		this.setResCap(22);
	}

}
