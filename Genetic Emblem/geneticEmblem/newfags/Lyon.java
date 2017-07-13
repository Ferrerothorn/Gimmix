package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Lyon extends Unit {

	public Lyon() {
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

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(55);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(30);
		this.setResCap(30);
	}

}