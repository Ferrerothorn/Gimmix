package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Tana extends Unit {

	public Tana() {
		this.setJob("Tana");
		this.setWeapon(new IronLance());
		this.setTrait("Mounted");
		this.setTrait("Flying");
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(11);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(6);

		this.setHpGr(65);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(65);
		this.setLuckGr(60);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}

}