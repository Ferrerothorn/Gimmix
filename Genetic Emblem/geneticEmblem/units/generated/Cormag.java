package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Cormag extends Unit {

	public Cormag() {
		this.setJob("Cormag");
		this.setWeapon(new IronLance());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(1);
		this.setDefBase(10);
		this.setResBase(1);

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