package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SilverLance;

public class Brom extends Unit {

	public Brom() {
		this.setJob("Brom");
		this.setWeapon(new SilverLance());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(9);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(25);
		this.setLuckGr(20);
		this.setDefGr(55);
		this.setResGr(25);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(25);
	}
}