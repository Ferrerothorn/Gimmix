package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Valter extends Unit {

	public Valter() {
		this.setJob("Valter");
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
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(15);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(28);
		this.setDefCap(24);
		this.setResCap(22);
	}

}