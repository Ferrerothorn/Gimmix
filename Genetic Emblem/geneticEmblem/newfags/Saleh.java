package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Saleh extends Unit {

	public Saleh() {
		this.setJob("Saleh");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(50);
		this.setStrGr(30);
		this.setSkillGr(25);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}