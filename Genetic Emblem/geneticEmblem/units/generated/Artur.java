package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Artur extends Unit {

	public Artur() {
		this.setJob("Artur");
		this.setWeapon(new IronLance());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(2);
		this.setDefBase(2);
		this.setResBase(5);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}

}