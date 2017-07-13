package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Moulder extends Unit {

	public Moulder() {
		this.setJob("Moulder");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(20);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}