package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Ephraim extends Unit {

	public Ephraim() {
		this.setJob("Ephraim");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(45);
		this.setLuckGr(50);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(23);
		this.setResCap(23);
	}

}