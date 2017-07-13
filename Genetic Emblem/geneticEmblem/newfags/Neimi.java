package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Neimi extends Unit {

	public Neimi() {
		this.setJob("Neimi");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(0);
		this.setStrGr(0);
		this.setSkillGr(0);
		this.setSpeedGr(0);
		this.setLuckGr(0);
		this.setDefGr(0);
		this.setResGr(0);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(24);
	}
}