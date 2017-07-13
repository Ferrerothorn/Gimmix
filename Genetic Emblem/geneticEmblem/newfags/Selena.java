package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Selena extends Unit {

	public Selena() {
		this.setJob("Selena");
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
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(20);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}

}