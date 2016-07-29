package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Paladin extends Unit {

	public Paladin() {
		this.setJob("Paladin");
		this.setWeapon(new IronLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(50);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}
