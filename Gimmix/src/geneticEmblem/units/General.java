package geneticEmblem.units;

import Weapons.IronLance;

public class General extends Unit {

	public General() {
		this.setJob("General");
		this.setWeapon(new IronLance());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(9);
		this.setSkillBase(8);
		this.setSpeedBase(5);
		this.setLuckBase(4);
		this.setDefBase(9);
		this.setResBase(1);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(30);
		this.setDefGr(50);
		this.setResGr(15);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(25);
		this.setDefCap(29);
		this.setResCap(26);
	}

}
