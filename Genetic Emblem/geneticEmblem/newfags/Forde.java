package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Forde extends Unit {

	public Forde() {
		this.setJob("Forde");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}