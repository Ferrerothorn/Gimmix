package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Neimi extends Unit {

	public Neimi() {
		this.setJob("Neimi");
		this.setWeapon(new IronLance());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(55);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(35);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(24);
	}
}