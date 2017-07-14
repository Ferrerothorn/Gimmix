package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Vanessa extends Unit {

	public Vanessa() {
		this.setJob("Vanessa");
		this.setWeapon(new IronLance());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(7);
		this.setSpeedBase(11);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(35);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(20);
		this.setResGr(30);

		this.setStrCap(24);
		this.setSkillCap(27);
		this.setSpeedCap(29);
		this.setDefCap(23);
		this.setResCap(23);
	}

}