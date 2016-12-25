package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Jill extends Unit {

	public Jill() {
		this.setJob("Jill");
		this.setWeapon(new IronLance());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(4);
		this.setDefBase(9);
		this.setResBase(0);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(25);
		this.setDefGr(35);
		this.setResGr(30);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(25);
	}
}