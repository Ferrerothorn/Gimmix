package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Ephraim extends Unit {

	public Ephraim() {
		this.setJob("Ephraim");
		this.setTrait("Mounted");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(10);
		this.setLuckBase(7);
		this.setDefBase(6);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(45);
		this.setLuckGr(50);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(23);
		this.setResCap(23);
	}

}