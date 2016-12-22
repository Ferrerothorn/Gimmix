package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Gilliam extends Unit {

	public Gilliam() {
		this.setJob("Gilliam");
		this.setWeapon(new IronLance());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(2);
		this.setLuckBase(2);
		this.setDefBase(7);
		this.setResBase(2);

		this.setHpGr(90);
		this.setStrGr(45);
		this.setSkillGr(35);
		this.setSpeedGr(30);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(25);
	}

}