package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Farina extends Unit {

	public Farina() {
		this.setJob("Farina");
		this.setWeapon(new IronLance());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(10);
		this.setLuckBase(6);
		this.setDefBase(8);
		this.setResBase(9);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(25);
		this.setResGr(30);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}
}