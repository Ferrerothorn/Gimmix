package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Gerik extends Unit {

	public Gerik() {
		this.setJob("Gerik");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(90);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(30);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}

}