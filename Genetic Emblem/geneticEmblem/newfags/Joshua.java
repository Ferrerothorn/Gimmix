package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Joshua extends Unit {

	public Joshua() {
		this.setJob("Joshua");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(11);
		this.setSpeedBase(12);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(35);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}

}