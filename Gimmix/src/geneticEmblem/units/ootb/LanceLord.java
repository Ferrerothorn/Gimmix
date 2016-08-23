package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class LanceLord extends Unit {

	public LanceLord() {
		this.setJob("Lance Lord");
		this.setWeapon(new IronLance());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(50);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}
}
