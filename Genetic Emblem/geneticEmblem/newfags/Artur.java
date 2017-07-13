package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Artur extends Unit {

	public Artur() {
		this.setJob("");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}

}