package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Cormag extends Unit {

	public Cormag() {
		this.setJob("Cormag");
		this.setWeapon(new IronLance());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(1);
		this.setDefBase(10);
		this.setResBase(2);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(25);
		this.setResGr(15);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(28);
		this.setResCap(22);
	}

}