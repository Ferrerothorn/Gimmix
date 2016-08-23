package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class WyvernLord extends Unit {

	public WyvernLord() {
		this.setJob("Wyvern Lord");
		this.addTrait("Flying");
		this.setWeapon(new IronLance());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(8);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(50);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(28);
		this.setResCap(23);
	}

}
