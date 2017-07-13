package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Hayden extends Unit {

	public Hayden() {
		this.setJob("Hayden");
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
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(23);
	}

}